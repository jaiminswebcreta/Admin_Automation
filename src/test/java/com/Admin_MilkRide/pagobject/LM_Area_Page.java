package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LM_Area_Page {

//	 Crete object of webdrive
	WebDriver lDriver;

	public LM_Area_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	@FindBy(xpath = "(//h1[contains(text(),'Areas')])[1]")
	private WebElement areasHeader;

	public String getAreasHeaderText() {
		return areasHeader.getText();
	}

	// In LM_Area_Page.java

	@FindBy(xpath = "(//a[normalize-space()='Add Area'])[1]")
	private WebElement addAreaLink;

	public boolean isAddAreaVisible() {
		return addAreaLink.isDisplayed();
	}

	// In LM_Area_Page.java

	@FindBy(xpath = "(//span[normalize-space()='Route'])[1]")
	private WebElement routeMenu;

	public void clickRoute() {
		routeMenu.click();
	}

}
