package com.training.selenium.works;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import static com.training.utilities.Basics.sleep;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

// http://selenium-release.storage.googleapis.com/index.html
public class BKITest {

	String baseUrl;
	WebDriver driver = null;

	@Before
	public void setUp() {
		// TODO 1. load the driver
//		System.setProperty("webdriver.chrome.driver", "C:\\SDET Works\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", "C:\\SDET Works\\driver\\IEDriverServer.exe");

		
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); 
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, false);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);

		System.setProperty("webdriver.ie.driver", "C:\\SDET Works\\driver\\IEDriverServer.exe");
		
		
		driver = new InternetExplorerDriver(caps);
//		driver = new ChromeDriver(); 

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		baseUrl = "https://fnmaloansphereinvoicinguat.bkfsconnect.com/public/Login/NewWayLogin.aspx";
	}

	@After
	public void tearDown() {
		sleep(2000);
		driver.close();
	}

	@Test
	public void bkiTest() {
		driver.get(baseUrl);

		// company code
		driver.findElement(By.id("LoginControl1_txtCompanyCode")).clear();
		driver.findElement(By.id("LoginControl1_txtCompanyCode")).sendKeys("wfbknim");
		// user name
		driver.findElement(By.id("LoginControl1_txtUsername")).clear();
		driver.findElement(By.id("LoginControl1_txtUsername")).sendKeys("g9ursa");
		// password
		driver.findElement(By.id("LoginControl1_txtPassword")).clear();
		driver.findElement(By.id("LoginControl1_txtPassword")).sendKeys("Feb_2019");
		// click submit button
//		driver.findElement(By.id("LoginControl1_btnLogin")).click();
		driver.findElement(By.id("LoginControl1_btnLogin")).sendKeys(Keys.ENTER);
		System.out.println("After click submit ");
		sleep(3000);

		WebElement element = driver.findElement(By.id("SharedApplicationBar1_lblUserInfo"));
		String retStr = element.getText();
		System.out.println(retStr);

		assertTrue(retStr.indexOf("g9ursa") > 0);

		String userName = "g9ursa" ;
		assertTrue("String mismatched for "+ userName, 
					retStr.contains(userName));

	}

}