package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flexproduct_Setting_page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Flexproduct_Setting_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[normalize-space()='Subscription Settings'])[1]")
	WebElement subSettingElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Attributes'])[1]")
	WebElement attributesElement;
	
	
	public String getSubsetting() {
		
		return subSettingElement.getText();
		
	}
	
	public void Click_Attributes() {
		attributesElement.click();
		
	}
}
