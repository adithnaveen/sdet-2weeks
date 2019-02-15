package com.training.day1.inhe;

public class InheClient {
	public static void main(String[] args) {
		Savings s1 = new Savings(); 
		s1.setAccountNo(101);
		s1.deposit(100);
		s1.deposit(100);
		s1.deposit(100);
		s1.deposit(100);
		
		System.out.println("Balance for : "  + s1.getAccountNo() +", is " + 
					s1.getBalance());
		
		s1.withdraw(150);
		

		System.out.println("Balance for : "  + s1.getAccountNo() +", is " + 
					s1.getBalance());
		
		FixedDeposit fd = new FixedDeposit(); 
		
	}
}
