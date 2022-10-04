package com.lms.ui.stepDefs;

import org.junit.Assert;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LmsBase {
	

	LoginPage loginPage;
	
	@Before
	public void setUp() {
		loginPage = new LoginPage();
	}
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
//		loginPage = new LoginPage();
		initialization();
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		openUrl(url);
	}

	@Then("User should see the Login page")
	public void user_should_see_the_login_page() {
		String title = loginPage.locateLogin();
		Assert.assertEquals(title,"LMS");
	}

	@When("User clicks the Login button after entering invalid password {string}")
	public void user_clicks_the_login_button_after_entering_invalid_password(String passWd) throws InterruptedException {
		loginPage.enter_Password(passWd);
		loginPage.clickLoginButton();
	}

	@Then("User should receive the message {string}")
	public void user_should_receive_the_message(String msg) throws InterruptedException {
		String pageAlert=loginPage.getLoginAlert();
		Assert.assertEquals(pageAlert, msg);
	}

	@When("User clicks the Login button after entering invalid username {string}")
	public void user_clicks_the_login_button_after_entering_invalid_username(String uName) throws InterruptedException {
		loginPage.clearPasswd();
		Thread.sleep(2000);
		loginPage.enter_UserName(uName);
		//loginPage.clickLoginButton();
	}
	
	@When("User clicks the Login button after entering valid username {string} and password {string}")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password(String uName, String passWd) throws InterruptedException {
		loginPage.enter_UserName(uName);
		loginPage.enter_Password(passWd);
		loginPage.clickLoginButton();
	}

	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
		String logPgTxt = loginPage.LocateHomePage();
		Assert.assertEquals(logPgTxt, "LMS - Learning Management System");
	}
}
