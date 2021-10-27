package com.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

	public static void main(String[] args) throws InterruptedException {

		// step 1 : formulate a test url
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/linux/chromedriver";

		// step 2 : set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step 3 : instantiate selenium webdriver
		WebDriver driver = new ChromeDriver();

		// step 4 : launch browser
		driver.get(siteUrl);

		// step 5 : evaluate test
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 12 max pro");
		searchBox.submit();
		
		String expected = "Amazon.in : Iphone 12 max pro";
		String actual = driver.getTitle();
		if (expected.equals(actual)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is Failed !");
		}

		Thread.sleep(3000);
		// step 6 : close browser
		driver.close();

	}

}
