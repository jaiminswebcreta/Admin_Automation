package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Warehouse_page {
	// Crete object of webdrive
		WebDriver lDriver;

		public Warehouse_page(WebDriver rDriver) {

			lDriver = rDriver;

			PageFactory.initElements(rDriver, this);
		}
		// identify webelements

		@FindBy(xpath = "(//a[normalize-space()='Add Warehouse'])[1]")
		WebElement addwarehousElement;
		
		@FindBy(xpath = "(//span[normalize-space()='Supplier'])[1]")
		
		WebElement supplierElement;
		
		
		
		public boolean isaddwarehouse() {
			return addwarehousElement.isDisplayed();
			
		}
		
		public void Click_Supplier() {
			supplierElement.click();
			
		}
}
