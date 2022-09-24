package com.lms.ui.stepDefs;

import org.junit.After;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.LoginPage;
import com.lms.ui.pageObjects.PaginationPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

    

public class PaginationSteps extends LmsBase  {
	
	LoginPage loginPage;
	PaginationPage paginationPage;
	
	@Before
	public void setUp() throws InterruptedException {
//		manageUserPage = new ManageUserPage();
//		loginPage = new LoginPage();
		paginationPage = new PaginationPage();
		
	}	
	
	@When("User is  on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws InterruptedException {
		initialization();
		openUrl("https://lms-frontend-phase2.herokuapp.com/");
		paginationPage.enter_UserName("LMS");
		paginationPage.enter_Password("LMS");
		paginationPage.clickLoginButton();
		paginationPage.clickUsertab(); 
		
	}

	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
		
		paginationPage.locatePaginationControl();
	}

	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
	    
	}

	@When("Manage user table has less less than or equal to {int} rows")
	public void manage_user_table_has_less_less_than_or_equal_to_rows(Integer int1) {
	    
		
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	    
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
	    
		
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
	    
		
	}

	@When("User cliks next link of pagination")
	public void user_cliks_next_link_of_pagination() {
	    
		
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	    
		
	}

	@Given("last page of User records are displayed")
	public void last_page_of_user_records_are_displayed() {
	    
		
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
	    
		
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
	    
		
	}

	@When("User cliks previous link of pagination")
	public void user_cliks_previous_link_of_pagination() {
	    
		
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
	    
		
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
	    
		
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks << icon in pagination")
	public void user_clicks_previouspage_icon_in_pagination() {
	    
	}

	@Then("User should see the First page of the table")
	public void user_should_see_the_first_page_of_the_table() {
	    
	}

	@When("User clicks >> icon in pagination")
	public void user_clicks_nextpage_icon_in_pagination() {
	    
	}

	@Then("User should see the last page of the table")
	public void user_should_see_the_last_page_of_the_table() {
	    
	}

	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() {
	    
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
	    
	}

	@Then("User should see the text  {string} beow the user table")
	public void user_should_see_the_text_beow_the_user_table(String string) {
	    
		
	}
@After
public void teardown() {
	driver.quit();
}

}
