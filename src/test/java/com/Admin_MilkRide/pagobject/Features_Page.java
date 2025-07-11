package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Features_Page {
		// Create object of web driver
	WebDriver lDriver;

	public Features_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// identify webelements
	@FindBy(xpath = "(//h1[normalize-space()='Addon Features'])[1]")
	WebElement featuresListElement;

	public String getFeaturesListElementText() {
		return featuresListElement.getText();
	}

	

}
