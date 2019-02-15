# this is my comment 

@Sanity @Base
Feature: This feature is for testing saction of loan with validation credit score 

Background: 
	Given the browser is open 

Scenario Outline: 
	Given the username and password 
	And the SSN number 		 
	When the credit score of user is "<creditscore>" 
	Then keep the loan on "<status>"
	
Examples: 
|		creditscore			|			status			|
|		  450						|			rejected		|
|			556						|			hold				|
|			654						|			approved		|
|			711						|			approved		|