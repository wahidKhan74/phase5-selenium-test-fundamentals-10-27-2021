package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHompageSourceUrlTest {

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
		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		System.out.println("Expected Source url : "+siteUrl);
		System.out.println("Actual Source url : "+driver.getCurrentUrl());
		
		// step 6 : close browser
		driver.close();
	}

}
