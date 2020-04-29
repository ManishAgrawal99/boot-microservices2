package com.example.demo.exceptions;

public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6434771187459244390L;
	
	public StudentNotFoundException(String message) {
		super(message);
	}

	
}
