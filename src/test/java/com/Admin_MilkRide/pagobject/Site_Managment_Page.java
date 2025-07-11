package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Site_Managment_Page {
			// Create object of web driver
	 WebDriver lDriver;

	 public Site_Managment_Page(WebDriver rDriver) {
	     lDriver = rDriver;
	     PageFactory.initElements(rDriver, this);
	 }

	// identify webelements
	 @FindBy(xpath = "(//h1[normalize-space()='Edit Config'])[1]")
	 WebElement siteManagementElement;

	 public String getSiteManagementElementText() {
	     return siteManagementElement.getText();
	 }

}
