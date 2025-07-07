package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchase_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Purchase_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//a[normalize-space()='Add Purchase'])[1]")
	WebElement addpurchasElement;
	
	
	public boolean isaddpurchase() {
		return addpurchasElement.isDisplayed();
		
	}
}
