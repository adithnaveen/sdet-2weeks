package com.training.day2.abs;

// immutable class 
public abstract class Loan {
	private String name; 
	private String address; 
	private int creditScore; 
	
	public Loan(String name, String address, int creditScore) {
		super();
		this.name = name;
		this.address = address;
		this.creditScore = creditScore; 
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	public int getCreditScore() {
		return creditScore;
	}

	public abstract void roi(); 
}
