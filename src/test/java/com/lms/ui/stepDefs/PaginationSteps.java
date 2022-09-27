//import org.junit.Assert;
//
//import com.lms.ui.base.LmsBase;
//import com.lms.ui.pageObjects.HomePage;
//import com.lms.ui.pageObjects.LoginPage;
//import com.lms.ui.pageObjects.ManageUserPage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

//package com.lms.ui.stepDefs;
//
//
//import com.lms.ui.base.LmsBase;
//import com.lms.ui.pageObjects.HomePage;
//import com.lms.ui.pageObjects.LoginPage;
//import com.lms.ui.pageObjects.ManageUserPage;
//import com.lms.ui.util.LmsUtil;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class PaginationSteps extends LmsBase {
//
//	LoginPage loginPage;
//	ManageUserPage manageUserPage;
//	HomePage homePage;
//
//	@Before
//	public void setUp() throws InterruptedException {
//		loginPage = new LoginPage();
//		manageUserPage = new ManageUserPage();
//		homePage = new HomePage();
//	}

	/* 
	Scenario: Verify the presence of pagination
    Given User is on any page after Login
	When 	User is on the Manage user page after clicking User Tab
    Then 	User should see the pagination controls below data table
    */
	
	// TTT- Given is being served from ManageUserSteps

//	@When("User is on the Manage user page after clicking User Tab")
//	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws InterruptedException {
//	homePage.clickUsertab();
//	}
//
//	@Then("User should see the pagination controls below data table")
//	public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
//		manageUserPage.locatePaginationControl();
//	}
//	
//	/*
//	Scenario: Verify the Pagination control with less rows
//	    Given 	User is on Manage user page
//	    When 	Manage user table has less less than or equal to 5 rows
//	    Then 	Pagination control should be disabled
//	*/
//
//	@Given("User is on Manage user page")
//	public void user_is_on_manage_user_page() {
//
//		// No Test Required...The user is already on the manage user Page...
//	}
//
//	@When("Manage user table has less less than or equal to {int} rows")
//	public void manage_user_table_has_less_less_than_or_equal_to_rows(int int5) {
//		
//	}
//
//	@Then("Pagination control should be disabled")
//	public void pagination_control_should_be_disabled() throws InterruptedException {
//		
//	}
//	
//	/*
//	 Scenario: Verify the Pagination control with more than 5 rows
//	    Given 	User is on Manage user page
//	    When 	Manage user table has more than 5 rows
//	    Then 	Pagination control should be enabled
//	*/
//
//	/// TTT- user_is_on_manage_user_page 
//	
//	@When("Manage user table has more than {int} rows")
//	public void manage_user_table_has_more_than_rows(int rows) throws InterruptedException {
//		//by default the page doesn't have more than 5 so we have to add one more.
//		LmsUtil.scroll(driver, 0, -350);
//		manageUserPage.add_New_user();
//		
//	}
//
//	@Then("Pagination control should be enabled")
//	public void pagination_control_should_be_enabled() throws InterruptedException {
//	}
//
//	public void tearDown() throws InterruptedException{
//		driver.quit();
//	}
	
//}




/////manageuserpage webelements

//@FindBy(xpath = "//div[contains(text(), 'Manage User')]")
//	WebElement title;
//
//	@FindBy(xpath = "//div[@class ='p-paginator-bottom p-paginator p-component ng-star-inserted0')]")
//	WebElement pagination;
//	@FindBy(xpath = "//span[@class ='p-paginator-icon pi pi-angle-double-left']")
//	WebElement leftAngularbtn;
//	@FindBy(xpath = "//span[contains(text(),'Add New User')]")
//	WebElement addNewuserBtn;
//	@FindBy(xpath = "//input[contains(text(), 'firstName')]")
//	WebElement fName;
//	@FindBy(xpath = "//input[contains(text(), 'lastName')]")
//	WebElement lName;
//	@FindBy(xpath = "//input[@data-placeholder='Email address']")
//	WebElement email;
//	@FindBy(xpath = "//input[@data-placeholder='Phone no']")
//	WebElement phone;
//	@FindBy(xpath = "//input[@data-placeholder='Batch']")
//	WebElement batch;
//	@FindBy(xpath = "//input[@data-placeholder='Skill']")
//	WebElement skill;
//	@FindBy(xpath = "//span[contains(text(),'Submit')]")
//	WebElement submitBtn;


