package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_refund_list_Page {
	
		// Create object of webdriver
	 WebDriver lDriver;
	
	 public Report_refund_list_Page(WebDriver rDriver) {
	     lDriver = rDriver;
	     PageFactory.initElements(rDriver, this);
	 }
	
	// Identify web elements
	
	 @FindBy(xpath = "(//h1[@class='page-heading d-flex flex-column justify-content-center text-dark fw-bold fs-3 m-0'])[1]")
	 private WebElement refundListHeader;
	 	
	 	public String getRefundListHeaderText() {
	     return refundListHeader.getText();
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
