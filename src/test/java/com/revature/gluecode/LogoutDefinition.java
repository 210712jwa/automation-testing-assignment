package com.revature.gluecode;

import static org.testng.Assert.assertEquals;

import com.revature.testrunners.TestRunner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutDefinition {
	
	@When("I click on the signoff button")
	public void i_click_on_the_signoff_button() {		
		TestRunner.landingPage.signoffButton().click();
	}

	@Then("I should see the homepage")
	public void i_should_see_the_homepage() {
		String currentUrl = TestRunner.driver.getCurrentUrl();
		
		assertEquals(currentUrl, "http://demo.guru99.com/test/newtours/index.php");
	}
	
}
