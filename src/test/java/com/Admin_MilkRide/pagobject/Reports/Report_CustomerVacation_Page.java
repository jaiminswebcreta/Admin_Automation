package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_CustomerVacation_Page {

	// Create object of webdriver
	WebDriver lDriver;

	public Report_CustomerVacation_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	@FindBy(xpath = "(//h1[normalize-space()='Customer Vacation List'])[1]")
	private WebElement customerVacationHeader;

	public String getCustomerVacationHeaderText() {
		return customerVacationHeader.getText();
	}

	@FindBy(xpath = "(//button[normalize-space()='Export As'])[1]")
	private WebElement exportAsButton;

	public boolean clickExportAsButton() {
		return exportAsButton.isDisplayed();

	}

}
