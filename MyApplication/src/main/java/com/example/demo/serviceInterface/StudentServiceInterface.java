package com.example.demo.serviceInterface;

import com.example.demo.model.Student;

public interface StudentServiceInterface {
	
	Student saveStudent(Student student);
	
	Student fetchStudentById(String id);
	
}
