package com.training.day1.inhe;

public class Account {
	private int accountNo; 
	private double balance; 
	
	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance; 
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount; 
	}

	public Account() {
		System.out.println("Hi i'm Constructor from Account");
		
	}
}
