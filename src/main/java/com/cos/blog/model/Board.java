package com.cos.blog.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)//프로젝트에 연결된 데이터베이스를 따라간다.
		private int id;
		@Column(nullable = false, length =100) 
		private String title;
		@Lob //대용량 데이터
		private String content ; //썸머노트라이브러리
		
		@ColumnDefault("0")
		private int count ;//조회수
		
		//private int userId; //db는 오브젝트를 저장할수 없다.FK, 자바는 오브젝트를 저장할수 있다.
		@ManyToOne(fetch = FetchType.EAGER)//manny 는 board , User = one
		@JoinColumn(name ="userId")
		private User user;
		@OneToMany(mappedBy = "board",fetch = FetchType.EAGER)//mappedBy 연관관계의 주인이아나다(난 FK 가 아니다) db에 컬럼을 만들지 마라
		private List<Reply> reply;
		
		@CreationTimestamp
		private Timestamp createDate;
}
