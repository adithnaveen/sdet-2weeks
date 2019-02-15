package com.training.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	private WebDriver driver ;
	
	public GenericMethods(WebDriver driver) {
		this.driver = driver; 
	}
	/**
	 * 
	 * @param locator
	 * @param type
	 * @see type id, name, className, xpath, linkText, partialLinkText
	 *     locators will be an entry from the DOM
	 * @return WebElement  
	 */
	
	public WebElement getElement(String locator, String type) {
		WebElement element = null; 
		type = type.toLowerCase(); 
		
		if(type.equals("id")) {
			element = driver.findElement(By.id(locator)); 
		}else if(type.equals("name")) {
			element = driver.findElement(By.name(locator)); 
		}else if(type.equals("xpath")) {
			element = driver.findElement(By.xpath(locator)); 
		}else if(type.equals("class")) {
			element = driver.findElement(By.className(locator)); 
		}
		
		if(checkSingleEntry(locator, type)) {
			return element; 
		}
		
		System.out.println("Returning element type : " + type);
		return null; 
		
	}
	
	
	public List<WebElement> getElementAsList(String locator, String type){
		type = type.toLowerCase(); 
		
		if(type.equals("id")) {
			return driver.findElements(By.id(locator)); 
		}else if(type.equals("name")) {
			return driver.findElements(By.name(locator));
		}else if(type.equals("xpath")) {
			return driver.findElements(By.xpath(locator));
		}else if(type.equals("class")) {
			return driver.findElements(By.className(locator));
		}
		// other elements can go here
		return null; 
	}
	
	// return true if exists and the size is 1
	public boolean checkSingleEntry(String locator, String type) {
		return getElementAsList(locator, type).size()==1; 
	}
	
	// to check element exists or not 
	public boolean isElementFound(String locator, String type) {
		return getElementAsList(locator, type).size()>0;
	}
	
}
