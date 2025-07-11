package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agents_Page {

	// Create object of web driver
	WebDriver lDriver;

	public Agents_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// identify webelements
	@FindBy(xpath = "(//h1[contains(text(),'Agents')])[1]")
	WebElement agentsPageTitle;

		public String getAgentsPageTitleText() {
		return agentsPageTitle.getText();
	}
		
		@FindBy(xpath = "(//a[normalize-space()='Add Agent'])[1]")
			WebElement addAgentButton;
		public boolean isAddAgentButtonDisplayed() {
			return addAgentButton.isDisplayed();
		}
		@FindBy(xpath = "(//span[normalize-space()='Role'])[1]")
		WebElement roleElement;
		public void clickRoleElement() {
			roleElement.click();
		}
}
