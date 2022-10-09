package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {
	@GetMapping("/http/get")
	public String  getTest(Member m) {
		
		return "Get요청" +m.getId()+","+m.getUsername();
	}
	@PostMapping("/http/post")
public String  postTest(@RequestBody Member m) {
		
		return "Post요청 :" + m.getId()+","+m.getUsername()+","+m.getEmail()+","+m.getPassword() ;
	}
	@PutMapping("/http/put")
public String  putTest(@RequestBody Member m) {
	
	return "Put요청"+ m.getId()+","+m.getUsername()+","+m.getEmail()+","+m.getPassword() ;
}
	@DeleteMapping("/http/delete")
public String  deleteTest() {
	
	
	return "Delete요청";
}
	
	
	
}
