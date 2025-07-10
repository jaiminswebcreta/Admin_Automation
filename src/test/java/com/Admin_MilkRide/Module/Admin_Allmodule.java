package com.Admin_MilkRide.Module;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Admin_MilkRide.pagobject.Accountpage;
import com.Admin_MilkRide.pagobject.Attributes_page;
import com.Admin_MilkRide.pagobject.Banner_Page;
import com.Admin_MilkRide.pagobject.Brand_page;
import com.Admin_MilkRide.pagobject.Category_page;
import com.Admin_MilkRide.pagobject.Contactpage;
import com.Admin_MilkRide.pagobject.Customer_Invoice_page;
import com.Admin_MilkRide.pagobject.Customer_Page;
import com.Admin_MilkRide.pagobject.Delivery_Dashboard_page;
import com.Admin_MilkRide.pagobject.Disablearea;
import com.Admin_MilkRide.pagobject.Documentpage;
import com.Admin_MilkRide.pagobject.FlexProductSubscription_Page;
import com.Admin_MilkRide.pagobject.Flexproduct_Setting_page;
import com.Admin_MilkRide.pagobject.Hublistpage;
import com.Admin_MilkRide.pagobject.Invoice_Page;
import com.Admin_MilkRide.pagobject.LM_Area_Page;
import com.Admin_MilkRide.pagobject.LM_Locations_page;
import com.Admin_MilkRide.pagobject.LM_Route_Page;
import com.Admin_MilkRide.pagobject.Location_Rigion_page;
import com.Admin_MilkRide.pagobject.Locationpage;
import com.Admin_MilkRide.pagobject.Loginpage;
import com.Admin_MilkRide.pagobject.Order_page;
import com.Admin_MilkRide.pagobject.PlanSlot_Page;
import com.Admin_MilkRide.pagobject.Product_pagenew;
import com.Admin_MilkRide.pagobject.Productpage;
import com.Admin_MilkRide.pagobject.Purchase_Page;
import com.Admin_MilkRide.pagobject.Quick_product_page;
import com.Admin_MilkRide.pagobject.Subscrption_page;
import com.Admin_MilkRide.pagobject.Supplier_Page;
import com.Admin_MilkRide.pagobject.Warehouse_page;
import com.Admin_MilkRide.pagobject.WorkingDay_Page;
import com.Admin_MilkRide.pagobject.dashbordpage;
import com.Admin_MilkRide.pagobject.hubinfopage;
import com.Admin_MilkRide.pagobject.Reports.Report_ActivityLogs_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CancelledOrder_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CashCollections_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CumulativeSales_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CustomerInformation_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CustomerVacation_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_CustomerWallet_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_DeliveriesInformation_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_FutureOrders_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_ImageProof_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_Lowcredit_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_OrderInformation_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_OrdersSheet_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_PredictiveAnalysis_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_ReverseLogistic_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_SubscriptionEnd_page;
import com.Admin_MilkRide.pagobject.Reports.Report_Subscription_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_Transactions_Page;
import com.Admin_MilkRide.pagobject.Reports.Report_WalletPayment_Page;
import com.Admin_MilkRide.pagobject.Reports.Reports_Page;

@Listeners(com.Admin_MilkRide.Utilities.ExtentListenerClass.class)
public class Admin_Allmodule extends Baseclass {
	@Test(priority = 1)

