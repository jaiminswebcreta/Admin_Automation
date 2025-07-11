package com.Admin_MilkRide.pagobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Page {

	// Create object of web driver
	WebDriver lDriver;

	public User_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// identify webelements
	@FindBy(xpath = "(//h1[contains(text(),'Users')])[1]")
	WebElement userElement;

	public String getUserElementText() {
		return userElement.getText();
	}


@FindBy(xpath = "(//a[normalize-space()='Add User'])[1]")
WebElement addUserButton;

	public boolean isAddUserButtonDisplayed() {
		return addUserButton.isDisplayed();
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Agent'])[1]")
	WebElement addAgentButton;
	public void clickAddAgentButton() {
		addAgentButton.click();
	}


}