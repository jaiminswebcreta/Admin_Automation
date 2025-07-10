package com.Admin_MilkRide.pagobject.Reports;

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

	@FindBy(xpath = "(//a[@class='text-gray-900 text-hover-primary fs-6 fw-bold'][normalize-space()='Subscription'])[1]")
	private WebElement subscriptionReportsElement;

	public void clickSubscriptionReports() {
		subscriptionReportsElement.click();
	}

	@FindBy(xpath = "(//a[normalize-space()='Subscription End'])[1]")

	private WebElement subscriptionEndReportsElement;

	public void clickSubscriptionEndReports() {
		subscriptionEndReportsElement.click();

	}
	
	@FindBy(xpath = "(//span[normalize-space()='Operational Reports'])[1]")
	private WebElement operationalReportsSpan;
	public boolean isOperationalReportsVisible() {
		return operationalReportsSpan.isDisplayed();
	}
	@FindBy(xpath = "(//a[normalize-space()='Future Orders'])[1]")
	private WebElement futureOrdersReportsElement;
	
	public void clickFutureOrdersReports() {
		futureOrdersReportsElement.click();
	}
	@FindBy(xpath = "(//a[normalize-space()='Predictive Analysis'])[1]")
	private WebElement predictiveAnalysisReportsElement;
	
		public void clickPredictiveAnalysisReports() {
		predictiveAnalysisReportsElement.click();
	}
		
		@FindBy(xpath = "(//a[normalize-space()='Reverse Logistic'])[1]")
		private WebElement reverseLogisticReportsElement;
			public void clickReverseLogisticReports() {
			reverseLogisticReportsElement.click();
		}
			
			@FindBy(xpath = "(//a[normalize-space()='Cash Collections'])[1]")
			private WebElement cashCollectionsReportsElement;
			public void clickCashCollectionsReports() {
				cashCollectionsReportsElement.click();
			}
			
			@FindBy(xpath = "(//a[normalize-space()='Order Information'])[1]")
			private WebElement orderInformationReportsElement;
			public void clickOrderInformationReports() {
				orderInformationReportsElement.click();
			}
			@FindBy(xpath = "(//a[normalize-space()='Cancelled Order'])[1]")
			private WebElement cancelledOrderReportsElement;
			
			public void clickCancelledOrderReports() {
				cancelledOrderReportsElement.click();
			}
			@FindBy(xpath = "(//a[normalize-space()='Refund'])[1]")
			private WebElement refundReportsElement;
			
			public void clickRefundReports() {
				refundReportsElement.click();
			}
			
			@FindBy(xpath = "(//a[normalize-space()='Deliveries Information'])[1]")
			private WebElement deliveriesInformationReportsElement;
			public void clickDeliveriesInformationReports() {
				deliveriesInformationReportsElement.click();
			}
			
			
				@FindBy(xpath = "(//a[normalize-space()='Image Proof'])[1]")
				private WebElement imageProofReportsElement;
				
				public void clickImageProofReports() {
					imageProofReportsElement.click();
				}
				
				
				@FindBy(xpath = "(//span[normalize-space()='Sales Reports'])[1]")
				private WebElement salesReportsSpan;
				public boolean isSalesReportsVisible() {
					return salesReportsSpan.isDisplayed();
				}
				
				@FindBy(xpath = "(//a[normalize-space()='Transactions'])[1]")
				private WebElement transactionsReportsElement;
				public void clickTransactionsReports() {
					transactionsReportsElement.click();
				}
				@FindBy(xpath = "(//a[normalize-space()='Cumulative Sales'])[1]")
				private WebElement cumulativeSalesReportsElement;
				public void clickCumulativeSalesReports() {
					cumulativeSalesReportsElement.click();
				}
				
				@FindBy(xpath = "(//a[contains(text(),'Customer Sales (Sales')])[1]")
				private WebElement customerSalesReportsElement;
				
					public void clickCustomerSalesReports() {
					customerSalesReportsElement.click();
				}
					
					@FindBy(xpath = "(//a[normalize-space()='Orders Sheet'])[1]")
					private WebElement ordersSheetReportsElement;
					public void clickOrdersSheetReports() {
						ordersSheetReportsElement.click();
					}
					
					@FindBy(xpath = "(//a[contains(text(),'Wallet (Payment')])[1]")
					private WebElement walletPaymentReportsElement;
					
						public void clickWalletPaymentReports() {
						walletPaymentReportsElement.click();
					}
						
					
			
}
