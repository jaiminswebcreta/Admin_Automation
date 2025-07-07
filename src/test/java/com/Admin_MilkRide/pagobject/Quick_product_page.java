package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_product_page {
	
	// Crete object of webdrive
	WebDriver lDriver;

	public Quick_product_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[contains(text(),'Product')])[1]")
	WebElement QuickProductElement;
	
	
	public String getproductlisttext() {
		return QuickProductElement.getText();
		
	}
	
	
	

}
