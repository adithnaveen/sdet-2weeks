package com.training.selenium.works;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest01 {
	public static void main(String[] args) {
		
		String baseUrl = "https://www.google.com/"; 
		WebDriver driver = null; 
		
		// TODO 1. load the driver
		System.setProperty("webdriver.chrome.driver", 
					"C:\\SDET Works\\driver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 
		
		
		// TODO 2. open the browser
		driver.get(baseUrl);
		driver.findElement(By.name("q")).sendKeys("testing");
		sleep(2000); 
		
		driver.findElement(By.id("gbqfbb")).click(); 

		
		sleep(2000); 

		// TODO 4. close the browser 
		driver.close(); 
	}

	private static void searchGoogle(WebDriver driver) {
		// TODO 3. Perform job
		System.out.println(driver.getCurrentUrl()); 
		WebElement element=  driver.findElement(By.name("q")); 
		element.sendKeys("places to visit near me");
		
		// given a delay 
//		sleep(3000); 
//		
//		WebElement submitBtn = driver.findElement(By.name("btnK")); 
//		submitBtn.click(); 
		
		element.submit(); 
		
		sleep(3000);
	}

	private static void sleep(int i) {

		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
