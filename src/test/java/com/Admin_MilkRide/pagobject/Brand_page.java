package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brand_page {
	
		// Crete object of webdrive
		WebDriver lDriver;

		public Brand_page(WebDriver rDriver) {

			lDriver = rDriver;

			PageFactory.initElements(rDriver, this);
		}
		// identify webelements

		@FindBy(xpath = "(//a[normalize-space()='Add brand'])[1]")
		WebElement addbrandElement;
		@FindBy(xpath = "(//span[normalize-space()='Product'])[1]")
		WebElement productElement;

		
	public boolean isaddBrand() {
		return addbrandElement.isDisplayed();
		
	}
	
	public void click_Product() {
		productElement.click();
		
	}
			
		}
	
