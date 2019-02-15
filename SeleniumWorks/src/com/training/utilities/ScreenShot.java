package com.training.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot {
	
	private WebDriver driver; 
	
	
	public ScreenShot(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void captureScreen(String fileName) {
		String path ="C:\\SDET Works\\images\\"; 

		try {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path + fileName+".png"));

		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void captureScreen() {
		Date date  = new Date(); 
		String path ="C:\\SDET Works\\images\\";
		int mins = date.getMinutes();   
		long seconds = date.getSeconds(); 
		long hrs = date.getHours(); 
		
		try {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(path + "IMG-" + hrs +"-"+ mins+"-" + seconds +".png"));
		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
