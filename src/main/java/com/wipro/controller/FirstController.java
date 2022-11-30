package com.wipro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	
	@RequestMapping("/")
	public String index() {
		
		return "Hello";
		
	}
	@RequestMapping("/city")
	public String city() {
		
		return "My City is Bangalore";
	}

	@RequestMapping("/name")
	public String name() {
		
		return "My Name is Amit";
	}
	
}
