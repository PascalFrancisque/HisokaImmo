package com.edu.realestate.exceptions;

public class AuthenticationException extends Exception {

	public AuthenticationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthenticationException(String message) {
		super("Authenticate" + message);
	}
	
	

}
