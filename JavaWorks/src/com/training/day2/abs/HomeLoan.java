package com.training.day2.abs;

public class HomeLoan extends Loan {

	public HomeLoan(String name, String address, int creditScore) {
		super(name, address, creditScore);
	}

	@Override
	public void roi() {
		System.out.println("ROI for Home loan is 6.5%");
	}
}
