package com.lms.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.ui.base.LmsBase;

public class PaginationPage extends LmsBase {
	
	@FindBy (xpath = "//span[contains(text(), 'User')]") WebElement user;
	@FindBy (xpath = "//div[contains(text(), 'Manage User')]") WebElement title;
	@FindBy(id = "username") WebElement userName;
	@FindBy(xpath = "//div//input[@id = 'password']") WebElement userPassword;
	@FindBy(xpath = "//span[contains(text(), 'Login')]") WebElement loginBtn;
	
	@FindBy (xpath = "//div[@class ='p-paginator-bottom p-paginator p-component ng-star-inserted')]") WebElement pagination;
	
	public void enter_UserName(String uName) {
		PageFactory.initElements(driver, this);
			
			userName.click();
			userName.sendKeys(uName);
		}

		public void enter_Password(String pwd) throws InterruptedException {
			
			userPassword.click();
			userPassword.sendKeys(pwd);
		}

		public void clickLoginButton() {
			loginBtn.click();
		}
		
		public void clickUsertab() {
			
			
			user.click();
		}
	
	public void locatePaginationControl() throws InterruptedException {
		
		
		Boolean paginatorDisplay = pagination.isDisplayed();
		
		//To print the value
		System.out.println("Element displayed is :" + paginatorDisplay);
		
	}
}
	
