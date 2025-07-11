package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Role_Page {

	// Create object of web driver
	WebDriver lDriver;

	public Role_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// identify webelements
	@FindBy(xpath = "(//h1[contains(text(),'Roles')])[1]")
	WebElement agentsPageTitle;

		public String getAgentsPageTitleText() {
			return agentsPageTitle.getText();
	}
		
		@FindBy(xpath = "(//a[normalize-space()='Add Role'])[1]")
			WebElement addRoleButton;
		public boolean isAddRoleButtonDisplayed() {
			
			return addRoleButton.isDisplayed();
		}
		

}
