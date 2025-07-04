package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delivery_Dashboard_page {
	// Crete object of webdrive
		WebDriver lDriver;

		public Delivery_Dashboard_page(WebDriver rDriver) {

			lDriver = rDriver;

			PageFactory.initElements(rDriver, this);
		}
		// identify webelements

		@FindBy(xpath = "(//span[@class='card-label fw-bold text-gray-800'][normalize-space()='Delivery Dashboard'])[1]")
		WebElement deleverydashtextElement;
		@FindBy(xpath = "(//span[normalize-space()='Delivery Transfer'])[1]")
		WebElement deliverytransferElement;
		
		
		
		
		// identify Webelement action

		public String getdeleverydashtext() {
			return 	deleverydashtextElement.getText();
			
		}
		
		public void clickDeliveryTransfer() {
			deliverytransferElement.click();
			
		}
}