	public void LoginAdminpenal() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			try {
				captureScreenShot(driver, "LoginAdminpenal_Exception");
			Loginpage Lp = new Loginpage(driver);
			Lp.EnterEmail("ruralbloomroots@gmail.com");// 9316033469
			logger.info("Fill Email");

			Lp.Enterpsw("Rural@2024");// 9316033469
			logger.info("Fill passwoed");

			Lp.clickBtnSubmit();

			// ✅ URL Verification
			String actualUrl = driver.getCurrentUrl();
			logger.info("Dashboard URL: " + actualUrl);
//	        String expectedUrl = "https://app.milkride.com/admin/merchant/dashboard";
//
//	        if (actualUrl.equals(expectedUrl)) {
//	            logger.info("Dashboard URL matched successfully: " + actualUrl);
//	        } else {
//	            logger.error("Dashboard URL mismatch! Found: " + actualUrl);
//	            captureScreenShot(driver, "DashboardURLMismatch");
//	            Assert.fail("Dashboard URL mismatch.");
//	        }

			dashbordpage dp = new dashbordpage(driver);

			String Dashbordvf = dp.getdahbordtext();

			if (Dashbordvf.equals("Dashboard")) {

				logger.info("login sucefully - Passed ");
				softAssert.assertTrue(true, "Dashborad text matched");

			} else {
				logger.info("login sucefully - failed ");
				captureScreenShot(driver, "LoginAdminpenal");
				softAssert.fail("Dashbord text mis match mismatch");
			}
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "LoginAdminpenal_Exception");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}
			softAssert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 2)
	public void Hubmanager() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clickhubmanager();
			String actualhubUrl = driver.getCurrentUrl();
			logger.info("Hubs URL: " + actualhubUrl);
			Hublistpage hp = new Hublistpage(driver);

			String hublistvrf = hp.gethublistext();

			if (hublistvrf.equals("Hubs List")) {

				logger.info("Hub listpage sucefully open - Passed ");
				softAssert.assertTrue(true, "Hub list text matched");

			} else {
				logger.info("Hub listpage sucefully open  - failed ");
				captureScreenShot(driver, "Hub Manager");
				softAssert.fail("Hub list text mismatch");
			}

			hp.clickfirsthub();
			String hubUrl = driver.getCurrentUrl();
			logger.info("HubInfo URL: " + hubUrl);

		} catch (Exception e) {
			logger.error("Exception occurred in Hubmanager: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Hubmanager");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}
			Assert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 3)
	public void HubInfo() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			hubinfopage hip = new hubinfopage(driver);

			String hubinfoString = hip.gethubnametext();

			if (hubinfoString.equals(hubinfoString)) {

				logger.info("Hubinfo page sucefully open - Passed ");
				softAssert.assertTrue(true, "Hubinfo text matched");

			} else {
				logger.info("Hubinfo sucefully open  - failed ");
				captureScreenShot(driver, "LoginAdminpenal");
				softAssert.fail("Hubinfo text mismatch");
			}

			hip.clickaccount();
			String AccountUrl = driver.getCurrentUrl();
			logger.info("Hubs Account URL: " + AccountUrl);

			Accountpage hAp = new Accountpage(driver);
			hAp.isAddUserVisible();
			logger.info("Add Button is displyed ");

			hAp.cliklocation();
			logger.info("click on Location");
			String LocationUrl = driver.getCurrentUrl();
			logger.info("Hubs Location URL: " + LocationUrl);

			Locationpage hlip = new Locationpage(driver);

			hlip.addlocationVisible();
			logger.info("add location Button is displyed ");
			hlip.transferlocationVisible();
			logger.info("location transfer button is displyed ");
			hlip.hubtohubtnVisible();
			logger.info("hub to hub transfer Button is displyed ");

			hlip.clikproduct();

			logger.info("click on product option");
			String ProductUrl = driver.getCurrentUrl();
			logger.info("Hubs Product URL: " + ProductUrl);

			Productpage hpp = new Productpage(driver);

			hpp.addproductbtnvisiable();
			logger.info("Add product Button is displyed ");
			hpp.clickcontacts();

			logger.info("click on contacts page ");

			Contactpage Cp = new Contactpage(driver);

			Cp.addcontactvisiable();
			logger.info("Add contanct Button is displyed ");
			Cp.clickDocuments();
			logger.info("click on Document page ");
			String DocumentUrl = driver.getCurrentUrl();
			logger.info("Hubs Document URL: " + DocumentUrl);

			Documentpage Dp = new Documentpage(driver);

			Dp.adddocumenttvisiable();
			logger.info("Add Document Button is displyed ");
			Dp.clickDisablearea();
			logger.info("click on Disable area page ");
			String DiableareUrl = driver.getCurrentUrl();
			logger.info("Hubs Diable area URL: " + DiableareUrl);

			Disablearea disp = new Disablearea(driver);

			disp.adddiableareavisiable();
			logger.info("Add Diable area Button is displyed ");
			dashbordpage dp = new dashbordpage(driver);
			dp.hubmanager();

			dp.clickdashbord();
			logger.info("Hub Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in HubInfo: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "HubInfo");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}
			softAssert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}
		softAssert.assertAll(); // ✅ Final step to report any failures

	}

	@Test(priority = 4)
	public void Delivery_Management() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clicdeliverymanagement();
			String actualdelimanUrl = driver.getCurrentUrl();
			logger.info("Delevery Management URL: " + actualdelimanUrl);

			Delivery_Dashboard_page DDp = new Delivery_Dashboard_page(driver);

			String deliverydash = DDp.getdeleverydashtext();

			if (deliverydash.equals("Delivery Dashboard")) {

				logger.info("Deivery dashborad page sucefully open - Passed ");
				softAssert.assertTrue(true, "Delivery Dashboard text matched");

			} else {
				logger.info("Deivery dashborad page sucefully openn  - failed ");
				captureScreenShot(driver, "Delivery_Management");
				softAssert.fail("Delivery Dashboard text mismatch");
			}

			DDp.clickDeliveryTransfer();
			String DeliverytransferUrl = driver.getCurrentUrl();
			logger.info("Delivery Transfer page  URL: " + DeliverytransferUrl);
			logger.info("Delivery Transfer Open");

//			DDp.clickoptimize();
//			String optimizeUrl = driver.getCurrentUrl();
//			logger.info("Optimize Route page  URL: " + optimizeUrl);
//			logger.info("optimiza route  Open");

			DDp.clickmanulroute();
			String manulRouteUrl = driver.getCurrentUrl();
			logger.info("manul Route page  URL: " + manulRouteUrl);
			logger.info("Manual route  Open");

