package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_CustomerInformation_Page {
	// Create object of webdriver
	WebDriver lDriver;

	public Report_CustomerInformation_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	@FindBy(xpath = "(//h1[normalize-space()='Customer Information'])[1]")
	private WebElement customerInformationListHeader;

	public String getCustomerInformationReportHeaderText() {
		return customerInformationListHeader.getText();
	}

	@FindBy(xpath = "(//button[normalize-space()='Export Excel'])[1]")
	private WebElement exportCSVButton;

	public boolean isExportCSV() {
		return exportCSVButton.isDisplayed();
	}

}
