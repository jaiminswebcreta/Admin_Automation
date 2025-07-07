package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoice_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public Invoice_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(xpath = "(//h1[contains(text(),'Invoice')])[1]")
	WebElement textinvoicElement;

	public String getinvoicelist() {

		return textinvoicElement.getText();
	}

}
