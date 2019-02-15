package com.training.day1;


//the class which has private variables 
	// public getters and setters 
	// default constructor  ()
	// are called bean 
	
public class Customer {
	private int customerId; 
	private Name customerName; 
	private double customerIncome;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	

	public Name getCustomerName() {
		return customerName;
	}
	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}
	
	
	public double getCustomerIncome() {
		return customerIncome;
	}
	public void setCustomerIncome(double customerIncome) {
		if(customerIncome< 10000) {
			System.out.println("Sorry min income 10k");
			this.customerIncome = 10000; 
		}else {
			this.customerIncome = customerIncome;
		}
	}
	@Override
	public String toString() {
		return this.customerId +", " + 
				this.customerName +", " + 
				this.customerIncome; 
	} 
	

	

	
	
	
}
