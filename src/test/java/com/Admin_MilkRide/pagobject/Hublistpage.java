package com.Admin_MilkRide.pagobject;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hublistpage {
	// Crete object of webdrive
		WebDriver lDriver;

		public Hublistpage(WebDriver rDriver) {

			lDriver = rDriver;

			PageFactory.initElements(rDriver, this);
		}
		// identify webelements
		
		@FindBy(xpath = "//h1[normalize-space()='Hubs List']")
		WebElement hublist;
		
		@FindBy(xpath = "(//table[contains(@class, 'table')]//tbody//tr[1]//td[2]/a)[1]")
		WebElement fisthubElement;
		
		
//		Action Perfroms
		public String gethublistext() {

			return hublist.getText();
		
		}
		
		public void clickfirsthub() {
			
			
			fisthubElement.click();
			
		}		
		
}