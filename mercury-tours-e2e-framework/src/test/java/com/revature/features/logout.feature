Feature: logout

	Scenario: Successful Logout
		Given I am at the homepage
		When I type into the username input with the value "mercury"
		And I type into the password input with the value "mercury"
		And I click the submit button
		Then I should see the element for successful login
		When I click on the signoff button
		Then I should see the homepage