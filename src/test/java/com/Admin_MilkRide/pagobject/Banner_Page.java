package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banner_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Banner_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	 // "Working Days" header WebElement
    
		@FindBy(xpath = "(//h1[contains(text(),'Banner')])[1]")
	private WebElement bannerHeader;
		
		// "Add banner" link WebElement
@FindBy(xpath = "(//a[normalize-space()='Add banner'])[1]")
private WebElement addBannerLink;

// Method to check if the "Add banner" link is displayed
public boolean isAddBannerDisplayed() {
    return addBannerLink.isDisplayed();
}


	// Method to get the text of the "Banner" header
	public String getBannerHeaderText() {
		return bannerHeader.getText();
	}

	// Method to check if the "Banner" header is displayed}
}
