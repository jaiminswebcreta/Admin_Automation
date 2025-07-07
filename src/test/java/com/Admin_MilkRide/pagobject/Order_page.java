package com.Admin_MilkRide.pagobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Order_page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//button[normalize-space()='Add New Order'])[1]")
	WebElement addneworderElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Customer Pricing'])[1]")
	WebElement customerpricingElement;
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement clospriceElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Customer Invoice'])[1]")
	WebElement customer_InvoicElement;
	
	//Action perform
	
	public boolean isaddneworder() {
		
		return addneworderElement.isDisplayed();
		
	}
	
	public void Click_customerprice() {
		
		customerpricingElement.click();
		
	}
	public void Click_closebtn() {
		clospriceElement.click();
		
	}
	
	public void Click_Customer_Invoice() {
		customer_InvoicElement.click();
		
	}
	
}
