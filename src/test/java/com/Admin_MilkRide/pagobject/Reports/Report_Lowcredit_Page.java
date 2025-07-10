package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_Lowcredit_Page {

//	 Create object of webdriver
	WebDriver lDriver;

	public Report_Lowcredit_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	@FindBy(xpath = "(//h1[normalize-space()='Low Credit List'])[1]")
	private WebElement lowCreditListHeader;

	public String getLowCreditReportHeaderText() {
		return lowCreditListHeader.getText();
	}

	@FindBy(xpath = "(//button[normalize-space()='Export As'])[1]")
	private WebElement exportCSVButton;

	public boolean isExportCSV() {
		return exportCSVButton.isDisplayed();
	}

}
