package com.db.entity;

public class Customer {
	private int custId; 
	private String custName; 
	private double custIncome; 
	private String custEmail;
	

	public Customer() {}
	
	public Customer(int custId, String custName, double custIncome, String custEmail) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custIncome = custIncome;
		this.custEmail = custEmail;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custIncome=" + custIncome + ", custEmail="
				+ custEmail + "]";
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getCustIncome() {
		return custIncome;
	}
	public void setCustIncome(double custIncome) {
		this.custIncome = custIncome;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	} 
	
	
}