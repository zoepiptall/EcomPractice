Feature: Automation Practice Buy Something
	As a User, I wish to make a purchase after logging in to the website
	
	Scenario Outline: Buying something from practice Ecommerce website
		Given a user is at the landing page of automation practice ecommerce
		When a user inputs valide login credentials "<username>" "<password>"
		And submits the information
		And navigates to an item category
		And selects an item to purchase
		Then the user buys the item
		
	Examples:
		| username	| password	|
		| example	| password	|
		