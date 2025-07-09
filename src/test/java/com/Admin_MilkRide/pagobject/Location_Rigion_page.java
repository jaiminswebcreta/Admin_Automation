package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location_Rigion_page {

//	 Crete object of webdrive
	WebDriver lDriver;

	public Location_Rigion_page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);

	}

	@FindBy(xpath = "(//h1[contains(text(),'Regions')])[1]")
	private WebElement regionsHeader;

	public String getRegionsHeaderText() {
		return regionsHeader.getText();
	}
	// Add to your Location_Rigion_page class

	@FindBy(xpath = "(//a[normalize-space()='Add Region'])[1]")
	private WebElement addRegionLink;

	public boolean isAddRegionVisible() {
		return addRegionLink.isDisplayed();
	}

	@FindBy(xpath = "(//span[@class='menu-title'][normalize-space()='Location'])[1]")
	private WebElement locationMenu;

	public void clickLocation() {
		locationMenu.click();
	}

}
