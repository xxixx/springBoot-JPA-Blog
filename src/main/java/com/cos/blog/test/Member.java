package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class Member {
	private  String username;
	private  int id;
	private  String password;
	private  String email;
}
	
	

