package com.training.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	private static WebDriver driver; 
	
	public static WebDriver getDriver(String driverName) {
		if(driverName.equals(DriverNames.CHROME)) {
			System.setProperty(Driver.CHROME, Driver.CHROME_PATH); 
			driver = new ChromeDriver(); 
			
		}else if(driverName.equals(DriverNames.IE)) {

			DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); 
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, false);
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);

			System.setProperty(Driver.IE, Driver.IE_PATH32);
			
			
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		
		return driver; 
	}
}
