package com.lms.ui.stepDefs;

import org.junit.Assert;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.HomePage;
import com.lms.ui.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends LmsBase{
	HomePage homepage;
	LoginPage loginPage;
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		loginPage = new LoginPage();
		homepage = new HomePage();
		System.out.println("User is on the browser");
	}
	@When("User landed on the Home page after logging into the LMS website")
	public void user_landed_on_the_home_page_after_logging_into_the_lms_website() throws InterruptedException {
		System.out.println("User is on the home page");
		Thread.sleep(2000);
	}
	@Then("verify that title of the page is {string}")
	public void verify_that_title_of_the_page_is(String string) {
		homepage = new HomePage();
		String Title = homepage.verifyTitle();
		Assert.assertEquals(Title,"LMS - Learning Management System");
	}
	@Then("User should see a button with program text {string} on the menu bar")
	public void user_should_see_a_button_with_program_text_on_the_menu_bar(String string) {
		String ProgramTitle = homepage.verifyProgramTab();
		Assert.assertEquals(ProgramTitle,"Program");
	}
	@Then("User should see a button with batch text {string} on the menu bar")
	public void user_should_see_a_button_with_batch_text_on_the_menu_bar(String string) {
		String BatchTitle = homepage.verifyBatchTab();
		Assert.assertEquals(BatchTitle,"Batch");
	}
	@Then("User should see a button with user text {string} on the menu bar")
	public void user_should_see_a_button_with_user_text_on_the_menu_bar(String string) {
		String userTitle = homepage.verifyUserTab();
		Assert.assertEquals(userTitle,"User");
	}
	@Then("User should see a button with assignment text {string} on the menu bar")
	public void user_should_see_a_button_with_assignment_text_on_the_menu_bar(String string) {
		String assignmentTitle = homepage.verifyAssignmentTab();
		Assert.assertEquals(assignmentTitle,"Assignment");
	}
	@Then("User should see a button with attendance text {string} on the menu bar")
	public void user_should_see_a_button_with_attendance_text_on_the_menu_bar(String string) {
		String attendanceTitle = homepage.verifyAttendanceTab();
		Assert.assertEquals(attendanceTitle,"Attendance");
	}
	@Then("User should see a button with logout text {string} on the menu bar")
	public void user_should_see_a_button_with_logout_text_on_the_menu_bar(String string) {
		String logoutTitle = homepage.verifyLogoutTab();
		Assert.assertEquals(logoutTitle,"Logout");
	}











}
