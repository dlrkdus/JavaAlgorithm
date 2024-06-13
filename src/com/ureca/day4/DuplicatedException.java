package com.ureca.day4;

public class DuplicatedException extends Exception {

	public DuplicatedException() {
		this("DuplicatedException");
	}

	public DuplicatedException(String message) {
		super(message);
	}

	

}
