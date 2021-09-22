Feature: Logout

	@regression
	Scenario: Successful Logout
		Given I am on the homepage
		When I type into the username input the value "mercury"
		And I type into the password input the value "mercury"
		And I click the submit button
		Then I should be on the landing page and see a header with the text "Login Successfully"
		When I click the sign-off button
		Then I should be back on the homepage