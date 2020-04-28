package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	
	@GetMapping("/greeting")
	public String getGreeting() {
		return "Hello From Server";
	}
}
