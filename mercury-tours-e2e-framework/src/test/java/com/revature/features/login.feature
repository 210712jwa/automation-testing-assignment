Feature: Login

	@smoke
	Scenario: Successful Login
		Given I am on the homepage
		When I type into the username input the value "mercury"
		And I type into the password input the value "mercury"
		And I click the submit button
		Then I should be on the landing page and see a header with the text "Login Successfully"
	
	@smoke
	Scenario: Unsuccessful Login
		Given I am on the homepage
		When I type into the username input the value "abcd123"
		And I type into the password input the value "abcd123"
		And I click the submit button
		Then I should be on the home page and see an element with the text "Enter your userName and password correct"