Feature: login

	Scenario: Unsuccessful Login
		Given I am at the homepage
		When I type into the username input with the value "randomusername"
		And I type into the password input with the value "randompassword"
		And I click the submit button
		Then I should see the element for unsuccessful login

	Scenario: Successful Login
		Given I am at the homepage
		When I type into the username input with the value "mercury"
		And I type into the password input with the value "mercury"
		And I click the submit button
		Then I should see the element for successful login