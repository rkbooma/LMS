package com.lms.ui.stepDefs;

import org.junit.Assert;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.ManageUserPage;
import com.lms.ui.pageObjects.PaginationPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps extends LmsBase {
	
	
		ManageUserPage manageUserPage;
		PaginationPage paginationPage;
		@Before
		public void setUp() {
			manageUserPage = new ManageUserPage();
			paginationPage = new PaginationPage();
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
		public void user_clicks_the_tab_user() throws InterruptedException {
			manageUserPage.clickUsertab();
			
		}

		@Then("User should see the Manage user page")
		public void user_should_see_the_manage_user_page() {
			
		    String title = manageUserPage.Locate_userPagetitle();
			Assert.assertEquals(title, "Manage User");
		}

	//	@When("User is on the Manage user page after clicking User Tab")
		//public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws InterruptedException {
//			initialization();
//			openUrl("https://lms-frontend-phase2.herokuapp.com/");
//			manageUserPage.enter_UserName("LMS");
//			manageUserPage.enter_Password("LMS");
//			manageUserPage.clickLoginButton();
//			manageUserPage.clickUsertab(); 
		//}
//
		@Then("User should see the pagination controls below data table")
		public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
			//paginationPage.locatePaginationControl();
		}

}
