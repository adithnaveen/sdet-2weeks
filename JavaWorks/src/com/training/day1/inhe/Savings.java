package com.training.day1.inhe;

public class Savings extends Account {
	
	private double minBalance;  /// ????
	
	public Savings() {
		super(); 
		System.out.println("Hi I'm Constructor from Savings");
	}
	
	public void withdraw(double amount) {
		if(this.getBalance() <= amount ) {
			System.out.println("Sorry You dont sufficient balance");
		}else {
			this.setBalance(this.getBalance() - amount);
		}
	}
}
