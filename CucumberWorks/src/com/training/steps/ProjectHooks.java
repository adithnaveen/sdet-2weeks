package com.training.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ProjectHooks {

	@Before(order=1)
	public void loadDriver() {
		System.out.println("*** LOADING DRIVER GOES HERE **** ");
	}
	
	@After
	public void close() {
		System.out.println("**** CLOSING BROWSER *****");
	}
	
	@Before(value="@DBConnection", order=2)
	public void dbConnection() {
		System.out.println("--------------- DB Connection Goes Here-------------");
	}
}
