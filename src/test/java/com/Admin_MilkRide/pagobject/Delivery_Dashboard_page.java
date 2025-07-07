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
		
		@FindBy(xpath = "(//span[normalize-space()='Optimize Route'])[1]")
		WebElement optimizaElement;
		
		@FindBy(xpath = "(//span[normalize-space()='Manual Route'])[1]")
		WebElement manualroutElement;
		
		@FindBy(xpath = "(//span[normalize-space()='Order History'])[1]")
		WebElement orderhistoryElement;
		
		@FindBy(xpath = "(//span[normalize-space()='Route Assignment'])[1]")
		WebElement routeassignmentElement;
		@FindBy(xpath = "(//span[normalize-space()='Master Route'])[1]")
		WebElement masterroutElement;
		
		
		
		
		// identify Webelement action

		public String getdeleverydashtext() {
			return 	deleverydashtextElement.getText();
			
		}
		
		public void clickDeliveryTransfer() {
			deliverytransferElement.click();
			
		}
		public void clickoptimize() {
			optimizaElement.click();
			
		}
		public void clickmanulroute() {
			manualroutElement.click();
			
		}
		public void clickorderhistory() {
			orderhistoryElement.click();
			
		}
		public void clickrouteAssis() {
			routeassignmentElement.click();
			
		}
		public void clickmasterroute() {
			masterroutElement.click();
			
		}         
		
		
}
