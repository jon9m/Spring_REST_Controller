package com.mmk.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TheRestController {
	// hello end point

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String toRoot() {
//		return "hello world";
		return "{\"message\": \"root\"}";
	}
	
	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello() {
//		return "hello world";
		return "{\"message\": \"hello world\"}";
	}
}
