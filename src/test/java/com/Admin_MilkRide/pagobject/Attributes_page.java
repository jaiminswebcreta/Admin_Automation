package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attributes_page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Attributes_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//span[normalize-space()='Working Days'])[1]")
	WebElement workingdayElement;
	@FindBy(xpath = "(//a[normalize-space()='Add Attribute'])[1]")
	WebElement addAttributeElement;

	public boolean isAddAttributeDisplayed() {
		return addAttributeElement.isDisplayed();
	}

	public void click_Workingday() {
		workingdayElement.click();
	}
}
