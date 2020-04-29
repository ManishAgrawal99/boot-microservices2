package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class BaseController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/greeting")
	public String getGreeting() {
		return "Hello From Server";
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	
	
}
