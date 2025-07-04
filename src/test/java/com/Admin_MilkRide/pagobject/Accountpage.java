package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage {
// Crete object of webdrive
WebDriver lDriver;
	public Accountpage (WebDriver rDriver) {

	lDriver = rDriver;

	PageFactory.initElements(rDriver, this);
}
	// Identify web element
	@FindBy(xpath = "(//a[normalize-space()='Add User'])[1]")
	WebElement Adduser;

	@FindBy(xpath = "(//a[normalize-space()='Locations'])[1]")
	WebElement locationElement;

	// Method to verify if "Add User" button is displayed
	public boolean isAddUserVisible() {
	    return Adduser.isDisplayed();
	}
	
	public void cliklocation() {
		locationElement.click();
	}

}
