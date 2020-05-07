Feature: Help center
Scenario:
	Querying order related issues in Help center page
	Given open browser browser
	When enter the url of the application
	Then get title of current page
	Then click on sign
	Then click on login present in current page
	Then enter valid Email or mobile number
	Then click on continue
	Then enter valid password
	Then click on login
	Then it should direct to home page
	And scroll down to bottom of the home page
	Then Click on Help center 
	Then it navigates to particular page
	When user searches for particular query 
	Then answers related to that query should display 
	