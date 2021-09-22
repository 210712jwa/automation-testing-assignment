package com.revature.gluecode;

import static org.testng.Assert.assertEquals;

import com.revature.testrunners.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		TestRunner.driver.get("http://demo.guru99.com/test/newtours/index.php");
	}

	@When("I type into the username input the value {string}")
	public void i_type_into_the_username_input_the_value(String string) {
		TestRunner.homePage.usernameInput().sendKeys(string);
	}

	@When("I type into the password input the value {string}")
	public void i_type_into_the_password_input_the_value(String string) {
		TestRunner.homePage.passwordInput().sendKeys(string);
	}

	@When("I click the submit button")
	public void i_click_the_submit_button() {
		TestRunner.homePage.submitButton().click();
	}

	@Then("I should be on the landing page and see a header with the text {string}")
	public void i_should_be_on_the_landing_page_and_see_a_header_with_the_text(String string) {
		String actualH3HeaderText = TestRunner.landingPage.loginSuccessfulHeader().getText().trim();
		
		String expected = string;
		
		assertEquals(actualH3HeaderText, expected);
	}

	@Then("I should be on the home page and see an element with the text {string}")
	public void i_should_be_on_the_home_page_and_see_an_element_with_the_text(String string) {
		String unsuccessfulLoginText = TestRunner.homePage.unsuccessfulLoginElement().getText().trim();
		
		String expected = string;
		
		assertEquals(unsuccessfulLoginText, expected);
	}

}