////Manageuser page object using pagefactory
//public String Locate_userPagetitle() {
//		PageFactory.initElements(driver, this);
//		return title.getText();
//	}
//
//	public void locatePaginationControl() throws InterruptedException {
//		String paginatorDisplay = null;
//		PageFactory.initElements(driver, this);
// 		paginatorDisplay = pagination.toString();
//		System.out.println("Element displayed is :" + paginatorDisplay);
//
//	}
//
//	public void pagination_control_disabled() throws InterruptedException {
//
//		// leftAngularbtn.isEnabled();
//		// System.out.println("Element displayed is :" + paginatorDisplay);
//
//	}
//
//	public void add_New_user() {
//		//PageFactory.initElements(driver, this);
//		addNewuserBtn.click();
//	}
//}




	
/////////////////////////////////////////////////// Manage user page steps
	
//	public class ManageUserSteps extends LmsBase {
//		LoginPage loginPage;
//		ManageUserPage manageUserPage;
//		HomePage homePage ;
//		
//		@Given("User is on any page after Login")
//		public void user_is_on_any_page_after_login() throws InterruptedException {
//			loginPage = new LoginPage();
//			manageUserPage = new ManageUserPage();
//			homePage = new HomePage();
//		}
//
//		@When("User clicks the Tab User")
//		public void user_clicks_the_tab_user() {
//			homePage.clickUsertab();
//		}
//
//		@Then("User should see the Manage user page")
//		public void user_should_see_the_manage_user_page() {
//			
//		    String title = manageUserPage.Locate_userPagetitle();
//			Assert.assertEquals(title, "Manage User");
//		}
//	@When("User is on the Manage user page after clicking User Tab")
//	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws InterruptedException {
//		homePage.clickUsertab();
//	}
//
//	@Then("User should see the pagination controls below data table")
//	public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
//		manageUserPage.locatePaginationControl();
//	}
//	
//	/*
//	Scenario: Verify the Pagination control with less rows
//	    Given 	User is on Manage user page
//	    When 	Manage user table has less less than or equal to 5 rows
//	    Then 	Pagination control should be disabled
//	*/
//
//	@Given("User is on Manage user page")
//	public void user_is_on_manage_user_page() {
//
//		// No Test Required...The user is already on the manage user Page...
//	}
//
//	@When("Manage user table has less less than or equal to {int} rows")
//	public void manage_user_table_has_less_less_than_or_equal_to_rows(int int5) {
//		
//	}
//
//	@Then("Pagination control should be disabled")
//	public void pagination_control_should_be_disabled() throws InterruptedException {
//		
//	}
//	
//	/*
//	 Scenario: Verify the Pagination control with more than 5 rows
//	    Given 	User is on Manage user page
//	    When 	Manage user table has more than 5 rows
//	    Then 	Pagination control should be enabled
//	*/
//
//	/// TTT- user_is_on_manage_user_page 
//	
//	@When("Manage user table has more than {int} rows")
//	public void manage_user_table_has_more_than_rows(int rows) throws InterruptedException {
//		//by default the page doesn't have more than 5 so we have to add one more.
//		manageUserPage = new ManageUserPage();
//		manageUserPage.add_New_user();
//		
//	}
//
//	@Then("Pagination control should be enabled")
//	public void pagination_control_should_be_enabled() throws InterruptedException {
//	}
//
//	public void tearDown() throws InterruptedException{
//		driver.quit();
//	}
//}

