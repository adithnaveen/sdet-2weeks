package com.training.day2.abs;

public class PersonalLoan  extends Loan{


	public PersonalLoan(String name, String address, int creditScore) {
		super(name, address, creditScore);
	}

	@Override
	public void roi() {
		System.out.println("ROI for Personal Loan is 8%");
	}

	
}


