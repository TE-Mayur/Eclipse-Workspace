package com.te.exceptions.throwtest;

public class InvalidCredentialsException extends RuntimeException{
	
	public InvalidCredentialsException(String msg) {
		super (msg);
	}

}
