package com.training.day3.exception;

public class NameTooSmallException extends Exception{
	String message; 
	
	public NameTooSmallException() {
		this.message = "Name Too Small"; 
	}
	
	public NameTooSmallException(String message) {
		this.message = message; 
	}

	@Override
	public String toString() {
		return "NameTooSmallException [message=" + message + "]";
	}
	
	
}
