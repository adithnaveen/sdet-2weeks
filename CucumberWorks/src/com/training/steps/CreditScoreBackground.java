package com.training.steps;

import cucumber.api.java.en.Given;

public class CreditScoreBackground {
	
	@Given("the browser is open")
	public void the_browser_is_open() {
		System.out.println("******the browser is open ******");
	}
}
