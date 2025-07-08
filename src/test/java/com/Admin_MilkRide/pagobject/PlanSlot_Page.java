package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlanSlot_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public PlanSlot_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[normalize-space()='Subscription Settings'])[1]")
	WebElement subSettingElement;
}
