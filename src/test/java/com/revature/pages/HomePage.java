package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement usernameInput() {
		return this.driver.findElement(By.name("userName"));
	}
	
	public WebElement passwordInput() {
		return this.driver.findElement(By.name("password"));
	}
	
	public WebElement submitButton() {
		return this.driver.findElement(By.name("submit"));
	}
	
	public WebElement unsuccessfulLoginElement() {
		return this.driver.findElement(By.xpath("//span[contains(text(), 'Enter your userName and password correct')]"));
	}
	
}
