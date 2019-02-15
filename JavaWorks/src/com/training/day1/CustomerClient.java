package com.training.day1;

public class CustomerClient {
	public static void main(String[] args) {
		// reference 
		Customer mike;
		// instance 
		mike = new Customer(); 
		
		// 3rd parth 
		mike.setCustomerId(101); 
		Name customerName = new Name(); 

		customerName.setfName("Micheal");
		customerName.setlName("Janco");
		
		mike.setCustomerName(customerName);
		mike.setCustomerIncome(20000);
		
		// business logic 
		
		// output 
		System.out.println(mike); // mike.toString()
	}
}
