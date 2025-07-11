package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tickets_Page {
			// Create object of web driver
	 WebDriver lDriver;

	 public Tickets_Page(WebDriver rDriver) {
	     lDriver = rDriver;
	     PageFactory.initElements(rDriver, this);
	 }

	// identify webelements
	 @FindBy(xpath = "(//h1[normalize-space()='Tickets List'])[1]")
	  WebElement ticketsListElement;
	 public String getTicketsListElementText() {
	     return ticketsListElement.getText();
	 }
	 @FindBy(xpath = "(//a[normalize-space()='Add New Ticket'])[1]")
	 WebElement addNewTicketButton;
	 public boolean isAddNewTicketButtonDisplayed() {
	     return addNewTicketButton.isDisplayed();
	 }
	 
	 

}
