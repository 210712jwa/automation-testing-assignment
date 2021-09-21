package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	private WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement loginSuccessfulHeader() {
		return this.driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	}
	
	public WebElement signoffButton() {
		return this.driver.findElement(By.linkText("SIGN-OFF"));
	}
	
}
