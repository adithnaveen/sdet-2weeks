package com.training.selenium.generics;

import static com.training.utilities.Basics.sleep;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.training.generics.GenericMethods;
import com.training.utilities.DriverFactory;
import com.training.utilities.DriverNames;
import com.training.utilities.ScreenShot;
import com.training.utilities.WaitTypes;

public class ActionClassTest {


	private String baseUrl; 
	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes waitTypes; 
	private ScreenShot screenshot; 
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		genericMethods = new GenericMethods(driver); 
		baseUrl= "https://fnmaloansphereinvoicinguat.bkfsconnect.com/public/Login/NewWayLogin.aspx";
		waitTypes = new WaitTypes(driver); 
		screenshot = new ScreenShot(driver); 
	}
	@After
	public void tearDown() {
		sleep(3000); 
		driver.close();
	}

	
	@Test
	public void viewExistingClaimsTest() {
		driver.get(baseUrl);
		genericMethods.getElement("LoginControl1_txtCompanyCode", "id").clear();
		genericMethods.getElement("LoginControl1_txtCompanyCode", "id")
			.sendKeys("wfbknim");
		
		genericMethods.getElement("LoginControl1_txtUsername", "id").clear();
		genericMethods.getElement("LoginControl1_txtUsername", "id").sendKeys("g9ursa");

		genericMethods.getElement("LoginControl1_txtPassword", "id").clear();
		genericMethods.getElement("LoginControl1_txtPassword", "id").sendKeys("Feb_2019");
		
		screenshot.captureScreen();
		// click submit btn 
		genericMethods.getElement("LoginControl1_btnLogin", "id").click();
		
		// click on invoice processing 
		genericMethods.getElement("btnNewInvoice", "id").click();
		
		Actions menuElement = new Actions(driver); 
		
		String navMenuXpath =".//*[@id='ServicerMenuBar1_MenuControl1_Menu1_32']/tbody/tr/td[2]/nobr"; 
		String menuXpath=".//*[@id='ServicerMenuBar1_MenuControl1_Menu1_78']/tbody/tr/td[2]";
		String subMenuXpath=".//*[@id='ServicerMenuBar1_MenuControl1_Menu1_79']/tbody/tr/td[2]/nobr"; 
		
		menuElement.moveToElement
			(waitTypes.visibilityOfElementLocated
				(By.xpath(navMenuXpath), 20)).
				perform();
		
		menuElement.moveToElement(genericMethods.getElement(menuXpath, "xpath")).perform();
		menuElement.moveToElement(genericMethods.getElement(subMenuXpath, "xpath"))
			.click().perform(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
