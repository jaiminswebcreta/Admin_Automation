package com.Admin_MilkRide.pagobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locationpage {
	WebDriver lDriver;
	public Locationpage(WebDriver rDriver) {

	lDriver = rDriver;

	PageFactory.initElements(rDriver, this);
}
	// Identify web element
	@FindBy(xpath = "(//a[normalize-space()='Add Location'])[1]")
	WebElement addlocationElement;
	
	@FindBy(xpath = "(//a[normalize-space()='Transfer Location'])[1]")
	WebElement transferlocatioElement;
	@FindBy(xpath = "(//a[normalize-space()='Hub To Hub Transfer'])[1]")
	WebElement hubtohubtransferElement;
	
	@FindBy(xpath = "(//a[normalize-space()='Products'])[1]")
	
	WebElement prodductElement;
	
	//Action perform
	
	public boolean addlocationVisible() {
	    return addlocationElement.isDisplayed();
	}
	
	public boolean transferlocationVisible() {
	    return transferlocatioElement.isDisplayed();
	}
	public boolean hubtohubtnVisible() {
	    return hubtohubtransferElement.isDisplayed();
	}
	
	public void clikproduct() {
		prodductElement.click();
		
	}

}
