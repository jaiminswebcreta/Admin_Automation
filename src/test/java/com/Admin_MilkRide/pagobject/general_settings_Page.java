package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class general_settings_Page {
		// Create object of web driver
	WebDriver lDriver;

	public general_settings_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// identify webelements
	@FindBy(xpath = "(//h1[normalize-space()='General Settings Configuration'])[1]")
	WebElement generalSettingsElement;

	public String getGeneralSettingsElementText() {
		return generalSettingsElement.getText();
	}
}
