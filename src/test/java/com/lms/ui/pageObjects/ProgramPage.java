package com.lms.ui.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.lms.ui.base.LmsBase;

public class ProgramPage extends LmsBase {
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-button']")
	WebElement ProgramMenuButton;

	@FindBy(xpath = "//button[@label='A New Program']")
	WebElement AnewProgram;
//	@FindBy(xpath="//input[@class='p-inputtext p-component ng-pristine ng-invalid ng-touched']")
//	WebElement ProgramName;

	@FindBy(id = "programName")
	// @FindBy(xpath="//input[@class='p-inputtext p-component ng-pristine ng-invalid
	// ng-touched']")
	WebElement ProgramName;

	@FindBy(id = "programDescription")
	WebElement programDescrip;

	@FindBy(id = "Active")
	WebElement ActiveRadioButton;

	@FindBy(id = "Inactive")
	WebElement InActiveRadioButton;

	@FindBy(xpath = "//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']")
	WebElement SaveButton;

	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component ng-star-inserted']")
	WebElement Cancel;
	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")
	WebElement deleteProgrambutton;
	@FindBy(xpath = "//button[@class='ng-tns-c133-4 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']")
	WebElement YES;
	@FindBy(xpath = "//button[@class='ng-tns-c133-4 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']")
	WebElement NO;
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement checkbox;
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement ProgramEditButton;

//	@FindBy(xpath="//span[@class='p-button-icon pi pi-trash']")
//	 WebElement DeleteProgram;
//	
//	@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-check']")
//	WebElement YesButton;
//
//	@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-times']")
//	WebElement NoButton;
//	
//	@FindBy(xpath="//div[@class='p-checkbox-box']")
//	WebElement Checkbox;

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchbox;

	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p-paginator-page p-paginator-element')])[1]")
	WebElement firstEntrieButton;
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p-paginator-page p-paginator-element')])[2]")
	WebElement secondEntrieButton;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']")
	WebElement leftNavigationArrow;
	@FindBy(xpath = "//span[@class=' p-paginator-icon pi pi-angle-right']")
	WebElement rightNavigationArrow;
	@FindBy(xpath = "//th[@psortablecolumn='ProgramName']")
	WebElement Programascend;
	@FindBy(xpath = "//th[@psortablecolumn='programDescription']")
	WebElement ProgramDescriptionAscend;
	@FindBy(xpath = "//th[@psortablecolumn='programStatus']")
	WebElement ProgramStatusAcend;

	public void ClickOnProgramMenubar() {
		ProgramMenuButton.click();

	}

	public void ClickOnNewProgram() {
		AnewProgram.click();
	}

	public void EnternewProgram(String newpro) {
		ProgramName.sendKeys(newpro);
	}

	public void ClearProgram() {
		ProgramName.clear();
	}

	public void enterProdescription(String desc) {
		programDescrip.sendKeys(desc);
	}

	public void ClickActiveStatus() {
		ActiveRadioButton.click();
	}

	public void ClickinInActiveStatus() {
		InActiveRadioButton.click();
	}

	public void ClickonSaveButton() {
		SaveButton.click();
	}

	public void ClickonCancelButton() {
		Cancel.click();
	}

	public void DeleteselectedProgram() {
		deleteProgrambutton.click();
	}

	public void ClickYesButton() {
		YES.click();
	}

	public void ClickNoButton() {
		NO.click();
	}

	public void ClickCheckbox() {
		checkbox.click();
	}

	public void ProgramEditButton() {
		ProgramEditButton.click();
	}

	public void searchButton() {
		searchbox.click();
	}

	public void searchClearProgram() {
		searchbox.clear();
	}

	public void FirstEnterieButton() {
		firstEntrieButton.click();
	}

	public void SecondtEnterieButton() {
		secondEntrieButton.click();
	}

	public void leftNavigationArrow() {
		leftNavigationArrow.click();
	}

	public void rightNavigationArrow() {
		rightNavigationArrow.click();
	}

	public void Programascend() {
		Programascend.click();
	}

	public void ProgramDescriptionAscend() {
		ProgramDescriptionAscend.click();
	}

	public void ProgramStatusAcend() {
		ProgramStatusAcend.click();
	}
}
