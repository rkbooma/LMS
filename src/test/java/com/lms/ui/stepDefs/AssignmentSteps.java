package com.lms.ui.stepDefs;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.AssignmentPage;
import com.lms.ui.pageObjects.BatchPage;
import com.lms.ui.pageObjects.HomePage;
import com.lms.ui.pageObjects.LoginPage;
import com.lms.ui.pageObjects.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentSteps extends LmsBase {

	 LoginPage loginPage;
	 HomePage homePage;
	 BatchPage batchPage;
	 AssignmentPage assignmentPage;
	 UserPage manageUserPage;
		
	 @Given("User is logged on to LMS Website")
		public void User_is_logged_on_to_LMS_Website() {
		 	loginPage = new LoginPage();
		 	homePage = new HomePage();
			batchPage = new BatchPage();
		 	manageUserPage = new UserPage();
			assignmentPage = new AssignmentPage();
		}
		
		@When("User click on manage assignment page")
		public void user_click_on_manage_assignment_page() throws Exception {
			assignmentPage = new AssignmentPage();
			System.out.println("===Assignment Page===");
		}
		
		@Then("User should see a heading with text {string} on the page")
		public void user_should_see_a_heading_with_text_on_the_page(String actualTitle) {
			System.out.println("User is on Manage Assignment Page");
			assignmentPage.manageAssignmentPage();
			}

	//Search Assignment page
		
	
	@Given("User loged in and User is on Assignment page")
	public void user_loged_in_and_user_is_on_assignment_page() {
		assignmentPage=new AssignmentPage();
	   System.out.println("User is on Assignment Page");
		
	}
	@When("User clicks on search with  name phrase  into search box")
	public void user_clicks_on_search_with_name_phrase_into_search_box() throws InterruptedException {
		assignmentPage=new AssignmentPage();
		assignmentPage.ClickOnSearchTextBox();
		Thread.sleep(2000);
		assignmentPage.enterAsgn1_Name();
		
		
		
	}
	
	@Then("Enteries for name phrase are show")
	public void enteries_for_name_phrase_are_show() throws InterruptedException {
		
	}
	
//Edit Assignment Page
	
	
	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		assignmentPage=new AssignmentPage();
		assignmentPage.ClickOnEditButton();
	}

	@Then("User lands on Assignment Details form")
	public void user_lands_on_assignment_details_form() {
		  System.out.println("User lands on Program Details form.");
	}

	@When("User edits {string} and selects the Save button")
	public void user_edits_and_selects_the_save_button(String name) {

		assignmentPage.ClearAssignment();
		assignmentPage.EnternewAssignment(name);
		assignmentPage.ClickOnSaveButton();
	
		
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) {
		System.out.println("Assignment Updated");
	}
	
	//DeletePage
	
	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
		assignmentPage=new AssignmentPage();
		
	}

	@When("User clicks on Delete button after selecting an assignment")
	public void user_clicks_on_delete_button_after_selecting_an_assignment() {
		assignmentPage.ClickOnDeleteAssignmentBtn();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		System.out.println("User lands on Confirm Deletion form");
	}

	@When("User click No")
	public void user_click_no() throws InterruptedException {
		assignmentPage.ClickOnNoButton();
	}

	@When("User click Yes")
	public void user_click_yes() throws InterruptedException {
		assignmentPage.ClickOnDeleteAssignmentBtn();
		assignmentPage.ClickOnYesBtn();
	   Thread.sleep(2000);
	}

	@Then("User can see Confirm Deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
	  System.out.println("User can see confirm deletion message");
	}

	@When("User clicks on Delete button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		assignmentPage.ClickOnChkBox();
		assignmentPage.ClickOnDeleteAssignmentBtn();
		assignmentPage.ClickOnYesBtn2();
		assignmentPage.ClickOnChkBox();
		assignmentPage.ClickOnCheckBox2();
	    
	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() throws InterruptedException {
		//assignmentPage.ClickOnYesBtn2();
		System.out.println("User clicks Yes button");
		Thread.sleep(2000);
	}
	
	//AccendingDecendingOrder
	//*****************************************
	
	@Given("User is on Assignment Page")
	public void user_is_on_assignment_page1() {
	  System.out.println("User is on Assignment Page");
	  assignmentPage=new AssignmentPage();
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_name() {
		assignmentPage=new AssignmentPage();
		assignmentPage.ClickOnAccendingArrowBtn();
	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
	   System.out.println("User can see the Assignment Name in Ascending order");
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_name() {
		assignmentPage.ClickOnDescArrowBtn();
	}

	@Then("User can see the results in Descending order of Assignment name")
	public void user_can_see_the_results_in_descending_order_of_assignment_name() {
		System.out.println("User can see the Assignment Name in Descending order");
	}



}
