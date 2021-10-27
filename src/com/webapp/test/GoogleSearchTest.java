package com.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		// step 1 : formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/linux/chromedriver";
		
		// step 2 : set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step 3 : instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		// step 4 : launch browser 
		driver.get(siteUrl);
		
		// step 5 : Evaluate a test
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentation");
		searchBox.submit();
		
		String expectedTitle = "selenium documentation - Google Search";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		// step 6 : close browser
		 driver.close();
	}

}
