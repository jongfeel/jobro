package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //URL을 컨트롤러의 메소드와 매핑
public class DemoController {
	
	@GetMapping("/demo") //Http get 요청을 특정 핸들러 메소드에 맵핑 . requestMapping의 축약된 annotation
	public String demo() {
		return "Hello, Spring boot Project!";
	}
}
