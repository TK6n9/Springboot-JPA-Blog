package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.cos 이하를 스캔해서 모든파일에 뉴하는것은 아니고 특정어노테이션이 붙어있는 클래스 파일들을 뉴해서  ioc에서 관리해준다
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
