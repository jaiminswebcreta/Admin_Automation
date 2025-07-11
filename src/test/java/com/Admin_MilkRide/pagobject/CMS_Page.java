package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CMS_Page {
	
		// Create object of web driver
	 WebDriver lDriver;

	 public CMS_Page(WebDriver rDriver) {
	 	lDriver = rDriver;
	 	PageFactory.initElements(rDriver, this);
	 }

	 //identify webelements
	 @FindBy(xpath = "(//h1[contains(text(),'CMS')])[1]")
	 WebElement cmsPageElement;

	 public String getCmsPageElementText() {
	 	return cmsPageElement.getText();
	 }

}
