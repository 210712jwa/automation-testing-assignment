package com.revature.testrunners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.revature.pages.HomePage;
import com.revature.pages.LandingPage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "com.revature.gluecode", 
features = { "src/test/java/com/revature/features/login.feature", 
		"src/test/java/com/revature/features/logout.feature" })
public class TestRunner extends AbstractTestNGCucumberTests {

	public static WebDriver driver;
	public static HomePage homePage;
	public static LandingPage landingPage;
	
	@BeforeMethod
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		TestRunner.driver = new ChromeDriver(options);
		
		TestRunner.homePage = new HomePage(driver);
		TestRunner.landingPage = new LandingPage(driver);
	}
	
	@AfterMethod
	public void quitDriver() {
		TestRunner.driver.quit();
	}
	
}
