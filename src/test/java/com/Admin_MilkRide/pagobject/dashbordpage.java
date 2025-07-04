package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashbordpage {
	// Crete object of webdrive
	WebDriver lDriver;

	public dashbordpage(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//span[normalize-space()='Dashboard'])[1]")
	WebElement dash;
	// identify Webelement action

	@FindBy(xpath = "//span[contains(text(),'Hub Manager')]")

	WebElement hubmngr;
	@FindBy(xpath = "(//span[normalize-space()='All Hubs'])[1]")

	WebElement Allhub;
	
	@FindBy(xpath = "(//span[contains(text(),'Delivery Management')])[1]")
	WebElement deliverymanagementElement;
	
	@FindBy(xpath = "(//span[normalize-space()='Delivery Dashboard'])[1]")
	WebElement deliverydashbordElement;
	
	
	
	
	

	// Action perfroms
	public void clickdashbord() {
		dash.click();
		
	}

	public String getdahbordtext() {

		return dash.getText();
	}

	
	public void clickhubmanager() {
		hubmngr.click();
		Allhub.click();
		
		
	}
	public void hubmanager() {
		hubmngr.click();
		
	}
	
	public void clicdeliverymanagement() {
		
		deliverymanagementElement.click();
		deliverydashbordElement.click();
		
	}

}
