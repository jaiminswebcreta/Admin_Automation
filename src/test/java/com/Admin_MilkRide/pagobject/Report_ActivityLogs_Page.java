package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_ActivityLogs_Page {

	// Create object of webdriver
	WebDriver lDriver;

	public Report_ActivityLogs_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	@FindBy(xpath = "(//h1[normalize-space()='Activity List'])[1]")
	private WebElement activityLogHeader;

	public String getActivityLogHeaderText() {
		return activityLogHeader.getText();
	}

	@FindBy(xpath = "(//button[normalize-space()='Export As'])[1]")
	private WebElement exportCSVButton;

	public boolean isExportCSV() {
		return exportCSVButton.isDisplayed();
	}

}
