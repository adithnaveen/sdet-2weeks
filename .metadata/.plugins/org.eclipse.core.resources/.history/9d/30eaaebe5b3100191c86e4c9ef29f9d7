package com.training.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.generics.GenericMethods;

public class WaitTypes {
	private WebDriver driver ; 
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	// we shall have methods which will return the web element 
	// on demand of explicit waits 
	
	public WebElement presenceElementLocated(By locator, long maxTimeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, maxTimeOut); 
			
			WebElement element = wait.until(ExpectedConditions.
						presenceOfElementLocated(locator)); 
			System.out.println("Element located ");
			return element; 
		}catch(Exception e) {
			// you can also do partial deligation or create your custom exception 
			System.out.println("Element  not found, for reason " + e);
		}
		return null;
	}
	
	public WebElement visibilityOfElementLocated(By locator, long maxTimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeOut); 

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
		System.out.println("Element located ");
		return element; 
		
	}
	
	public WebElement clickableElement(By locator, long maxTimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeOut); 
		WebElement element  = wait.until(ExpectedConditions.elementToBeClickable(locator)); 
		
		return element; 
	}


	
	public WebElement clickableElement(String locator, String type, long maxTimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeOut); 
		GenericMethods genMethods = new GenericMethods(driver); 

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable
				(genMethods.getElement(locator, type))); 
		
		return element; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
