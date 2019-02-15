@Smoke @Base

Feature: for login 

@DBConnection
Scenario: the the user credentials  
	Given the user details 
		| 	username			| 		password 		| 
		|		venkat				| 		testing			|
		|		tripti				| 		hello				|
		|		mike					|			secret			|
	When credentials are validated
	Then take user to home page 