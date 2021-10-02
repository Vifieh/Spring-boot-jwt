package com.example.springbootjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("/hello2")
	public String helloworld2() {
		return "Hello World 2";
	}
}
