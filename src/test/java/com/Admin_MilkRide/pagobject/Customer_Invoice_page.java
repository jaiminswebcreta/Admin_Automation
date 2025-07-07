package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Invoice_page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Customer_Invoice_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[normalize-space()='Invoice List'])[1]")
	WebElement invoicelistElement;
	
	
	public String getinvoicetext() {
		
		return invoicelistElement.getText();
		
	}
}
