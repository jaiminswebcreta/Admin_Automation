package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	
		WebDriver lDriver;
	 public Contactpage (WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
		// Identify web element
		@FindBy(xpath = "(//a[normalize-space()='Add Contact'])[1]")
		WebElement addcontactElement;
		
		@FindBy(xpath = "(//a[normalize-space()='Documents'])[1]")
		WebElement documentsElement;
		
		//Action perform
		
		public boolean addcontactvisiable() {
			
			 return	addcontactElement.isDisplayed();
			
		}
		public void clickDocuments() {
			documentsElement.click();
			
		}
		
		
		

	}



