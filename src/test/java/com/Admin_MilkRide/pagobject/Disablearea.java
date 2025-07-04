package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Disablearea {
	WebDriver lDriver;
	public Disablearea(WebDriver rDriver) {

	lDriver = rDriver;

	PageFactory.initElements(rDriver, this);
}
	// Identify web element
	@FindBy(xpath = "(//a[normalize-space()='Disable Area'])[1]")
	WebElement adddiableareaElement;
	
	
	
	//Action perform
	
	public boolean adddiableareavisiable() {
		
		 return	adddiableareaElement.isDisplayed();
		
	}
	
}
