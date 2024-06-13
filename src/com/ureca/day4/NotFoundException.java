package com.ureca.day4;

public class NotFoundException extends Exception {

	public NotFoundException() {
		this("NotFoundException");
	}

	public NotFoundException(String message) {
		super(message);
	}

	

}
