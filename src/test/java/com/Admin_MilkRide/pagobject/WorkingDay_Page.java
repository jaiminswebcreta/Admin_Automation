package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkingDay_Page {
	// Crete object of webdrive
	WebDriver lDriver;

	public WorkingDay_Page(WebDriver rDriver) {

		lDriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}
	 // "Working Days" header WebElement
    @FindBy(xpath = "(//h1[normalize-space()='Working Days'])[1]")
    private WebElement workingDaysHeader;
    @FindBy(xpath = "(//span[normalize-space()='Plan Slot'])[1]")
    private WebElement planSlotSpan;

    
    

    // Method to get the text of the "Working Days" header
    public String getWorkingDaysHeaderText() {
        return workingDaysHeader.getText();
    }
     // Method to click the "Plan Slot" span
        public void clickPlanSlot() {
            planSlotSpan.click();
        }

        
    }
