package com.training.runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"resource/com/training/cucumber/features"}, 
		glue= {"com.training.cucumber.steps"}, 
		monochrome=true, 
		plugin= {"pretty", "json:target/json-reports", "html:target/html-reports"}
//		tags= {"~@Sanity"}
	)
public class TestRunner {
	// this class shall not have any methods 
	// this will act only as place holder 
}
