package com.training.day3.exception;

// if you extend from Exception then it checked exception 
// if you extend from RuntimeException then it un-checked exception
public final class OverSpeedException extends Exception{ 
	private String message; 

	public OverSpeedException() {
		message="You got the ticket because of overspeeding"; 
	}
	
	public OverSpeedException(String message) {
		this.message = message; 
	}
	@Override
	public String toString() {
		return "OverSpeedException [message=" + message + "]";
	}

	@Override
	public String getMessage() {
		return "******"+this.message +"***********" ;
	}
	
	
}
