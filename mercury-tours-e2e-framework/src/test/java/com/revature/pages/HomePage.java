package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
//	@FindBy(xpath = "//input[@name='userName']")
//	private WebElement usernameInput;
//	
//	@FindBy(name = "password")
//	private WebElement passwordInput;
//	
//	@FindBy(name = "submit")
//	private WebElement submitButton;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
//		PageFactory.initElements(driver, this);
	}
	
	public WebElement usernameInput() {
		// return this.usernameInput;
		return this.driver.findElement(By.xpath("//input[@name='userName']"));
	}
	
	public WebElement passwordInput() {
//		return this.passwordInput;
		return this.driver.findElement(By.name("password"));
	}
	
	public WebElement submitButton() {
//		return this.submitButton;
		return this.driver.findElement(By.name("submit"));
	}
	
	public WebElement unsuccessfulLoginElement() {
		return this.driver.findElement(By.xpath("//span[contains(text(), 'Enter your userName and password correct')]"));
	}
	
}
