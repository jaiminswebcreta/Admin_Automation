package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_Transactions_Page {
	
		// Create object of webdriver
	 WebDriver lDriver;

	 public Report_Transactions_Page(WebDriver rDriver) {
	 	lDriver = rDriver;
	 	PageFactory.initElements(rDriver, this);
	 }

	// Identify web elements

	 @FindBy(xpath = "(//h1[normalize-space()='Transactions Report'])[1]")
	 private WebElement transactionsReportHeader;
	 public String getTransactionsReportHeaderText() {
	 	return transactionsReportHeader.getText();
	 }
	
	 @FindBy(xpath = "(//button[normalize-space()='Export As'])[1]")
	 private WebElement exportAsButton;
	 public boolean clickExportAsButton() {
	 	return exportAsButton.isDisplayed();
	 }
	
	 @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
	 private WebElement backButton;
	
	 public void clickBackButton() {
	 	backButton.click();
	 }

}
