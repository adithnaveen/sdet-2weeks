package com.training.cucumber.steps;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.training.selenium.beans.UserDetails;
import com.training.selenium.dao.UserDetailsDAO;
import com.training.selenium.pom.BKIPOM;
import com.training.selenium.utilities.Basics;
import com.training.selenium.utilities.DriverFactory;
import com.training.selenium.utilities.DriverNames;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BKILoginStep {
	private WebDriver driver;
	private BKIPOM bkipom;
	private String url;

	// this is background
	@Given("^the browser chrome is open$")
	public void the_browser_chrome_is_open() throws Throwable {
		url = "https://fnmaloansphereinvoicinguat.bkfsconnect.com/public/Login/NewWayLogin.aspx";
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		bkipom = new BKIPOM(driver);
		driver.get(url);
	}

	@Given("^the details on the screen$")
	public void the_details_on_the_screen(DataTable dataTable) throws Throwable {

		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> temp : list) {
			// send company code, username, password
			bkipom.sendCompanyCode(temp.get("companycode"));
			for (UserDetails userDetail : new UserDetailsDAO().getAllUsers()) {
				bkipom.sendUserName(userDetail.getUserName());
				bkipom.sendPassword(userDetail.getPassword());

				Basics.sleep(1000);
			}

		}

	}

	@And("^click on submit button$")
	public void click_on_submit_button() {
		bkipom.clickLoginBtn();
	}

	@When("^logged in sucessfully$")
	public void logged_in_sucessfully() throws Throwable {
		String retStr = bkipom.getUserDetails().getText();
		String userName = "g9ursa";
		assertTrue("String mismatched for " + userName, retStr.contains(userName));
	}

	@Then("^goto homepage$")
	public void goto_homepage() throws Throwable {
		System.out.println("TODO... ");
	}

	@After
	public void closeBrowser() {
		Basics.sleep(3000);
		driver.close();
	}

}
