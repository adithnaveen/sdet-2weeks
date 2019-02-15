package com.training.selenium.works;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import static com.training.utilities.Basics.sleep;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoStore {

	String baseUrl;
	WebDriver driver = null;

	@Before
	public void setUp() {
		// TODO 1. load the driver
		System.setProperty("webdriver.ie.driver",
					"C:\\SDET Works\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl = "https://demostore.x-cart.com/";
	}

	@After
	public void tearDown() {
		sleep(2000);
		driver.close();
	}

	@Test
	public void demoTest() {
		driver.get(baseUrl);

		driver.findElement(By.linkText("Shipping")).click();
		sleep(2000); 
		
		driver.findElement(By.partialLinkText("Contact")).click();
		sleep(2000); 
		
		driver.findElement(By.id("name")).sendKeys("testing");
		driver.findElement(By.id("email")).sendKeys("testing@testing.com");
		driver.findElement(By.id("subject")).sendKeys("testing subject");
		driver.findElement(By.id("message")).sendKeys("sample message");
	}

	
	@Ignore
	@Test
	public void navigatePagesTest() {
		String url1 ="https://www.yahoo.com/"; 
		String url2  ="http://fanniemae.com/portal/index.html"; 
		String url3 = "https://www.google.com/"; 
		
		driver.get(url1);
		
		display();
		
		driver.navigate().to(url2);
		
		sleep(3000); 
		display();
		
		System.out.println("Refrenshing..... ");
		driver.navigate().refresh(); 
		
		driver.navigate().back(); 
		display();
		
		driver.navigate().to(url3);
		display();
		System.out.println(driver.getPageSource());
	}

	private void display() {
		String currentURL;
		String currentTitle;
		System.out.println("--------------------------------");
		
		currentURL = driver.getCurrentUrl(); 
		currentTitle = driver.getTitle(); 
		
		System.out.println("Currenet URL " + currentURL);
		System.out.println("Current Title " + currentTitle);
	}
}













