package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Customer_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[normalize-space()='Customers List'])[1]")
	WebElement textcustomerheadingElement;
	
	@FindBy(xpath = "(//a[normalize-space()='Add Customer'])[1]")
	WebElement addcustomerElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Subscription'])[1]")
	WebElement subscriptionElement;
	
	
	
	
	//Action Performs
	
	public String Getcustomertext() {
		
		return	textcustomerheadingElement.getText();
				
	}
	
		public boolean isaddcustomerd() {
		return	addcustomerElement.isDisplayed();
		
	}
		
		public void Click_Subscription() {
			subscriptionElement.click();
			
		}
}
