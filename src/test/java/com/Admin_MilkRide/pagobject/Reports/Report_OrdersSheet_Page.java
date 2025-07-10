package com.Admin_MilkRide.pagobject.Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_OrdersSheet_Page {
	
		// Create object of webdriver
	WebDriver lDriver;

	public Report_OrdersSheet_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements

	@FindBy(xpath = "(//h1[normalize-space()='Orders Sheet'])[1]")
	private WebElement orderSheetHeader;

	public String getOrderSheetHeaderText() {
		return orderSheetHeader.getText();
	}

	@FindBy(xpath = "(//button[contains(text(),'Download Delivery')])[1]")
	private WebElement downloadDeliveryButton;	
	public boolean isDownloadDeliveryButtonDisplayed() {
		return downloadDeliveryButton.isDisplayed();
	}

	@FindBy(xpath = "(//a[normalize-space()='Back'])[1]")
	private WebElement backButton;

	public void clickBackButton() {
		backButton.click();
	}

}
