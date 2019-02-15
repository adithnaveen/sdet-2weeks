package com.training.selenium.works;

import static org.junit.Assert.*;

import java.util.List;
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
import org.openqa.selenium.support.ui.Select;

public class RadioButtonValidation {

	String baseUrl;
	WebDriver driver = null;

	@Before
	public void setUp() {
		// TODO 1. load the driver
		System.setProperty("webdriver.chrome.driver", "C:\\SDET Works\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl = "http://naveenks.com/selenium/RegForm.html";
	}

	@After
	public void tearDown() {
		sleep(2000);
		driver.close();
	}

	@Ignore
	@Test
	public void radioTest() {
		driver.get(baseUrl);

		WebElement maleElement = driver.findElement(By.id("genderMale")); 
		maleElement.click();
		
		sleep(1000);
		
		WebElement femaleElement =  driver.findElement(By.id("genderFemale")); 
		femaleElement.click();
		
		sleep(1000); 
		
		WebElement transElement = driver.findElement(By.id("genderTrans")); 
		transElement.click();
		
		sleep(1000); 
		
		System.out.println("Male Selected: " +maleElement.isSelected()); 
		System.out.println("Female Selected: " +femaleElement.isSelected()); 
		System.out.println("Trans Selected: " +transElement.isSelected()); 
		
		
		
		
		
		
	}

	
	
	@Test
	public void multiSelectTest() {
		String multiSelectUrl ="https://html.com/attributes/select-multiple/"; 
		driver.get(multiSelectUrl);
		String xpath="//*[@id=\"post-291\"]/div/div[2]/select"; 
		
		Select select = new Select(driver.findElement(By.xpath(xpath))); 
		
		select.selectByValue("American");
		sleep(1000); 

		select.selectByValue("Greater");
		sleep(1000); 
		
		select.deselectByValue("American");
		sleep(1000); 
		
		select.selectByIndex(4);
		
		/*List<WebElement> selectOptions = select.getAllSelectedOptions(); 
		
		for(WebElement temp : selectOptions) {
			System.out.println("Selected are " + temp.getText());
		}*/
		
		select.getAllSelectedOptions().forEach((temp) -> temp.getText());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
