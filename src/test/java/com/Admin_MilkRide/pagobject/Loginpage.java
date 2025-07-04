package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage {
// Crete object of webdrive
	WebDriver lDriver;

	public Loginpage(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	// identify webelements

	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Psw;
	@FindBy(xpath ="//button[@type='submit'][1]")
	WebElement submitbtnbtn;


	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}
	public void Enterpsw(String passd) {
		Psw.sendKeys(passd);
	}
	
	public void clickBtnSubmit() {
		submitbtnbtn.click();
	}

}
