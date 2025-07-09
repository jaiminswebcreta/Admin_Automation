package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LM_Locations_page {

//	 Crete object of webdrive
	WebDriver lDriver;

	public LM_Locations_page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements

// In LM_Locations_page.java

	@FindBy(xpath = "(//h1[normalize-space()='Locations List'])[1]")
	private WebElement locationsListHeader;

	public String getLocationsListHeaderText() {
		return locationsListHeader.getText();
	}
// In LM_Locations_page.java

	@FindBy(xpath = "(//a[normalize-space()='Add Location'])[1]")
	private WebElement addLocationLink;

	public boolean isAddLocationDisplayed() {
		return addLocationLink.isDisplayed();
	}
// In LM_Locations_page.java

	@FindBy(xpath = "(//span[normalize-space()='Area'])[1]")
	private WebElement areaMenu;

	public void clickArea() {
		areaMenu.click();
	}

}
