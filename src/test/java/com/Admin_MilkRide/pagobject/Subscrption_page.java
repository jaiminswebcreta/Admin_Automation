package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscrption_page  {
	// Crete object of webdrive
	WebDriver lDriver;

	public Subscrption_page (WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//button[normalize-space()='Add Subscription'])[1]")
	WebElement addsubscriptionElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Orders'])[1]")
	WebElement orderElement;
	
	
	
	
	//Action performs
	
	public boolean isaddsubscription() {
	return	addsubscriptionElement.isDisplayed();
		
		
	}
	public void Click_Order() {
		orderElement.click();
		
	}
	
	
}
