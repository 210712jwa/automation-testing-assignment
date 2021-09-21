package com.revature.gluecode;

import static org.testng.Assert.assertEquals;

import com.revature.testrunners.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	
	@Given("I am at the homepage")
	public void i_am_at_the_homepage() {
		TestRunner.driver.get("http://demo.guru99.com/test/newtours/");
	}

	@When("I type into the username input with the value {string}")
	public void i_type_into_the_username_input_with_the_value(String string) {
		TestRunner.homePage.usernameInput().sendKeys(string);
	}

	@When("I type into the password input with the value {string}")
	public void i_type_into_the_password_input_with_the_value(String string) {
		TestRunner.homePage.passwordInput().sendKeys(string);
	}

	@When("I click the submit button")
	public void i_click_the_submit_button() {
		TestRunner.homePage.submitButton().click();
	}

	@Then("I should see the element for unsuccessful login")
	public void i_should_see_the_element_for_unsuccessful_login() {
		String actualText = TestRunner.homePage.unsuccessfulLoginElement().getText();
		actualText = actualText.trim();
		
		assertEquals(actualText, "Enter your userName and password correct");
	}

	@Then("I should see the element for successful login")
	public void i_should_see_the_element_for_successful_login() {
		String actualText = TestRunner.landingPage.loginSuccessfulHeader().getText();
		
		assertEquals(actualText, "Login Successfully");
	}
	
}
