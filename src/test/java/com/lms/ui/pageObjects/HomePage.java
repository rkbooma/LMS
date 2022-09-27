package com.lms.ui.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lms.ui.base.LmsBase;

public class HomePage extends LmsBase {
	By user = By.xpath("//span[contains(text(), 'User')]");

	public void clickUsertab() {
		driver.findElement(user).click();
	}
}
