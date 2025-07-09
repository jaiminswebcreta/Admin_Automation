package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LM_Route_Page {

//	 Crete object of webdrive
	WebDriver lDriver;

	public LM_Route_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	// In LM_Route_Page.java

	@FindBy(xpath = "(//h1[contains(text(),'Routes')])[1]")
	private WebElement routesHeader;

	public String getRoutesHeaderText() {
		return routesHeader.getText();
	}
// In LM_Route_Page.java

	@FindBy(xpath = "(//a[normalize-space()='Add Route'])[1]")
	private WebElement addRouteLink;

	public boolean isAddRouteDisplayed() {
		return addRouteLink.isDisplayed();
	}

}
