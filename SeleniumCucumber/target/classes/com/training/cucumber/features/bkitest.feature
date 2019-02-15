@LoginTag 

Feature:  to validate login credentials 


Background: 
	Given the browser chrome is open 

Scenario: 
	Given the details on the screen 
		| companycode	|
		|	 wfbknim		|
	And click on submit button
	When logged in sucessfully 
	Then goto homepage 