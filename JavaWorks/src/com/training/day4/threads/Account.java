package com.training.day4.threads;

public class Account {
	private int balance; 
	
	// simulating the value would come from DB 
	public Account(int balance) {
		this.balance = balance; 
	}
	
	
	public synchronized void withdraw(int amount) {
		if(amount < balance) {
			// the db transaction 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.balance = this.balance - amount;
			System.out.println("Amount Withdrawn " + amount);
		}else {
			System.out.println("Sorry you dont have the balance to withdraw " + 
					amount +" amount");
		}
		
		System.out.println("You Current Balance is " + this.balance);
	}
	
}
