package com.training.selenium.pom;

import static com.training.utilities.Basics.sleep;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.training.generics.GenericMethods;
import com.training.pom.BKIPOM;
import com.training.pom.BKIPOM1;
import com.training.utilities.DriverFactory;
import com.training.utilities.DriverNames;
import com.training.utilities.ScreenShot;
import com.training.utilities.WaitTypes;

public class LoginPOMTest {


	private String baseUrl;
	private WebDriver driver;
	private ScreenShot screenshot;
	private BKIPOM bkiPom; 
	private BKIPOM1 bkiPom1; 
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = "https://fnmaloansphereinvoicinguat.bkfsconnect.com/public/Login/NewWayLogin.aspx";
		screenshot = new ScreenShot(driver);
		this.bkiPom = new BKIPOM(driver);
		this.bkiPom1 = new BKIPOM1(driver); 
	}

	@After
	public void tearDown() {
		sleep(3000);
		driver.close();
	}

	@Ignore
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		 
		bkiPom.sendCompanyCode("wfbknim");
		bkiPom.sendUserName("g9ursa");
		bkiPom.sendPassword("Feb_2019");
		
		bkiPom.clickLoginBtn();
		
	}

	@Test
	public void login1Test1() {
		driver.get(baseUrl);
		
		bkiPom1.sendCompanyCode("wfbknim");
		bkiPom1.sendUserName("g9ursa");
		bkiPom1.sendPassword("Feb_2019");
		bkiPom1.clickSubmitButton();
		
	}


}
