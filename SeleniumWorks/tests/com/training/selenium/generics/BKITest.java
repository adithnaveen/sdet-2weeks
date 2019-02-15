package com.training.selenium.generics;

import static org.junit.Assert.*;
import static com.training.utilities.Basics.sleep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.generics.GenericMethods;
import com.training.utilities.Driver;
import com.training.utilities.DriverFactory;
import com.training.utilities.DriverNames;
import com.training.utilities.ScreenShot;
import com.training.utilities.WaitTypes;

public class BKITest {

	private String baseUrl = "";
	private WebDriver driver;
	private GenericMethods genericMethods;
	private WaitTypes waitTypes;
	private ScreenShot screenshot;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		genericMethods = new GenericMethods(driver);
		baseUrl = "https://fnmaloansphereinvoicinguat.bkfsconnect.com/public/Login/NewWayLogin.aspx";
		waitTypes = new WaitTypes(driver);
		screenshot = new ScreenShot(driver);
	}

	@After
	public void tearDown() {
		sleep(3000);
		driver.close();
	}

	@Test
	public void bkiTest() {
		driver.get(baseUrl);
		genericMethods.getElement("LoginControl1_txtCompanyCode", "id").clear();
		genericMethods.getElement("LoginControl1_txtCompanyCode", "id").sendKeys("wfbknim");

		genericMethods.getElement("LoginControl1_txtUsername", "id").clear();
		genericMethods.getElement("LoginControl1_txtUsername", "id").sendKeys("g9ursa");

		genericMethods.getElement("LoginControl1_txtPassword", "id").clear();
		genericMethods.getElement("LoginControl1_txtPassword", "id").sendKeys("Feb_2019");

		screenshot.captureScreen();

		genericMethods.getElement("LoginControl1_btnLogin", "id").click();

		// on clicked, it might take some time
		// the call explicit wait on the element
		// no guarantee the object is available immediately
		// SharedApplicationBar1_lblUserInfo

		WebElement userDetails = waitTypes.presenceElementLocated(By.id("SharedApplicationBar1_lblUserInfo"), 20);
		screenshot.captureScreen();
		String retStr = userDetails.getText();

		String userName = "g9ursa";
		assertTrue("String mismatched for " + userName, retStr.contains(userName));

	}

	private WebElement oldCode() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

//		ExpectedConditions.visibilityOf(element)

		WebElement userDetails = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("SharedApplicationBar1_lblUserInfo")));
		return userDetails;
	}

}
