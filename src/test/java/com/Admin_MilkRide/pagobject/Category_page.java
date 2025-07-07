package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category_page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Category_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//a[normalize-space()='Add Category'])[1]")
	WebElement addcategoryElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Brand'])[1]")
	WebElement brandElement;
	
	public boolean isaddCategory() {
		return addcategoryElement.isDisplayed();
	}
	
	public void Click_Brand() {
		brandElement.click();
		
	}
	
	
	
	

}
