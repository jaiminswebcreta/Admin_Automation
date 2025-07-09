package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PlanSlot_Page {
    WebDriver lDriver;

    public PlanSlot_Page(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    // Plan Slots List h1 WebElement
    @FindBy(xpath = "(//h1[normalize-space()='Plan Slots List'])[1]")
    WebElement planSlotsListHeader;
    // Subscription List span WebElement
    @FindBy(xpath = "(//span[normalize-space()='Subscription List'])[1]")
    WebElement subscriptionListSpan;

	// Returns the text of the Plan Slots List header
	public String getPlanSlotsListHeaderText() {
		return planSlotsListHeader.getText();
	}

// Clicks the Subscription List span
	public void clickSubscriptionList() {
    subscriptionListSpan.click();
}

}




