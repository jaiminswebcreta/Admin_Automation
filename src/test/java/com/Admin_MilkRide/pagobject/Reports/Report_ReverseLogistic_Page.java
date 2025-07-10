package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_ReverseLogistic_Page {
		// Create object of webdriver
	 WebDriver lDriver;

	 public Report_ReverseLogistic_Page(WebDriver rDriver) {
	 	lDriver = rDriver;
	 	PageFactory.initElements(rDriver, this);
	 }

	// Identify web elements


	 @FindBy(xpath = "(//h1[normalize-space()='Reverse Logistic'])[1]")
	 private WebElement reverseLogisticHeader;
	 public String getReverseLogisticHeaderText() {
	 	return reverseLogisticHeader.getText();
	 }
	
	 	@FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
	 	private WebElement backButton;
	 	public void clickBackButton() {
	 			backButton.click();
	 			
	 	}
	 	
	 	

}
