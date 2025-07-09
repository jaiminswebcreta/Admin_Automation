package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports_Page {

	// Create object of webdriver
	WebDriver lDriver;

	public Reports_Page(WebDriver rDriver) {
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

	// Identify web elements
	// In Reports_Page.java

	@FindBy(xpath = "(//h1[normalize-space()='Reports List'])[1]")
	private WebElement reportsListHeader;

	public String getReportsListHeaderText() {
		return reportsListHeader.getText();
	}
// In Reports_Page.java

	@FindBy(xpath = "(//span[normalize-space()='Customer Reports'])[1]")
	private WebElement customerReportsSpan;

	public boolean isCustomerReportsVisible() {
		return customerReportsSpan.isDisplayed();
	}
// In Reports_Page.java

	@FindBy(xpath = "(//a[normalize-space()='Customer Wallet'])[1]")
	private WebElement customerWalletLink;

	public void clickCustomerWallet() {
		customerWalletLink.click();
	}

	@FindBy(xpath = "(//a[normalize-space()='Customer Information'])[1]")
	private WebElement customerInformationReportsElement;

	public void clickCustomerInformationReports() {
		customerInformationReportsElement.click();

	}

	@FindBy(xpath = "(//a[normalize-space()='Activity Log'])[1]")
	private WebElement activityLogReportsElement;

	public void clickActivityLogReports() {
		activityLogReportsElement.click();

	}

	@FindBy(xpath = "(//a[@href='https://app.milkride.com/admin/reports/low_credit/get/export'])[1]")
	private WebElement lowCreditReportsElement;

	public void clickLowCreditReports() {
		lowCreditReportsElement.click();

	}

	@FindBy(xpath = "(//a[normalize-space()='Customer Vacation'])[1]")
	private WebElement customerVacationReportsElement;

	public void clickCustomerVacationReports() {
		customerVacationReportsElement.click();
	}

	@FindBy(xpath = "(//a[normalize-space()='Customer Life Cycle'])[1]")
	private WebElement customerLifeCycleReportsElement;

	public void clickCustomerLifeCycleReports() {
		customerLifeCycleReportsElement.click();
	}

	@FindBy(xpath = "$(\"a[href='https://app.milkride.com/admin/reports/subscriptions']\")")
	private WebElement subscriptionReportsElement;

	public void clickSubscriptionReports() {
		subscriptionReportsElement.click();
	}

	@FindBy(xpath = "(//a[normalize-space()='Subscription End'])[1]")

	private WebElement subscriptionEndReportsElement;

	public void clickSubscriptionEndReports() {
		subscriptionEndReportsElement.click();

	}

}
