Feature: Ordering product
Scenario:
	Ordering product from snapdeal application with valid credentials
	Given open browser
	When enter url of the application
	Then get title of the current page
	Then click on sign button and click on login button
	Then enter valid email or mobile number
	Then click on continue button
	And enter valid password and click on login button
	Then home page is displayed
	Then click on Electronics present in All categories module
	Then click on Smart tv present in television section
	Then select any product
	
	