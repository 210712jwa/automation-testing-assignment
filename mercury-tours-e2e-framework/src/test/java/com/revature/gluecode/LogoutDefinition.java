package com.revature.gluecode;

import static org.testng.Assert.assertEquals;

import com.revature.testrunners.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutDefinition {

	@When("I click the sign-off button")
	public void i_click_the_sign_off_button() {
		TestRunner.landingPage.signoffButton().click();
	}

	@Then("I should be back on the homepage")
	public void i_should_be_back_on_the_homepage() {
		String currentUrl = TestRunner.driver.getCurrentUrl();
		
		String expectedCurrentUrl = "http://demo.guru99.com/test/newtours/index.php";
		
		assertEquals(currentUrl, expectedCurrentUrl);
	}
	
}
