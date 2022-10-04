package com.lms.ui.stepDefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lms.ui.base.LmsBase;
import com.lms.ui.pageObjects.BatchPage;
import com.lms.ui.pageObjects.HomePage;
import com.lms.ui.pageObjects.LoginPage;
import com.lms.ui.pageObjects.ProgramPage;
import com.lms.ui.pageObjects.UserPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramSteps extends LmsBase {
	BatchPage batchPage;
	LoginPage loginPage;
	HomePage homePage;
	ProgramPage programPage;
	UserPage manageUserPage;

	// Add NewProgram

	@Given("User is on Program page")
	public void user_is_on_program_page() {
		loginPage = new LoginPage();
		homePage = new HomePage();
		batchPage = new BatchPage();
		manageUserPage = new UserPage();
		programPage = new ProgramPage();
		
		System.out.println("User is on Program page");

	}

	@When("User clicks A New Program button")
	public void user_clicks_a_new_program_button() {
		programPage.ClickOnNewProgram();
	}

	@Then("User lands on Program Details form")
	public void user_lands_on_program_details_form() {
		String expectedtitle1 = "LMS";
		String actualtitle1 = driver.getTitle();
		Assert.assertEquals("Condition true", actualtitle1, expectedtitle1);
	}

	@When("User enters name as {string} in text box")
	public void user_enters_name_as_in_text_box(String newpro) throws InterruptedException {
		Thread.sleep(2000);
		programPage.EnternewProgram(newpro);

	}

	@Then("User can see Name entered")
	public void user_can_see_name_entered() {
		System.out.println("Program Name entered");
	}

	@When("User enters desc as {string} in text box")
	public void user_enters_desc_as_in_text_box(String desc) {
		programPage.enterProdescription(desc);
		programPage.ClickActiveStatus();

	}

	@Then("User can see Description entered")
	public void user_can_see_description_entered() {
		System.out.println("Descreption entered ");
	}

	@When("User clicks Save button")
	public void user_clicks_save_button() {
		programPage.ClickonSaveButton();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {
		String expectedtitle1 = "LMS";
		String actualtitle1 = driver.getTitle();
		Assert.assertEquals("Condition true", actualtitle1, expectedtitle1);
		System.out.println("Program created Successfullly");

	}
	// EDIT PROGRAM

	@When("User clicks on Program Edit button")
	public void user_clicks_on_Program_edit_button() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("User clicks on Edit button");

	}

	@When("User edits Name and selects the Save button")
	public void user_edits_Name_and_selects_the_save_button(String pro) throws InterruptedException {
		Thread.sleep(2000);
		programPage.ProgramEditButton();
		programPage.ClearProgram();
		programPage.EnternewProgram(pro);
		programPage.ClickinInActiveStatus();
		Thread.sleep(3000);
		programPage.ClickonSaveButton();
	}
		@Then("User can see successfull Program Updated message")
		public void user_can_see_successfull_Program_Updated_message(String string) {
		    System.out.println("Program Updated");
		   
		}
	

	// Search Program

	@When("User enters  {string} into search box.")
	public void user_enters_into_search_box(String name) {
		programPage.searchButton();

	}

	@Then("Entries for name phrase are shown")
	public void entries_for_name_phrase_are_shown() {
//		programPage.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("inactive");
//		sp.ClearProgram();
//		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("Program");
//		sp.ClearProgram();
//		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("active");
//		sp.ClearProgram();
//		sp.ldriver.findElement(By.xpath("//input[@type='text']")).sendKeys("TestProgram1");
//		sp.ClearProgram();

	}

	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {

	}

	@When("User is on first page of Manage Program")
	public void user_is_on_first_page_of_manage_program() throws Exception {
		Thread.sleep(3000);
		programPage.FirstEnterieButton();

	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
		List<WebElement> elements = driver.findElements(By.tagName("button"));
		for (int i = 0; i < elements.size(); i++) {
			String title = elements.get(i).getAttribute("title");
			if (title.equals("Next Page")) {
				elements.get(i).click();
				break;
			}
		}

	}

//
	@When("User clicks left navigate > button")
	public void user_clicks_left_navigate_button() throws Exception {
		Thread.sleep(2000);
		programPage.leftNavigationArrow();
		List<WebElement> button = driver.findElements(By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']"));
		System.out.println("------>" + button.size());
		for (int i = 0; i < button.size(); i++) {
			System.out.println("===============" + button.get(i).getText());
			if ("1".equals(button.get(i).getText())) {
				button.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}

	}

//
	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String string) {
		programPage.SecondtEnterieButton();

	}

	@When("User clicks right navigate < button")
	public void user_clicks_right_navigate_button() {
		programPage.rightNavigationArrow();

	}

	// Delete Program

	@When("User clicks on Delete button")
	public void user_clicks_on_delete_button() {
		programPage.DeleteselectedProgram();

	}

	@Then("User lands on Confirm Deletion form")
	public void user_lands_on_confirm_deletion_form() {
		System.out.println("User lands on Confirm Deletion form");

	}

	@When("User clicks yes button")
	public void user_clicks_yes_button() {

		programPage.ClickYesButton();

	}

	@Then("User can see Successful Program Deleted message")
	public void user_can_see_Successful_Program_Deleted_message(String string) {
		System.out.println("Program deleted Successfully");

	}

	@When("User clicks <No> button")
	public void user_clicks_no_button() {
		programPage.DeleteselectedProgram();
		programPage.ClickNoButton();

	}

	@Then("User can see confirm deletion form disappears")
	public void user_can_see_confirm_deletion_form_disappears() {
		System.out.println("User can see Confirm Deletion form disappears");

	}

	@When("User clicks on <Delete> button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() throws InterruptedException {
		Thread.sleep(2000);
		programPage.ClickCheckbox();
		programPage.DeleteselectedProgram();
		programPage.ClickYesButton();
		programPage.DeleteselectedProgram();
		programPage.ClickNoButton();

	}

	// ascending and descending order

	@Given("User is on the Program  page")
	public void user_is_on_the_program_page() {
		System.out.println("User is on the Program  page");
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Program name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_name() throws InterruptedException {

		List<WebElement> button = driver.findElements(By.xpath("//span[@class='p-paginator-icon pi pi-angle-left']"));
		System.out.println("------>" + button.size());
		for (int i = 0; i < button.size(); i++) {
			System.out.println("===============" + button.get(i).getText());
			if ("1".equals(button.get(i).getText())) {
				button.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
		programPage.Programascend();

	}

	@Then("User can see the results in Ascending order of Program name")
	public void user_can_see_the_results_in_ascending_order_of_program_name() {

		System.out.println("User can see the results in Ascending order of Program name");

	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Program Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_program_description() {
		programPage.ProgramDescriptionAscend();
	}

	@Then("User can see the results in Descending order of Program name")
	public void user_can_see_the_results_in_descending_order_of_program_name() {
		programPage.ProgramStatusAcend();

	}

}
