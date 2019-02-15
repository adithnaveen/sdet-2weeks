package com.training.selenium.works;

import static org.junit.Assert.*;
import static com.training.utilities.Basics.sleep; 


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleTest {

	String baseUrl;
	WebDriver driver = null;

	@Before
	public void setUp() {
		// TODO 1. load the driver
		System.setProperty("webdriver.chrome.driver", "C:\\SDET Works\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		baseUrl = "https://www.google.com/";
	}

	@After
	public void tearDown() {
		sleep(2000); 
		driver.close(); 	
	}

	@Test
	public void googleTest() {
		driver.get(baseUrl);
		WebElement element=  driver.findElement(By.name("q")); 
		element.sendKeys("places to visit near me");
		// given a delay 
		 sleep(3000); 

		element.submit(); 
	}

}
