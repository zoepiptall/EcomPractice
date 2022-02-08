package com.selenium.gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class EcommercePracticeDriver {
	public static WebDriver driver;
	public static final String url = "http://automationpractice.com/index.php";
	
	/*
	 * These annotations are cucumber tag webhooks
	 * they will inject themselves before all of the other tests begin
	 * allows us to create setup and teardown methods
	 */
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}
