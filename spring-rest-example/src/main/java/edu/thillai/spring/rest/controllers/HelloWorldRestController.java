package edu.thillai.spring.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@GetMapping("/")
	public String helloword() {
		return "HelloWorld !...";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome to Spring Boot World";
	}
	
	@GetMapping("greet/{name}")
	public String greet(@PathVariable String name) {
		return "Hello "+name;
	}
}
