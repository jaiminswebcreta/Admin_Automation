package com.Admin_MilkRide.pagobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hubinfopage {
	// Crete object of webdrive
		WebDriver lDriver;

	 public hubinfopage(WebDriver rDriver) {

			lDriver = rDriver;

			PageFactory.initElements(rDriver, this);
		}

	// identify webelements
		
			@FindBy(xpath = "(//h1[contains(text(),'Hub:')])[1]")
			WebElement HubFirst;
			
			@FindBy(xpath = "(//a[normalize-space()='Accounts'])[1]")
			
			WebElement accountElement;
			
			
//			Action perfroms
			
			public String gethubnametext() {

				return HubFirst.getText();
				
				
			}
			
			public void clickaccount() {
				
				accountElement.click();
				
			}
				
		}
	
