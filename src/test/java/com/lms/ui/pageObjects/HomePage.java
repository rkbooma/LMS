package com.lms.ui.pageObjects;

import org.openqa.selenium.By;

import com.lms.ui.base.LmsBase;

public class HomePage extends LmsBase {
	By user = By.xpath("//span[contains(text(), 'User')]");
	By LmsTitle =  By.xpath("//span[contains(text(), 'LMS - Learning Management System ')]");
	By ProgramTab = By.xpath("//span[contains(text(), 'Program')]");
	By BatchTab = By.xpath("//span[contains(text(), 'Batch')]");
	By UserTab = By.xpath("//span[contains(text(), 'User')]");
	By AssignmentTab = By.xpath("//span[contains(text(), 'Assignment')]");
	By AttendanceTab = By.xpath("//span[contains(text(), 'Attendance')]");
	By LogoutTab = By.xpath("//span[contains (text(), 'Logout')]");
	
	
	public String verifyUserTab() {
		 return driver.findElement(user).getText();
	}
	public String verifyTitle() {
		 return driver.findElement(LmsTitle).getText();
	}
	
	public String  verifyProgramTab() {
		return driver.findElement(ProgramTab).getText();
	}
	public String verifyBatchTab() {
		return driver.findElement(BatchTab).getText();
	}
	
	public String verifyAssignmentTab() {
		return driver.findElement(AssignmentTab).getText();

	}
	public String verifyAttendanceTab() {
		return driver.findElement(AttendanceTab).getText();

	}
	public String verifyLogoutTab() {
		return driver.findElement(LogoutTab).getText();

	}
	
	public void Click_Assignment_Tab() {
		
		driver.findElement(AssignmentTab).click();
	}
	
	
	
}
