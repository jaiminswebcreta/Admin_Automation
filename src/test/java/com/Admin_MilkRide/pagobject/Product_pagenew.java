package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_pagenew {
	
	// Crete object of webdrive
	WebDriver lDriver;

	public Product_pagenew(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//a[normalize-space()='Add product'])[1]")
	WebElement addProductElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Quick Product Update'])[1]")
	WebElement quickproductElement;
	
	
	public Boolean isaddProdct() {
		
		return addProductElement.isDisplayed();
		
	}
	public void Click_quickproduct() {
		quickproductElement.click();
		
	}
}
