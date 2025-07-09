package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlexProductSubscription_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public FlexProductSubscription_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[normalize-space()='FlexProduct Plans'])[1]")
	WebElement flexProductPlansElement;
	
	// Method to get the text of the FlexProduct Plans header
    public String getFlexProductPlansText() {
        return flexProductPlansElement.getText();
    }
}