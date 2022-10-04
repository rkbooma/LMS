package com.lms.ui.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.ui.base.LmsBase;

public class AssignmentPage extends LmsBase{


	@FindBy(xpath = "//span[contains(text(), 'LMS - Learning Management System')]") WebElement loginDisplay;
	@FindBy(xpath = "//span[contains(text(), 'Assignment')]") WebElement clickOnAssignmentTab;
	@FindBy(xpath = "//input[@id = 'username']") WebElement txtEmail;
	@FindBy(xpath = "//div//input[@id = 'password']") WebElement txtpassword;
	@FindBy(xpath = "//button/span[contains(text(), 'Login')]")WebElement loginBtn;
	@FindBy(xpath = "//input[@class = 'p-inputtext p-component']") WebElement searchTextBox;
	@FindBy(xpath = "//input[@class = 'p-inputtext p-component p-filled']") WebElement searchTextBox2;
	@FindBy(xpath = "p-checkbox-icon pi pi-check")WebElement sqlCheckBox;
	@FindBy(xpath = "//span[contains(text(),'A New Assignment')]")WebElement newAssignment;
	@FindBy(xpath ="//span[@class ='p-button-icon pi pi-pencil']") WebElement EditButton;
	@FindBy(xpath = "//input[@id ='assignment' ]")WebElement assignmentName;
	@FindBy(xpath = "//input[@id ='assignmentDescription' ]") WebElement assignmentDesc;
	@FindBy(xpath = "//input[@id ='assignmentGraderId' ]")WebElement assignmentGrade;
	@FindBy(xpath = "//button[@class = 'p-datepicker-trigger ng-tns-c105-183 p-ripple p-button p-component p-button-icon-only ng-star-inserted']")WebElement assignmentDueDate;
	@FindBy(xpath = "//span[contains(text(),'Save')]")WebElement save;
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")WebElement cancel;
 //@FindBy(xpath = "//span[@class = 'p-dialog-header-close-icon ng-tns-c132-180 pi pi-times']")WebElement back
	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")WebElement DeleteAssignmentBtn;
	@FindBy(xpath = "p-button-danger p-button p-component p-button-icon-only")WebElement multipleDeleteBtn;
	@FindBy(xpath = "//span[contains(text(), 'Yes')]")WebElement yesButton;
	@FindBy(xpath = "//span[contains(text(), 'No')]")WebElement noButton;
	@FindBy(xpath = "//div[@role ='checkbox']")WebElement chkBox;
	@FindBy(xpath = "//p-sorticon[@ng-reflect-field = 'assignmentName']")WebElement accendingArrowBtn_assName;
	@FindBy(xpath = "//p-sorticon[@ng-reflect-field = 'description']")WebElement accendingArrowBtn_desc;
	@FindBy(xpath = "//span[contains (text(), 'Confirm']")WebElement confirm;
	@FindBy (xpath = "//span[contains(text(), 'User')]")WebElement user ;
	@FindBy (xpath = "//span[contains(text(), 'Batch')]")WebElement batch ;
	@FindBy (xpath = "//span[contains(text(), 'Program')]")WebElement program ;
	@FindBy (xpath = "//span[@class = 'p-checkbox-icon pi pi-check']")WebElement chkBox2;
	
	public String LocateHomePage() {
		PageFactory.initElements(driver, this);
		return loginDisplay.getText();
	}
	public void User_Assignment() {
		user.click();
	}
	public void click_Batch() {
		batch.click();
	}
	public void click_Program() {
		program.click();
	}
	public void clickAsgn_Tab() {
		PageFactory.initElements(driver, this);
		clickOnAssignmentTab.click();
	}
public void Verify_Confirm_btn() {
		
	confirm.isDisplayed();
	}
	
public String manageAssignmentPage() {
	return driver.getTitle();
	
}

public void setUserName(String uname) {
	txtEmail.clear();
	txtEmail.sendKeys(uname);
}

public void setUserPassword(String pwd) {
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
}

public void clickOnLoginBtn() {
	loginBtn.click();
}

public String getPageTitle() {
	return driver.getTitle();
}

public void ClickOnSearchTextBox() {
	PageFactory.initElements(driver, this);
	searchTextBox.click();
}
public void enterAsgn1_Name() throws InterruptedException {
//	searchTextBox.click();
	searchTextBox.sendKeys("SQL");
	searchTextBox2.clear();
	Thread.sleep(2000);
	searchTextBox.click();
	searchTextBox.sendKeys("Selenium");
	searchTextBox2.clear();
	Thread.sleep(2000);
	searchTextBox.click();
	searchTextBox.sendKeys("Dev");
}

public void enterAsgn2_Name() {
	PageFactory.initElements(driver, this);
	searchTextBox.click();
	searchTextBox.sendKeys("Selenium");
}

public void enterAsgn3_Name() {
	PageFactory.initElements(driver, this);
	searchTextBox2.clear();
	searchTextBox.click();
	searchTextBox.sendKeys("Dev");
}
 public void ClearSQL() {
	   searchTextBox2.clear();
	}
 public void ClickOnCheckBox() {
	 chkBox.click();
	}
 public void ClickOnCheckBox2() {
	 chkBox2.click();
	}
	public void ClickOnNewAssignment() {
		newAssignment.click();
	}
	
	public void EnternewAssignment(String Python) {
		assignmentName.sendKeys(Python);
	}
	
	public void ClearAssignment() {
		assignmentName.clear();
	}
	public void EnternewDesc(String PythonPractic) {
		assignmentDesc.sendKeys(PythonPractic);
	}
	
//	public void EnternewDueDate(Date 5-5-2022) {
//		assignmentDesc.sendKeys(A);
//	}
	public void EnternewGrade(String A) {
		assignmentDesc.sendKeys(A);
	}
	
	public void ClickonSaveButton() {
		save.click();
	}
	public void ClickonCancelButton() {
		cancel.click();
	}
	public void ClickOnEditButton() {
		PageFactory.initElements(driver, this);
		EditButton.click();
	}
	
	public void ClickOnAssignmentName() {
		assignmentName.click();
	}
	public void ClickOnAssignmentDesc() {
		assignmentDesc.click();
		
	}
	public void ClickOnAssignmentGrade() {
		assignmentGrade.click();
	}
	public void ClickOnSaveButton() {
		save.click();
	}
	public void ClickOnCancelButton() {
		cancel.click();
	}
	public void ClickOnDeleteAssignmentBtn() {
		PageFactory.initElements(driver, this);
		DeleteAssignmentBtn.click();
	}
	public void ClickOnMultipleDeleteBtn() {
		multipleDeleteBtn.click();
	}
	public void ClickOnYesBtn() {
		yesButton.click();
		driver.navigate().back();
		driver.navigate().forward();
	}
	public void ClickOnYesBtn2() {
		yesButton.click();
		
	}
	public void ClickOnNoButton() {
		noButton.click();
		}
	public void ClickOnChkBox() {
		chkBox.click();
	}
	public void ClickOnAccendingArrowBtn() {
		PageFactory.initElements(driver, this);
		accendingArrowBtn_assName.click();
		
}
	public void ClickOnDescArrowBtn() {
		PageFactory.initElements(driver, this);
		accendingArrowBtn_desc.click();
	}
}

