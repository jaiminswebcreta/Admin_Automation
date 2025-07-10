package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_WalletPayment_Page {

	
		// Create object of webdriver
	 WebDriver lDriver;
	 public Report_WalletPayment_Page(WebDriver rDriver) {
	 	lDriver = rDriver;
	 	PageFactory.initElements(rDriver, this);
	 }

	// Identify web elements

	 @FindBy(xpath = "(//h1[normalize-space()='Payment Gateway Usage'])[1]")
	 private WebElement paymentGatewayUsageReportHeader;
	 public String getPaymentGatewayUsageReportHeaderText() {
	 	return paymentGatewayUsageReportHeader.getText();
	 }

	

	 @FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
	 private WebElement backButton;

	 public void clickBackButton() {
	 	backButton.click();
	 }
}
