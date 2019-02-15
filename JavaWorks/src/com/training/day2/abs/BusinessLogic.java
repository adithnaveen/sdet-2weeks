package com.training.day2.abs;

public class BusinessLogic {
	
	public void issueLoan(Loan [] loans) {
		
		for(Loan temp : loans) {
			
			System.out.println("-----------------------------------");
			
			
			if(temp.getCreditScore() < 300) {
				System.out.println("Sorry Mr/Ms/Mrs " + temp.getName() +" loan not processed");
			}else if(temp.getCreditScore() >=300 && temp.getCreditScore()<450) {
				System.out.println("We have kept it on hold Mr/Ms/Mrs" + temp.getName());
			}else {
				System.out.println("Please wait for mail, we have processe " + temp.getName());
			}
			
			temp.roi();
		}
	}

	
}
