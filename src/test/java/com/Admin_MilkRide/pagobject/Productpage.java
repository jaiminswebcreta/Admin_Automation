package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	WebDriver lDriver;
	public Productpage(WebDriver rDriver) {

	lDriver = rDriver;

	PageFactory.initElements(rDriver, this);
}
	// Identify web element
	@FindBy(xpath = "(//a[@type='button'][normalize-space()='Add Product'])[1]")
	WebElement addproductElement;
	
	@FindBy(xpath = "(//a[normalize-space()='Contacts'])[1]")
	WebElement contactsElement;
	
	
	//Action perform
	
	public boolean addproductbtnvisiable() {
		
		 return	addproductElement.isDisplayed();
		
	}
	public void clickcontacts() {
		contactsElement.click();
		
	}
	
	
	

}
