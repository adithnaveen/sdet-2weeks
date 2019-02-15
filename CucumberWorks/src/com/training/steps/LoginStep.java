package com.training.steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^the user details$")
	public void the_user_details(DataTable dataTable) throws Throwable {
		System.out.println("The user details>>>>> ");
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class); 

		for(Map<String, String> temp : list) {
			System.out.println("User Name " + temp.get("username"));
			System.out.println("Password " + temp.get("password"));
		}

		
	}

	@When("^credentials are validated$")
	public void credentials_are_validated() throws Throwable {
		System.out.println("Credentials are validated>>>>> ");
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("take user to home page>>>>> ");
	}

}
