package com.training.day2.abs;

public class Client {
	
	
	
	public static void main(String[] args) {
		
		Loan [] loans = new Loan[4]; 

		loans[0] = new PersonalLoan("Harry", "Granite Pwky", 444); 
		loans[1] = new HomeLoan("Ravi", "Halter Ln", 555);  
		loans[2] = new PersonalLoan("Srini", "stevenscreek blvd", 666); 
		loans[3] = new HomeLoan("Tina", "American DreamWay", 678);
		
		BusinessLogic bl = new BusinessLogic(); 
		
		bl.issueLoan(loans);
		
	}
}
