package com.training.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * 
	Scenario: 
		Given the username and password 
		And the SSN number 		 
		When the credit score of user is 450 
		Then keep the loan on hold 
	
 *
 */
public class CreditScoreStep {

	@Given("the username and password")
	public void the_username_and_password() {
		System.out.println("Given user name and passwrod...");
	}
	
	@And("the SSN number")
	public void the_SSN_number() {
		System.out.println("the SSN number.....");
	}
	
	@When("the credit score of user is \"(\\d+)\"")
	public void the_credit_score_of_user_is_amount(int creditScore) {
		System.out.println("the credit score of user is "+creditScore+".....");
	}


	@Then("keep the loan on \"([a-zA-Z0-9]{1,})\"")
	public void keep_the_loan_on_hold(String loanStatus) {
		System.out.println("keep the loan on  " + loanStatus.toUpperCase());
	}

}




