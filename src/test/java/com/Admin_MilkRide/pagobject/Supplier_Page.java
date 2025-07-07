package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supplier_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Supplier_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//a[normalize-space()='Add Supplier'])[1]")
	WebElement addsupplirElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Purchase Inventory'])[1]")
	
	WebElement purchase_InventoryElement;
	
	
	public Boolean isaddsupplier() {
		return addsupplirElement.isDisplayed();
		
	}
	
	public void Click_Purchase_Inventory() {
		purchase_InventoryElement.click();
		
	}
	
}
