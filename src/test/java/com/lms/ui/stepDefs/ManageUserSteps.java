package com.lms.ui.stepDefs;

import org.junit.Assert;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.LoginPage;
import com.lms.ui.pageObjects.ManageUserPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageUserSteps extends LmsBase {
	LoginPage loginPage;
	ManageUserPage manageUserPage;
	
	@Before
	public void setUp() {
		loginPage = new LoginPage();
		manageUserPage = new ManageUserPage();
	}
	
	
	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() throws InterruptedException {
		initialization();
		openUrl("https://lms-frontend-phase2.herokuapp.com/");
		manageUserPage.enter_UserName("LMS");
		manageUserPage.enter_Password("LMS");
		manageUserPage.clickLoginButton();
	    
	}

	@When("User clicks the Tab User")
	public void user_clicks_the_tab_user() {
		manageUserPage.clickUsertab();
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
		
	    String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");
	}

}