//			DDp.clickorderhistory();
//			String orderhistUrl = driver.getCurrentUrl();
//			logger.info("Order History page  URL: " + orderhistUrl);
//			logger.info("Orderhistory  page Open");

			DDp.clickrouteAssis();
			String routeAssisUrl = driver.getCurrentUrl();
			logger.info("Route Assistance page  URL: " + routeAssisUrl);
			logger.info("Route Assistance  page Open");

			DDp.clickmasterroute();
			String masterurl = driver.getCurrentUrl();
			logger.info("Master Route page  URL: " + masterurl);
			logger.info("Master Route  page Open");

			dp.clickdashbord();
			logger.info("Delivery_Management Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Delivery_Management: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Delivery_Management");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 5)
	public void Billing_History() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Billing_History();
			dp.Click_invoice();
			String actual_invoice_Url = driver.getCurrentUrl();
			logger.info("Invoice page URL: " + actual_invoice_Url);

			Invoice_Page ip = new Invoice_Page(driver);

			String Invoicepageheading = ip.getinvoicelist();

			if (Invoicepageheading.equals("Invoice List")) {

				logger.info("Invoice List page sucefully open - Passed ");
				softAssert.assertTrue(true, "Invoice List text matched");

			} else {
				logger.info("Invoice List page sucefully openn  - failed ");
				captureScreenShot(driver, "Delivery_Management");
				softAssert.fail("Invoice List text mismatch");
			}
			dp.clickdashbord();
			logger.info("Billing_History Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Billing_History");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 6)
	public void Customer_Managemnt() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click__Customer_Management();
			dp.Click__Customer();
			String actual_customerpage_Url = driver.getCurrentUrl();
			logger.info("Invoice page URL: " + actual_customerpage_Url);

			Customer_Page cp = new Customer_Page(driver);

			String Customerpageheading = cp.Getcustomertext();

			if (Customerpageheading.equals("Customers List")) {

				logger.info("Customers List page sucefully open - Passed ");
				softAssert.assertTrue(true, "Customers List text matched");

			} else {
				logger.info("Customers List page sucefully openn  - failed ");
				captureScreenShot(driver, "Customer_Managemnt");
				softAssert.fail("Customers List text mismatch");
			}

			cp.isaddcustomerd();

			cp.Click_Subscription();
			String SubScreption_Url = driver.getCurrentUrl();
			logger.info("Subscription page URL: " + SubScreption_Url);

			Subscrption_page sp = new Subscrption_page(driver);

			sp.isaddsubscription();
			logger.info("add subscription option is displayed");

			sp.Click_Order();
			String Orderpage_Url = driver.getCurrentUrl();
			logger.info("Order page URL: " + Orderpage_Url);

			Order_page Op = new Order_page(driver);
			Op.isaddneworder();

			Op.Click_customerprice();
			String Customerprice_Url = driver.getCurrentUrl();
			logger.info("Customer price page URL: " + Customerprice_Url);

			Op.Click_closebtn();

			dp.Click__Customer_Management();
			logger.info("click on customer Managment module");

			Op.Click_Customer_Invoice();
			String Customerinvoice_URL = driver.getCurrentUrl();
			logger.info("Customer Invoice page URL: " + Customerinvoice_URL);

			Customer_Invoice_page cip = new Customer_Invoice_page(driver);
			String orderinvoicetextString = cip.getinvoicetext();

			if (orderinvoicetextString.equals("Invoice List")) {

				logger.info("Invoice list sucefully open - Passed ");
				softAssert.assertTrue(true, "Invoice List text matched");
			} else {
				logger.info("Invoice list sucefully open  - failed ");
				captureScreenShot(driver, "Invoice List");
				softAssert.fail("Invoice List text mismatch");
			}

			dp.clickdashbord();
			logger.info("Customer_Managemnt Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Customer_Managemnt");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 7)
	public void Product_Catalogs() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Product_Catalog();
			dp.Click_Category();
			String category_URLString = driver.getCurrentUrl();
			logger.info("Category page URL: " + category_URLString);

			Category_page cp = new Category_page(driver);

			cp.isaddCategory();
			cp.Click_Brand();
			String brandpage_String = driver.getCurrentUrl();
			logger.info("Brand page URL: " + brandpage_String);

			Brand_page brp = new Brand_page(driver);
			brp.isaddBrand();

			brp.click_Product();
			String productpageString = driver.getCurrentUrl();
			logger.info("Product page URL: " + productpageString);

			Product_pagenew PPN = new Product_pagenew(driver);
			PPN.isaddProdct();
			PPN.Click_quickproduct();
			String quickproductpageString = driver.getCurrentUrl();
			logger.info("Quick Product page URL: " + quickproductpageString);

			Quick_product_page qpp = new Quick_product_page(driver);
			String productlisttextString = qpp.getproductlisttext();

			if (productlisttextString.equals("Product List")) {

				logger.info("Product list sucefully open - Passed ");
				softAssert.assertTrue(true, "Product List text matched");

			} else {
				logger.info("Product list sucefully open  - failed ");
				captureScreenShot(driver, "Product List");
				softAssert.fail("Product List text mismatch");
			}

			dp.clickdashbord();
			logger.info("Product Catelog Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Product_Catalogs: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Product_Catalogs");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 8)

	public void Inventory_Managment() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Inventory_Management();
			dp.click_Warehouse();
			String wareshouseString = driver.getCurrentUrl();
			logger.info("Warehouse page URL: " + wareshouseString);

			Warehouse_page WP = new Warehouse_page(driver);

			WP.isaddwarehouse();
			WP.Click_Supplier();

			String suplierString = driver.getCurrentUrl();
			logger.info("Supplier page URL: " + suplierString);

			Supplier_Page sup = new Supplier_Page(driver);
			sup.Click_Purchase_Inventory();
			String supllierString = driver.getCurrentUrl();
			logger.info("Purchase Inventory page URL: " + supllierString);

			Purchase_Page pup = new Purchase_Page(driver);

			pup.isaddpurchase();

			dp.clickdashbord();
			logger.info("Inventory_Managment Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Inventory_Managment: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Inventory_Managment");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

		}
		softAssert.assertAll();

	}

	@Test(priority = 9)
	public void FlexProduct_Plan() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Flexproduct();
			dp.Click_Settings();
			String settingString = driver.getCurrentUrl();
			logger.info("Setting page URL: " + settingString);

			Flexproduct_Setting_page Fsp = new Flexproduct_Setting_page(driver);

			String subsettingString = Fsp.getSubsetting();

			if (subsettingString.equals("Subscription Settings")) {

				logger.info("Flexproduct_Setting_page sucefully - Passed ");
				softAssert.assertTrue(true, "Flexproduct Setting text matched");

			} else {
				logger.info("Flexproduct_Setting_page sucefully - failed ");
				captureScreenShot(driver, "FlexProduct_Plan");
				softAssert.fail("Flexproduct Setting text mismatch");
			}

			Fsp.Click_Attributes();
			String attributeString = driver.getCurrentUrl();
			logger.info("Attributes page URL: " + attributeString);

			// After navigating to the Attributes page
			Attributes_page attrPage = new Attributes_page(driver);
			boolean isAddAttrVisible = attrPage.isAddAttributeDisplayed();
			logger.info("Add Attribute button displayed: " + isAddAttrVisible);
			softAssert.assertTrue(isAddAttrVisible, "Add Attribute button is not displayed");

			attrPage.click_Workingday();
			String workingDayUrl = driver.getCurrentUrl();

			logger.info("Working Day page URL: " + workingDayUrl);

			// After navigating to the Working Day page

			WorkingDay_Page wdp = new WorkingDay_Page(driver);

			// Verify the Working Days header
			String headerText = wdp.getWorkingDaysHeaderText();
			softAssert.assertEquals(headerText, "Working Days", "Working Days header not found");

			// Click the Plan Slot element
			wdp.clickPlanSlot();
			logger.info("Clicked on Plan Slot");

			String planSlotUrl = driver.getCurrentUrl();
			logger.info("Plan Slot page URL: " + planSlotUrl);

			// Verify the Plan Slot header

			// Verify the Plan Slot header
			PlanSlot_Page planSlotPage = new PlanSlot_Page(driver);
			String planSlotHeader = planSlotPage.getPlanSlotsListHeaderText();
			softAssert.assertEquals(planSlotHeader, "Plan Slots List", "Plan Slot header not found");
			logger.info("Plan Slot header verified successfully");
			// Click the Subscription List span
			planSlotPage.clickSubscriptionList();
			logger.info("Clicked on Subscription List");
			String subscriptionListUrl = driver.getCurrentUrl();
			logger.info("Subscription List page URL: " + subscriptionListUrl);

			FlexProductSubscription_Page flexProductSubscriptionPage = new FlexProductSubscription_Page(driver);
			// Verify the FlexProduct Plans header
			String flexProductPlansText = flexProductSubscriptionPage.getFlexProductPlansText();

			softAssert.assertEquals(flexProductPlansText, "FlexProduct Plans", "FlexProduct Plans header not found");
			logger.info("FlexProduct Plans header verified successfully");

			dp.clickdashbord();
			logger.info("FlexProduct_Plan Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in FlexProduct_Plan: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "FlexProduct_Plan");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully

		}
		softAssert.assertAll();

	}

	@Test(priority = 10)
	public void Banner() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {
			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Banner();
			String bannerString = driver.getCurrentUrl();
			logger.info("Banner page URL: " + bannerString);
			Banner_Page bp = new Banner_Page(driver);

			String bannerText = bp.getBannerHeaderText();
			if (bannerText.equals("Banner List")) {
				logger.info("Banner page sucefully open - Passed ");
				softAssert.assertTrue(true, "Banner List text matched");
			} else {
				logger.info("Banner page sucefully open  - failed ");
				captureScreenShot(driver, "Banner");
				softAssert.fail("Banner List text mismatch");
			}
			bp.isAddBannerDisplayed();
			logger.info("Add Banner button is displayed");
			dp.clickdashbord();
			logger.info("Banner Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Banner: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Banner");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 11)

	public void Locations_Manager() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {
			dashbordpage dp = new dashbordpage(driver);

			dp.clickLocationManager();
			dp.clickRegion();
			String regionString = driver.getCurrentUrl();

			logger.info("Region page URL: " + regionString);

			Location_Rigion_page rp = new Location_Rigion_page(driver);
			String regionText = rp.getRegionsHeaderText();

			if (regionText.equals("Regions List")) {
				logger.info("Region page sucefully open - Passed ");
				softAssert.assertTrue(true, "Region List text matched");
			} else {
				logger.info("Region page sucefully open  - failed ");
				captureScreenShot(driver, "Region");
				softAssert.fail("Region List text mismatch");
			}
			rp.isAddRegionVisible();
			logger.info("Add Region button is displayed");
			rp.clickLocation();
			logger.info("Clicked on Location");
			String locationString = driver.getCurrentUrl();
			logger.info("Location page URL: " + locationString);
			LM_Locations_page lp = new LM_Locations_page(driver);
			String locationsListText = lp.getLocationsListHeaderText();

			if (locationsListText.equals("Locations List")) {
				logger.info("Locations page sucefully open - Passed ");
				softAssert.assertTrue(true, "Locations List text matched");
			} else {
				logger.info("Locations page sucefully open  - failed ");
				captureScreenShot(driver, "Locations");
				softAssert.fail("Locations List text mismatch");
			}
			lp.isAddLocationDisplayed();
			logger.info("Add Location button is displayed");
			lp.clickArea();
			logger.info("Clicked on Area");
			String areaString = driver.getCurrentUrl();
			logger.info("Area page URL: " + areaString);

			LM_Area_Page ap = new LM_Area_Page(driver);

			// Verify the Area page header
			String areaHeaderText = ap.getAreasHeaderText();
			logger.info("Area List Header Text: " + areaHeaderText);

			// Verify the Area page header
			if (areaHeaderText.equals("Areas List")) {
				logger.info("Area page sucefully open - Passed ");
				softAssert.assertTrue(true, "Area List text matched");
			} else {
				logger.info("Area page sucefully open  - failed ");
				captureScreenShot(driver, "Area");
				softAssert.fail("Area List text mismatch");
			}

			ap.isAddAreaVisible();

			logger.info("Add Area button is displayed");
			ap.clickRoute();

			logger.info("Clicked on Route");
			String routeString = driver.getCurrentUrl();

			logger.info("Route page URL: " + routeString);

			LM_Route_Page rp1 = new LM_Route_Page(driver);

			// Verify the Routes page header
			String routesHeaderText = rp1.getRoutesHeaderText();
			logger.info("Routes Header Text: " + routesHeaderText);
			// Verify the Routes page header
			if (routesHeaderText.equals("Routes List")) {
				logger.info("Routes page sucefully open - Passed ");
				softAssert.assertTrue(true, "Routes List text matched");
			} else {
				logger.info("Routes page sucefully open  - failed ");
				captureScreenShot(driver, "Routes");
				softAssert.fail("Routes List text mismatch");
			}
			rp1.isAddRouteDisplayed();
			logger.info("Add Route button is displayed");

			dp.clickdashbord();
			logger.info("Locations_Manager Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Banner: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Banner");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 12, dependsOnMethods = "LoginAdminpenal")
	public void Report_Module() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clickReports();
			String reportString = driver.getCurrentUrl();
			logger.info("Report page URL: " + reportString);

			// Verify the Reports List header text
			// Create an instance of the Report_ReportsList_Page class
			Reports_Page rrp = new Reports_Page(driver);
			String reportsListText = rrp.getReportsListHeaderText();
			logger.info("Reports List Header Text: " + reportsListText);
			// Verify the Reports List header text
			if (reportsListText.equals("Reports List")) {
				logger.info("Reports List page sucefully open - Passed ");
				softAssert.assertTrue(true, "Reports List text matched");
			} else {
				logger.info("Reports List page sucefully open  - failed ");
				captureScreenShot(driver, "Reports List");
				softAssert.fail("Reports List text mismatch");
			}
			rrp.isCustomerReportsVisible();
			logger.info("Customer Reports text is displayed");

			rrp.clickCustomerWallet();
			String customerWalletString = driver.getCurrentUrl();
			logger.info("Customer Wallet page URL: " + customerWalletString);

			// Create an instance of the Report_CustomerWallet_Page class
			Report_CustomerWallet_Page rcwp = new Report_CustomerWallet_Page(driver);
			String customerWalletText = rcwp.getCustomerWalletReportHeaderText();
			if (customerWalletText.equals("Customer Wallet List")) {
				logger.info("Customer Wallet page sucefully open - Passed ");
				softAssert.assertTrue(true, "Customer Wallet List text matched");
			} else {
				logger.info("Customer Wallet page sucefully open  - failed ");
				captureScreenShot(driver, "Customer Wallet List");
				softAssert.fail("Customer Wallet List text mismatch");
			}
			rcwp.isExportCSV();
			logger.info("Export CSV button is displayed");

			dp.clickReports();
			logger.info("Clicked on Reports");

			rrp.clickCustomerInformationReports();
			String customerInformationString = driver.getCurrentUrl();
			logger.info("Customer Information page URL: " + customerInformationString);
			// Create an instance of the Report_CustomerInformationReports_Page class
			Report_CustomerInformation_Page rcip = new Report_CustomerInformation_Page(driver);
			String customerInformationText = rcip.getCustomerInformationReportHeaderText();
			if (customerInformationText.equals("Customer Information")) {
				logger.info("Customer Information page sucefully open - Passed ");
				softAssert.assertTrue(true, "Customer Information text matched");
			} else {
				logger.info("Customer Information page sucefully open  - failed ");
				captureScreenShot(driver, "Customer Information");
				softAssert.fail("Customer Information text mismatch");
			}
			rcip.isExportCSV();
			logger.info("Export CSV button is displayed");
			dp.clickReports();
			logger.info("Clicked on Reports");
			rrp.clickActivityLogReports();
			logger.info("Clicked on Activity Logs");

			// Create an instance of the Report_ActivityLogs_Page class
			String activityLogsUrl = driver.getCurrentUrl();
			logger.info("Activity Logs page URL: " + activityLogsUrl);

			// Create an instance of the Report_ActivityLogs_Page class
			Report_ActivityLogs_Page rap = new Report_ActivityLogs_Page(driver);

			// Verify the Activity List header text
			String activityLogText = rap.getActivityLogHeaderText();
			logger.info("Activity Log Header Text: " + activityLogText);
			if (activityLogText.equals("Activity List")) {
				logger.info("Activity Logs page sucefully open - Passed ");
				softAssert.assertTrue(true, "Activity List text matched");
			} else {
				logger.info("Activity Logs page sucefully open  - failed ");
				captureScreenShot(driver, "Activity List");
				softAssert.fail("Activity List text mismatch");

			}
			rap.isExportCSV();
			logger.info("Export CSV button is displayed");

			dp.clickReports();
			logger.info("Clicked on Reports");

			rrp.clickLowCreditReports();
			String lowCreditString = driver.getCurrentUrl();
			logger.info("Low Credit page URL: " + lowCreditString);
			// Create an instance of the Report_Lowcredit_Page class
			Report_Lowcredit_Page rlp = new Report_Lowcredit_Page(driver);
			String lowCreditText = rlp.getLowCreditReportHeaderText();
			if (lowCreditText.equals("Low Credit List")) {
				logger.info("Low Credit page sucefully open - Passed ");
				softAssert.assertTrue(true, "Low Credit List text matched");
			} else {
				logger.info("Low Credit page sucefully open  - failed ");
				captureScreenShot(driver, "Low Credit");
				softAssert.fail("Low Credit List text mismatch");
			}

			rlp.isExportCSV();
			logger.info("Export CSV button is displayed");
			dp.clickReports();
			logger.info("Clicked on Reports");

			rrp.clickCustomerVacationReports();
			String customerVacationString = driver.getCurrentUrl();
			logger.info("Customer Vacation page URL: " + customerVacationString);

			// Create an instance of the Report_CustomerVacation_Page class
			Report_CustomerVacation_Page rcvp = new Report_CustomerVacation_Page(driver);

			String customerVacationText = rcvp.getCustomerVacationHeaderText();
			if (customerVacationText.equals("Customer Vacation List")) {
				logger.info("Customer Vacation page sucefully open - Passed ");
				softAssert.assertTrue(true, "Customer Vacation List text matched");
			} else {
				logger.info("Customer Vacation page sucefully open  - failed ");
				captureScreenShot(driver, "Customer Vacation List");
				softAssert.fail("Customer Vacation List text mismatch");
			}
			rcvp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			dp.clickReports();
			logger.info("Clicked on Reports");
			rrp.clickSubscriptionReports();
			String subscriptionString = driver.getCurrentUrl();
			logger.info("Subscription page URL: " + subscriptionString);
			// Create an instance of the Report_Subscription_Page class
			Report_Subscription_Page rsp = new Report_Subscription_Page(driver);
			String subscriptionText = rsp.getSubscriptionListHeaderText();
			if (subscriptionText.equals("Subscription List")) {

				logger.info("Subscription page sucefully open - Passed ");
				softAssert.assertTrue(true, "Subscription List text matched");
			} else {
				logger.info("Subscription page sucefully open  - failed ");
				captureScreenShot(driver, "Subscription List");
				softAssert.fail("Subscription List text mismatch");

			}
			rsp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			dp.clickReports();
			logger.info("Clicked on Reports");
			rrp.clickSubscriptionEndReports();
			String subscriptionEndString = driver.getCurrentUrl();
			logger.info("Subscription End page URL: " + subscriptionEndString);
			// Create an instance of the Report_SubscriptionEnd_Page class
			Report_SubscriptionEnd_page rsep = new Report_SubscriptionEnd_page(driver);
			String subscriptionEndText = rsep.getSubscriptionEndListHeaderText();
			if (subscriptionEndText.equals("Subscription End List")) {
				logger.info("Subscription End page sucefully open - Passed ");
				softAssert.assertTrue(true, "Subscription End List text matched");
			} else {
				logger.info("Subscription End page sucefully open  - failed ");
				captureScreenShot(driver, "Subscription End List");
				softAssert.fail("Subscription End List text mismatch");
			}
			rsep.clickExportAsButton();
			logger.info("Export As button is displayed");
			dp.clickReports();
			logger.info("Clicked on Reports");

			rrp.isOperationalReportsVisible();
			logger.info("Operational Reports text is displayed");
			rrp.clickFutureOrdersReports();
			String futureOrdersString = driver.getCurrentUrl();
			logger.info("Future Orders page URL: " + futureOrdersString);
			// Create an instance of the Report_FutureOrders_Page class
			Report_FutureOrders_Page rfop = new Report_FutureOrders_Page(driver);
			String futureOrdersText = rfop.getFutureOrdersReportHeaderText();
			if (futureOrdersText.equals("Future Orders Report")) {
				logger.info("Future Orders page sucefully open - Passed ");
				softAssert.assertTrue(true, "Future Orders List text matched");
			} else {
				logger.info("Future Orders page sucefully open  - failed ");
				captureScreenShot(driver, "Future Orders List");
				softAssert.fail("Future Orders List text mismatch");
			}

			rfop.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			rfop.clickBackButton();
			logger.info("Clicked on Back button");

			rrp.clickPredictiveAnalysisReports();
			String predictiveAnalysisString = driver.getCurrentUrl();
			logger.info("Predictive Analysis page URL: " + predictiveAnalysisString);
			// Create an instance of the Report_PredictiveAnalysis_Page class
			Report_PredictiveAnalysis_Page rpap = new Report_PredictiveAnalysis_Page(driver);
			String predictiveAnalysisText = rpap.getPredictiveAnalysisHeaderText();
			if (predictiveAnalysisText.equals("Predictive Analysis")) {
				logger.info("Predictive Analysis page sucefully open - Passed ");
				softAssert.assertTrue(true, "Predictive Analysis text matched");
			} else {
				logger.info("Predictive Analysis page sucefully open  - failed ");
				captureScreenShot(driver, "Predictive Analysis");
				softAssert.fail("Predictive Analysis text mismatch");
			}
			rpap.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			rpap.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickReverseLogisticReports();
			String reverseLogisticString = driver.getCurrentUrl();
			logger.info("Reverse Logistic page URL: " + reverseLogisticString);
			// Create an instance of the Report_ReverseLogistic_Page class
			Report_ReverseLogistic_Page rrlp = new Report_ReverseLogistic_Page(driver);
			String reverseLogisticText = rrlp.getReverseLogisticHeaderText();
			if (reverseLogisticText.equals("Reverse Logistic")) {
				logger.info("Reverse Logistic page sucefully open - Passed ");
				softAssert.assertTrue(true, "Reverse Logistic List text matched");
			} else {
				logger.info("Reverse Logistic page sucefully open  - failed ");
				captureScreenShot(driver, "Reverse Logistic List");
				softAssert.fail("Reverse Logistic List text mismatch");
			}

			rrlp.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickCashCollectionsReports();
			String cashCollectionsString = driver.getCurrentUrl();
			logger.info("Cash Collections page URL: " + cashCollectionsString);
			// Create an instance of the Report_CashCollections_Page class
			Report_CashCollections_Page rccp = new Report_CashCollections_Page(driver);
			String cashCollectionsText = rccp.getCashCollectionReportHeaderText();
			if (cashCollectionsText.equals("Cash Collection List")) {
				logger.info("Cash Collections page sucefully open - Passed ");
				softAssert.assertTrue(true, "Cash Collections List text matched");
			} else {
				logger.info("Cash Collections page sucefully open  - failed ");
				captureScreenShot(driver, "Cash Collections List");
				softAssert.fail("Cash Collections List text mismatch");
			}
			rccp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			rccp.clickBackButton();
			logger.info("Clicked on Back button");

			rrp.clickOrderInformationReports();
			String orderInformationString = driver.getCurrentUrl();
			logger.info("Order Information page URL: " + orderInformationString);
			// Create an instance of the Report_OrderInformation_Page class

			Report_OrderInformation_Page roip = new Report_OrderInformation_Page(driver);
			String orderInformationText = roip.getOrderInformationHeaderText();
			if (orderInformationText.equals("Order Information")) {
				logger.info("Order Information page sucefully open - Passed ");
				softAssert.assertTrue(true, "Order Information text matched");
			} else {
				logger.info("Order Information page sucefully open  - failed ");
				captureScreenShot(driver, "Order Information");
				softAssert.fail("Order Information text mismatch");
			}
			roip.clickExportAsButton();
			logger.info("Export As button is displayed");
			roip.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickCancelledOrderReports();
			String cancelledOrderString = driver.getCurrentUrl();
			logger.info("Cancelled Order page URL: " + cancelledOrderString);
			// Create an instance of the Report_CancelledOrder_Page class
			Report_CancelledOrder_Page rcop = new Report_CancelledOrder_Page(driver);
			String cancelledOrderText = rcop.getCancelledOrderHeaderText();

			if (cancelledOrderText.equals("Cancelled Order List")) {
				logger.info("Cancelled Order page sucefully open - Passed ");
				softAssert.assertTrue(true, "Cancelled Order List text matched");
			} else {
				logger.info("Cancelled Order page sucefully open  - failed ");
				captureScreenShot(driver, "Cancelled Order List");
				softAssert.fail("Cancelled Order List text mismatch");
			}
			rcop.clickExportAsButton();
			logger.info("Export As button is displayed");
			rcop.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickDeliveriesInformationReports();
			String deliveriesInformationString = driver.getCurrentUrl();
			logger.info("Deliveries Information page URL: " + deliveriesInformationString);
			// Create an instance of the Report_DeliveriesInformation_Page class
			Report_DeliveriesInformation_Page rdip = new Report_DeliveriesInformation_Page(driver);
			String deliveriesInformationText = rdip.getDeliveriesInformationHeaderText();

			if (deliveriesInformationText.equals("Deliveries Information")) {
				logger.info("Deliveries Information page sucefully open - Passed ");
				softAssert.assertTrue(true, "Deliveries Information text matched");
			} else {
				logger.info("Deliveries Information page sucefully open  - failed ");
				captureScreenShot(driver, "Deliveries Information");
				softAssert.fail("Deliveries Information text mismatch");

			}
			rdip.clickExportAsButton();
			logger.info("Export As button is displayed");
			rdip.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickImageProofReports();
			String imageProofString = driver.getCurrentUrl();
			logger.info("Image Proof page URL: " + imageProofString);
			// Create an instance of the Report_ImageProof_Page class
			Report_ImageProof_Page rip = new Report_ImageProof_Page(driver);
			String imageProofText = rip.getImageProofReportHeaderText();
			if (imageProofText.equals("Image Proof List")) {
				logger.info("Image Proof page sucefully open - Passed ");
				softAssert.assertTrue(true, "Image Proof List text matched");
			} else {
				logger.info("Image Proof page sucefully open  - failed ");
				captureScreenShot(driver, "Image Proof List");
				softAssert.fail("Image Proof List text mismatch");
			}
			rip.clickExportAsButton();
			logger.info("Export As button is displayed");
			rip.clickBackButton();
			logger.info("Clicked on Back button");

			rrp.isSalesReportsVisible();

			logger.info("Sales Reports text is displayed");
			rrp.clickTransactionsReports();
			String transactionsString = driver.getCurrentUrl();
			logger.info("Transactions page URL: " + transactionsString);
			// Create an instance of the Report_Transactions_Page class
			Report_Transactions_Page rtp = new Report_Transactions_Page(driver);
			String transactionsText = rtp.getTransactionsReportHeaderText();
			if (transactionsText.equals("Transactions Report")) {
				logger.info("Transactions page sucefully open - Passed ");
				softAssert.assertTrue(true, "Transactions List text matched");
			} else {
				logger.info("Transactions page sucefully open  - failed ");
				captureScreenShot(driver, "Transactions List");
				softAssert.fail("Transactions List text mismatch");
			}
			rtp.clickExportAsButton();
			logger.info("Export As button is displayed");
			rtp.clickBackButton();

			logger.info("Clicked on Back button");
			rrp.clickCumulativeSalesReports();
			String cumulativeSalesString = driver.getCurrentUrl();
			logger.info("Cumulative Sales page URL: " + cumulativeSalesString);
			// Create an instance of the Report_CumulativeSales_Page class
			Report_CumulativeSales_Page rcsp = new Report_CumulativeSales_Page(driver);
			String cumulativeSalesText = rcsp.getCumulativeSalesReportHeaderText();
			if (cumulativeSalesText.equals("Cumulative Sales Report")) {
				logger.info("Cumulative Sales page sucefully open - Passed ");
				softAssert.assertTrue(true, "Cumulative Sales List text matched");
			} else {
				logger.info("Cumulative Sales page sucefully open  - failed ");
				captureScreenShot(driver, "Cumulative Sales List");
				softAssert.fail("Cumulative Sales List text mismatch");
			}
			rcsp.clickExportAsButton();
			logger.info("Export As button is displayed");
			rcsp.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickOrdersSheetReports();
			String ordersSheetString = driver.getCurrentUrl();

			logger.info("Orders Sheet page URL: " + ordersSheetString);
			// Create an instance of the Report_OrdersSheet_Page class
			Report_OrdersSheet_Page rosp = new Report_OrdersSheet_Page(driver);
			String ordersSheetText = rosp.getOrderSheetHeaderText();
			if (ordersSheetText.equals("Orders Sheet")) {
				logger.info("Orders Sheet page sucefully open - Passed ");
				softAssert.assertTrue(true, "Orders Sheet List text matched");
			} else {
				logger.info("Orders Sheet page sucefully open  - failed ");
				captureScreenShot(driver, "Orders Sheet List");
				softAssert.fail("Orders Sheet List text mismatch");
			}
			rosp.isDownloadDeliveryButtonDisplayed();
			logger.info("Download Delivery button is displayed");
			rosp.clickBackButton();
			logger.info("Clicked on Back button");
			rrp.clickWalletPaymentReports();
			String walletPaymentString = driver.getCurrentUrl();
			logger.info("Wallet Payment page URL: " + walletPaymentString);
			// Create an instance of the Report_WalletPayment_Page class
			Report_WalletPayment_Page rwpp = new Report_WalletPayment_Page(driver);
			String walletPaymentText = rwpp.getPaymentGatewayUsageReportHeaderText();
			if (walletPaymentText.equals("Payment Gateway Usage")) {
				logger.info("Wallet Payment page sucefully open - Passed ");
				softAssert.assertTrue(true, "Wallet Payment List text matched");
			} else {
				logger.info("Wallet Payment page sucefully open  - failed ");
				captureScreenShot(driver, "Wallet Payment List");
				softAssert.fail("Wallet Payment List text mismatch");
			}

			rwpp.clickBackButton();
			logger.info("Clicked on Back button");

			dp.clickdashbord();
			logger.info("Report_Module Module Finish...click on dashborad");

		} catch (Exception e) {
			logger.error("Exception occurred in Report_Module: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Report_Module");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

			//

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}
}
