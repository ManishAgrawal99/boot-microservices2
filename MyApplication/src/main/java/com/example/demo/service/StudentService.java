package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.serviceInterface.StudentServiceInterface;


@Service
public class StudentService implements StudentServiceInterface {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student fetchStudentById(String id) {
		Student student = studentRepository.findById(id).orElse(null);
		if(student == null) {
			throw new StudentNotFoundException("Student with ID: "+id+" not found");
		}
		return student;
	}
	
	
}
