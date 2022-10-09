package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

@Entity //User 클래스가 Mysql에 테이블이 생성이 된다.
public class User {
    @Id //Primary key
    @GeneratedValue (strategy = GenerationType.IDENTITY)//프로젝트에 연결된 데이터베이스를 따라간다.
	private int id;
	@Column(nullable = false, length =20) //null이 되지 않게 하고 길이를 20자이상하지 않게 한다.
	private String username;
	@Column(nullable = false, length =100)//비밀번호 hash 암호화할경우 길이
	private String password ;
	@Column(nullable = false, length =20) 
	private String email ;
	@ColumnDefault("'user'")//기본값을 사용하게ㅐ
	private String role;//Enum 을 쓰는게 좋다 //admin,user,write(권한적용할때)
	@CreationTimestamp //시간 자동 입력
	private Timestamp createDate ;
	
	
}
