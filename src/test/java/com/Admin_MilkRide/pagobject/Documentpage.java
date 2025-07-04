package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documentpage {
	WebDriver lDriver;
	public Documentpage(WebDriver rDriver) {

	lDriver = rDriver;

	PageFactory.initElements(rDriver, this);
}
	// Identify web element
	@FindBy(xpath = "(//a[normalize-space()='Add Document'])[1]")
	WebElement adddocumentElement;
	
	@FindBy(xpath = "(//a[normalize-space()='Disabled Area'])[1]")
	WebElement DisableElement;
	
	//Action perform
	
	public boolean adddocumenttvisiable() {
		
		 return	adddocumentElement.isDisplayed();
		
	}
	public void clickDisablearea() {
		DisableElement.click();
		
	}
	
	
	

}