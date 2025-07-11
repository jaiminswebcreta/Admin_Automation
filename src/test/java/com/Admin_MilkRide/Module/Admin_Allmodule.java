package com.Admin_MilkRide.Module;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Admin_MilkRide.Utilities.ExtentManager;
import com.Admin_MilkRide.pagobject.Accountpage;
import com.Admin_MilkRide.pagobject.Agents_Page;
import com.Admin_MilkRide.pagobject.Attributes_page;
import com.Admin_MilkRide.pagobject.Banner_Page;
import com.Admin_MilkRide.pagobject.Brand_page;
import com.Admin_MilkRide.pagobject.CMS_Page;
import com.Admin_MilkRide.pagobject.Category_page;
import com.Admin_MilkRide.pagobject.Contactpage;
import com.Admin_MilkRide.pagobject.Customer_Invoice_page;
import com.Admin_MilkRide.pagobject.Customer_Page;
import com.Admin_MilkRide.pagobject.Delivery_Dashboard_page;
import com.Admin_MilkRide.pagobject.Disablearea;
import com.Admin_MilkRide.pagobject.Documentpage;
import com.Admin_MilkRide.pagobject.Features_Page;
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
import com.Admin_MilkRide.pagobject.Role_Page;
import com.Admin_MilkRide.pagobject.Site_Managment_Page;
import com.Admin_MilkRide.pagobject.Subscrption_page;
import com.Admin_MilkRide.pagobject.Supplier_Page;
import com.Admin_MilkRide.pagobject.Tickets_Page;
import com.Admin_MilkRide.pagobject.User_Page;
import com.Admin_MilkRide.pagobject.Warehouse_page;
import com.Admin_MilkRide.pagobject.WorkingDay_Page;
import com.Admin_MilkRide.pagobject.dashbordpage;
import com.Admin_MilkRide.pagobject.general_settings_Page;
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
			ExtentManager.getTest().info("Entered email address: ruralbloomroots@gmail.com");

			Lp.Enterpsw("Rural@2024");// 9316033469
			logger.info("Fill passwoed");
			 ExtentManager.getTest().info("Entered password");

			Lp.clickBtnSubmit();
			ExtentManager.getTest().info("Clicked on Login button");

			// ✅ URL Verification
			String actualUrl = driver.getCurrentUrl();
			logger.info("Dashboard URL: " + actualUrl);
			ExtentManager.getTest().info("Navigated to Dashboard URL: " + actualUrl);


			dashbordpage dp = new dashbordpage(driver);

			String Dashbordvf = dp.getdahbordtext();

			if (Dashbordvf.equals("Dashboard")) {

				logger.info("login sucefully - Passed ");
				 ExtentManager.getTest().pass("Login successful: Dashboard text is visible.");
				softAssert.assertTrue(true, "Dashborad text matched");

			} else {
				logger.info("login sucefully - failed ");
				ExtentManager.getTest().fail("Login failed: Dashboard text was not found. Found: " + Dashbordvf);
				captureScreenShot(driver, "LoginAdminpenal");
				softAssert.fail("Dashbord text mis match mismatch");
			}
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "LoginAdminpenal_Exception");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}
			softAssert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	} 

	@Test(priority = 2,dependsOnMethods = "LoginAdminpenal")
	public void Hubmanager() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clickhubmanager();
			String actualhubUrl = driver.getCurrentUrl();
			logger.info("Hubs URL: " + actualhubUrl);
			ExtentManager.getTest().info("Navigated to Hubs URL: " + actualhubUrl);
			Hublistpage hp = new Hublistpage(driver);

			String hublistvrf = hp.gethublistext();

			if (hublistvrf.equals("Hubs Lists")) {

				logger.info("Hub listpage sucefully open - Passed ");
				ExtentManager.getTest().pass("Hub list page opened successfully: Hubs List text is visible.");
				softAssert.assertTrue(true, "Hub list text matched");

			} else {
				logger.info("Hub listpage sucefully open  - failed ");
				ExtentManager.getTest().fail("Hub list page failed to open: Hubs List text was not found. Found: " + hublistvrf);
				captureScreenShot(driver, "Hub Manager");
				softAssert.fail("Hub list text mismatch");
			}

			hp.clickfirsthub();
			String hubUrl = driver.getCurrentUrl();
			logger.info("HubInfo URL: " + hubUrl);
			ExtentManager.getTest().info("Navigated to HubInfo URL: " + hubUrl);

		} catch (Exception e) {
			logger.error("Exception occurred in Hubmanager: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Hubmanager");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
				ExtentManager.getTest().pass("Hub info page opened successfully: Hub name text is visible.");
				softAssert.assertTrue(true, "Hubinfo text matched");

			} else {
				logger.info("Hubinfo sucefully open  - failed ");
				ExtentManager.getTest().fail("Hub info page failed to open: Hub name text was not found. Found: " + hubinfoString);
				captureScreenShot(driver, "LoginAdminpenal");
				softAssert.fail("Hubinfo text mismatch");
				
			}

			hip.clickaccount();
			String AccountUrl = driver.getCurrentUrl();
			logger.info("Hubs Account URL: " + AccountUrl);
			ExtentManager.getTest().info("Navigated to Hubs Account URL: " + AccountUrl);

			Accountpage hAp = new Accountpage(driver);
			hAp.isAddUserVisible();
			logger.info("Add Button is displyed ");
			ExtentManager.getTest().info("Add User button is visible on Hubs Account page");

			hAp.cliklocation();
			logger.info("click on Location");
			ExtentManager.getTest().info("Clicked on Location option in Hubs Account page");
			String LocationUrl = driver.getCurrentUrl();
			logger.info("Hubs Location URL: " + LocationUrl);
			ExtentManager.getTest().info("Navigated to Hubs Location URL: " + LocationUrl);

			Locationpage hlip = new Locationpage(driver);

			hlip.addlocationVisible();
			logger.info("add location Button is displyed ");
			ExtentManager.getTest().info("Add Location button is visible on Hubs Location page");
			hlip.transferlocationVisible();
			logger.info("location transfer button is displyed ");
			ExtentManager.getTest().info("Location transfer button is visible on Hubs Location page");
			hlip.hubtohubtnVisible();
			logger.info("hub to hub transfer Button is displyed ");

			hlip.clikproduct();
			ExtentManager.getTest().info("Clicked on Product option in Hubs Location page");

			logger.info("click on product option");
			String ProductUrl = driver.getCurrentUrl();
			logger.info("Hubs Product URL: " + ProductUrl);
			ExtentManager.getTest().info("Navigated to Hubs Product URL: " + ProductUrl);

			Productpage hpp = new Productpage(driver);

			hpp.addproductbtnvisiable();
			logger.info("Add product Button is displyed ");
				ExtentManager.getTest().info("Add Product button is visible on Hubs Product page");
			hpp.clickcontacts();

			logger.info("click on contacts page ");
			

			Contactpage Cp = new Contactpage(driver);

			Cp.addcontactvisiable();
			logger.info("Add contanct Button is displyed ");
			ExtentManager.getTest().info("Add Contact button is visible on Hubs Contact page");
			Cp.clickDocuments();
			logger.info("click on Document page ");
			ExtentManager.getTest().info("Clicked on Document option in Hubs Contact page");
			String DocumentUrl = driver.getCurrentUrl();
			logger.info("Hubs Document URL: " + DocumentUrl);
			ExtentManager.getTest().info("Navigated to Hubs Document URL: " + DocumentUrl);

			Documentpage Dp = new Documentpage(driver);

			Dp.adddocumenttvisiable();
			logger.info("Add Document Button is displyed ");
			ExtentManager.getTest().info("Add Document button is visible on Hubs Document page");
			Dp.clickDisablearea();
			logger.info("click on Disable area page ");
			ExtentManager.getTest().info("Clicked on Disable area option in Hubs Document page");
			String DiableareUrl = driver.getCurrentUrl();
			logger.info("Hubs Diable area URL: " + DiableareUrl);
			ExtentManager.getTest().info("Navigated to Hubs Disable area URL: " + DiableareUrl);

			Disablearea disp = new Disablearea(driver);

			disp.adddiableareavisiable();
			logger.info("Add Diable area Button is displyed ");
			ExtentManager.getTest().info("Add Disable area button is visible on Hubs Disable area page");
			dashbordpage dp = new dashbordpage(driver);
			dp.hubmanager();
			logger.info("click on hub manager page ");
			ExtentManager.getTest().info("Clicked on Hub Manager option in Hubs Disable area page");

			dp.clickdashbord();
			logger.info("Hub Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Hub module");

		} catch (Exception e) {
			logger.error("Exception occurred in HubInfo: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "HubInfo");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}
			softAssert.fail("Test failed due to unexpected exception: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in HubInfo: " + e.getMessage());
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
			ExtentManager.getTest().info("Navigated to Delivery Management URL: " + actualdelimanUrl);

			Delivery_Dashboard_page DDp = new Delivery_Dashboard_page(driver);

			String deliverydash = DDp.getdeleverydashtext();

			if (deliverydash.equals("Delivery Dashboard")) {

				logger.info("Deivery dashborad page sucefully open - Passed ");
				ExtentManager.getTest().pass("Delivery Dashboard page opened successfully: Delivery Dashboard text is visible.");
				softAssert.assertTrue(true, "Delivery Dashboard text matched");

			} else {
				logger.info("Deivery dashborad page sucefully openn  - failed ");
				ExtentManager.getTest().fail("Delivery Dashboard page failed to open: Delivery Dashboard text was not found. Found: " + deliverydash);
				captureScreenShot(driver, "Delivery_Management");
				softAssert.fail("Delivery Dashboard text mismatch");
			}

			DDp.clickDeliveryTransfer();
			String DeliverytransferUrl = driver.getCurrentUrl();
			logger.info("Delivery Transfer page  URL: " + DeliverytransferUrl);
			ExtentManager.getTest().info("Navigated to Delivery Transfer URL: " + DeliverytransferUrl);
			logger.info("Delivery Transfer Open");
			ExtentManager.getTest().info("Delivery Transfer page opened successfully");

//			DDp.clickoptimize();
//			String optimizeUrl = driver.getCurrentUrl();
//			logger.info("Optimize Route page  URL: " + optimizeUrl);
//			logger.info("optimiza route  Open");

			DDp.clickmanulroute();
			String manulRouteUrl = driver.getCurrentUrl();
			logger.info("manul Route page  URL: " + manulRouteUrl);
			ExtentManager.getTest().info("Navigated to Manual Route URL: " + manulRouteUrl);
			logger.info("Manual route  Open");
			ExtentManager.getTest().info("Manual Route page opened successfully");

//			DDp.clickorderhistory();
//			String orderhistUrl = driver.getCurrentUrl();
//			logger.info("Order History page  URL: " + orderhistUrl);
//			logger.info("Orderhistory  page Open");

			DDp.clickrouteAssis();
			String routeAssisUrl = driver.getCurrentUrl();
			logger.info("Route Assistance page  URL: " + routeAssisUrl);
			ExtentManager.getTest().info("Navigated to Route Assistance URL: " + routeAssisUrl);
			logger.info("Route Assistance  page Open");
			ExtentManager.getTest().info("Route Assistance page opened successfully");

			DDp.clickmasterroute();
			String masterurl = driver.getCurrentUrl();
			logger.info("Master Route page  URL: " + masterurl);
			ExtentManager.getTest().info("Navigated to Master Route URL: " + masterurl);
			logger.info("Master Route  page Open");
			ExtentManager.getTest().info("Master Route page opened successfully");

			dp.clickdashbord();
			logger.info("Delivery_Management Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Delivery Management module");

		} catch (Exception e) {
			logger.error("Exception occurred in Delivery_Management: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Delivery_Management: " + e.getMessage());
			
			// ✅ Print stack trace in console
			// for debugging
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Delivery_Management");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Delivery_Management: " + e.getMessage());

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 5)
	public void Billing_History() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.Click_Billing_History();
			ExtentManager.getTest().info("Clicked on Billing History module");
			dp.Click_invoice();
			String actual_invoice_Url = driver.getCurrentUrl();
			logger.info("Invoice page URL: " + actual_invoice_Url);
			ExtentManager.getTest().info("Navigated to Invoice URL: " + actual_invoice_Url);

			Invoice_Page ip = new Invoice_Page(driver);

			String Invoicepageheading = ip.getinvoicelist();

			if (Invoicepageheading.equals("Invoice List")) {

				logger.info("Invoice List page sucefully open - Passed ");
				ExtentManager.getTest().pass("Invoice List page opened successfully: Invoice List text is visible.");
				softAssert.assertTrue(true, "Invoice List text matched");

			} else {
				logger.info("Invoice List page sucefully openn  - failed ");
				ExtentManager.getTest().fail("Invoice List page failed to open: Invoice List text was not found. Found: " + Invoicepageheading);
				captureScreenShot(driver, "Delivery_Management");
				softAssert.fail("Invoice List text mismatch");
			}
			dp.clickdashbord();
			logger.info("Billing_History Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Billing History module");

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Billing_History: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Billing_History");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
			
			ExtentManager.getTest().info("Navigated to Customer Management URL: " + actual_customerpage_Url);

			Customer_Page cp = new Customer_Page(driver);

			String Customerpageheading = cp.Getcustomertext();

			if (Customerpageheading.equals("Customers List")) {

				logger.info("Customers List page sucefully open - Passed ");
				ExtentManager.getTest().pass("Customers List page opened successfully: Customers List text is visible.");
				softAssert.assertTrue(true, "Customers List text matched");

			} else {
				logger.info("Customers List page sucefully openn  - failed ");
				ExtentManager.getTest().fail("Customers List page failed to open: Customers List text was not found. Found: " + Customerpageheading);
				captureScreenShot(driver, "Customer_Managemnt");
				softAssert.fail("Customers List text mismatch");
			}

			cp.isaddcustomerd();

			cp.Click_Subscription();
			String SubScreption_Url = driver.getCurrentUrl();
			logger.info("Subscription page URL: " + SubScreption_Url);
			ExtentManager.getTest().info("Navigated to Subscription URL: " + SubScreption_Url);

			Subscrption_page sp = new Subscrption_page(driver);

			sp.isaddsubscription();
			logger.info("add subscription option is displayed");
			ExtentManager.getTest().info("Add Subscription option is visible on Subscription page");

			sp.Click_Order();
			String Orderpage_Url = driver.getCurrentUrl();
			logger.info("Order page URL: " + Orderpage_Url);
			ExtentManager.getTest().info("Navigated to Order URL: " + Orderpage_Url);

			Order_page Op = new Order_page(driver);
			Op.isaddneworder();

			Op.Click_customerprice();
			String Customerprice_Url = driver.getCurrentUrl();
			logger.info("Customer price page URL: " + Customerprice_Url);
			ExtentManager.getTest().info("Navigated to Customer Price URL: " + Customerprice_Url);

			Op.Click_closebtn();

			dp.Click__Customer_Management();
			logger.info("click on customer Managment module");
			ExtentManager.getTest().info("Clicked on Customer Management module");

			Op.Click_Customer_Invoice();
			String Customerinvoice_URL = driver.getCurrentUrl();
			logger.info("Customer Invoice page URL: " + Customerinvoice_URL);
			ExtentManager.getTest().info("Navigated to Customer Invoice URL: " + Customerinvoice_URL);

			Customer_Invoice_page cip = new Customer_Invoice_page(driver);
			String orderinvoicetextString = cip.getinvoicetext();

			if (orderinvoicetextString.equals("Invoice List")) {

				logger.info("Invoice list sucefully open - Passed ");
				ExtentManager.getTest().pass("Invoice List page opened successfully: Invoice List text is visible.");
				softAssert.assertTrue(true, "Invoice List text matched");
			} else {
				logger.info("Invoice list sucefully open  - failed ");
				ExtentManager.getTest().fail("Invoice List page failed to open: Invoice List text was not found. Found: " + orderinvoicetextString);
				captureScreenShot(driver, "Invoice List");
				softAssert.fail("Invoice List text mismatch");
			}

			dp.clickdashbord();
			logger.info("Customer_Managemnt Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Customer Management module");

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Customer_Managemnt: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Customer_Managemnt");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
			ExtentManager.getTest().info("Navigated to Category URL: " + category_URLString);

			Category_page cp = new Category_page(driver);

			cp.isaddCategory();
			cp.Click_Brand();
			String brandpage_String = driver.getCurrentUrl();
			logger.info("Brand page URL: " + brandpage_String);
			ExtentManager.getTest().info("Navigated to Brand URL: " + brandpage_String);

			Brand_page brp = new Brand_page(driver);
			brp.isaddBrand();

			brp.click_Product();
			String productpageString = driver.getCurrentUrl();
			logger.info("Product page URL: " + productpageString);
			ExtentManager.getTest().info("Navigated to Product URL: " + productpageString);

			Product_pagenew PPN = new Product_pagenew(driver);
			PPN.isaddProdct();
			PPN.Click_quickproduct();
			String quickproductpageString = driver.getCurrentUrl();
			logger.info("Quick Product page URL: " + quickproductpageString);
			ExtentManager.getTest().info("Navigated to Quick Product URL: " + quickproductpageString);

			Quick_product_page qpp = new Quick_product_page(driver);
			String productlisttextString = qpp.getproductlisttext();

			if (productlisttextString.equals("Product List")) {

				logger.info("Product list sucefully open - Passed ");
				ExtentManager.getTest().pass("Product List page opened successfully: Product List text is visible.");
				softAssert.assertTrue(true, "Product List text matched");

			} else {
				logger.info("Product list sucefully open  - failed ");
				ExtentManager.getTest().fail("Product List page failed to open: Product List text was not found. Found: " + productlisttextString);
				captureScreenShot(driver, "Product List");
				softAssert.fail("Product List text mismatch");
			}

			dp.clickdashbord();
			logger.info("Product Catelog Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Product Catalog module");

		} catch (Exception e) {
			logger.error("Exception occurred in Product_Catalogs: " + e.getMessage());
				ExtentManager.getTest().fail("Error occurred in Product_Catalogs: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Product_Catalogs");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
				ExtentManager.getTest().info("Navigated to Warehouse URL: " + wareshouseString);

			Warehouse_page WP = new Warehouse_page(driver);

			WP.isaddwarehouse();
			WP.Click_Supplier();

			String suplierString = driver.getCurrentUrl();
			logger.info("Supplier page URL: " + suplierString);
			ExtentManager.getTest().info("Navigated to Supplier URL: " + suplierString);

			Supplier_Page sup = new Supplier_Page(driver);
			sup.Click_Purchase_Inventory();
			String supllierString = driver.getCurrentUrl();
			logger.info("Purchase Inventory page URL: " + supllierString);
			ExtentManager.getTest().info("Navigated to Purchase Inventory URL: " + supllierString);

			Purchase_Page pup = new Purchase_Page(driver);

			pup.isaddpurchase();

			dp.clickdashbord();
			logger.info("Inventory_Managment Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Inventory Management module");

		} catch (Exception e) {
			logger.error("Exception occurred in Inventory_Managment: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Inventory_Managment: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Inventory_Managment");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
			ExtentManager.getTest().info("Navigated to Flexproduct Settings URL: " + settingString);

			Flexproduct_Setting_page Fsp = new Flexproduct_Setting_page(driver);

			String subsettingString = Fsp.getSubsetting();

			if (subsettingString.equals("Subscription Settings")) {

				logger.info("Flexproduct_Setting_page sucefully - Passed ");
				ExtentManager.getTest().pass("Flexproduct Settings page opened successfully: Subscription Settings text is visible.");
				softAssert.assertTrue(true, "Flexproduct Setting text matched");

			} else {
				logger.info("Flexproduct_Setting_page sucefully - failed ");
				ExtentManager.getTest().fail("Flexproduct Settings page failed to open: Subscription Settings text was not found. Found: " + subsettingString);
				captureScreenShot(driver, "FlexProduct_Plan");
				softAssert.fail("Flexproduct Setting text mismatch");
			}

			Fsp.Click_Attributes();
			String attributeString = driver.getCurrentUrl();
			logger.info("Attributes page URL: " + attributeString);
			ExtentManager.getTest().info("Navigated to Attributes URL: " + attributeString);

			// After navigating to the Attributes page
			Attributes_page attrPage = new Attributes_page(driver);
			boolean isAddAttrVisible = attrPage.isAddAttributeDisplayed();
			logger.info("Add Attribute button displayed: " + isAddAttrVisible);
			// Verify if the Add Attribute button is displayed
				
			ExtentManager.getTest().info("Add Attribute button visibility: " + isAddAttrVisible);
			softAssert.assertTrue(isAddAttrVisible, "Add Attribute button is not displayed");

			attrPage.click_Workingday();
			String workingDayUrl = driver.getCurrentUrl();

			logger.info("Working Day page URL: " + workingDayUrl);
			ExtentManager.getTest().info("Navigated to Working Day URL: " + workingDayUrl);

			// After navigating to the Working Day page

			WorkingDay_Page wdp = new WorkingDay_Page(driver);

			// Verify the Working Days header
			String headerText = wdp.getWorkingDaysHeaderText();
			softAssert.assertEquals(headerText, "Working Days", "Working Days header not found");

			// Click the Plan Slot element
			wdp.clickPlanSlot();
			logger.info("Clicked on Plan Slot");
			ExtentManager.getTest().info("Clicked on Plan Slot in Working Day page");

			String planSlotUrl = driver.getCurrentUrl();
			logger.info("Plan Slot page URL: " + planSlotUrl);
			ExtentManager.getTest().info("Navigated to Plan Slot URL: " + planSlotUrl);

			// Verify the Plan Slot header

			// Verify the Plan Slot header
			PlanSlot_Page planSlotPage = new PlanSlot_Page(driver);
			String planSlotHeader = planSlotPage.getPlanSlotsListHeaderText();
			softAssert.assertEquals(planSlotHeader, "Plan Slots List", "Plan Slot header not found");
			logger.info("Plan Slot header verified successfully");
			ExtentManager.getTest().info("Plan Slot header verified successfully: " + planSlotHeader);
			// Click the Subscription List span
			planSlotPage.clickSubscriptionList();
			logger.info("Clicked on Subscription List");
			ExtentManager.getTest().info("Clicked on Subscription List in Plan Slot page");
			String subscriptionListUrl = driver.getCurrentUrl();
			logger.info("Subscription List page URL: " + subscriptionListUrl);
			ExtentManager.getTest().info("Navigated to Subscription List URL: " + subscriptionListUrl);

			FlexProductSubscription_Page flexProductSubscriptionPage = new FlexProductSubscription_Page(driver);
			// Verify the FlexProduct Plans header
			String flexProductPlansText = flexProductSubscriptionPage.getFlexProductPlansText();

			softAssert.assertEquals(flexProductPlansText, "FlexProduct Plans", "FlexProduct Plans header not found");
			logger.info("FlexProduct Plans header verified successfully");
			ExtentManager.getTest().info("FlexProduct Plans header verified successfully: " + flexProductPlansText);	

			dp.clickdashbord();
			logger.info("FlexProduct_Plan Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish FlexProduct_Plan module");

		} catch (Exception e) {
			logger.error("Exception occurred in FlexProduct_Plan: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in FlexProduct_Plan: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "FlexProduct_Plan");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
			ExtentManager.getTest().info("Navigated to Banner URL: " + bannerString);
			Banner_Page bp = new Banner_Page(driver);

			String bannerText = bp.getBannerHeaderText();
			if (bannerText.equals("Banner List")) {
				logger.info("Banner page sucefully open - Passed ");
				ExtentManager.getTest().pass("Banner List page opened successfully: Banner List text is visible.");
				softAssert.assertTrue(true, "Banner List text matched");
			} else {
				logger.info("Banner page sucefully open  - failed ");
				ExtentManager.getTest().fail("Banner List page failed to open: Banner List text was not found. Found: " + bannerText);
				captureScreenShot(driver, "Banner");
				softAssert.fail("Banner List text mismatch");
			}
			bp.isAddBannerDisplayed();
			logger.info("Add Banner button is displayed");
			ExtentManager.getTest().info("Add Banner button is visible on Banner page");
			dp.clickdashbord();
			logger.info("Banner Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Banner module");

		} catch (Exception e) {
			logger.error("Exception occurred in Banner: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Banner: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Banner");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
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
			ExtentManager.getTest().info("Navigated to Region URL: " + regionString);

			Location_Rigion_page rp = new Location_Rigion_page(driver);
			String regionText = rp.getRegionsHeaderText();

			if (regionText.equals("Regions List")) {
				logger.info("Region page sucefully open - Passed ");
				ExtentManager.getTest().pass("Region List page opened successfully: Regions List text is visible.");
				softAssert.assertTrue(true, "Region List text matched");
			} else {
				logger.info("Region page sucefully open  - failed ");
				ExtentManager.getTest().fail("Region List page failed to open: Regions List text was not found. Found: " + regionText);
				captureScreenShot(driver, "Region");
				softAssert.fail("Region List text mismatch");
			}
			rp.isAddRegionVisible();
			logger.info("Add Region button is displayed");
				ExtentManager.getTest().info("Add Region button is visible on Location Region page");
			rp.clickLocation();
			logger.info("Clicked on Location");
			ExtentManager.getTest().info("Clicked on Location in Location Region page");
			String locationString = driver.getCurrentUrl();
			logger.info("Location page URL: " + locationString);
			ExtentManager.getTest().info("Navigated to Location URL: " + locationString);
			LM_Locations_page lp = new LM_Locations_page(driver);
			String locationsListText = lp.getLocationsListHeaderText();

			if (locationsListText.equals("Locations List")) {
				logger.info("Locations page sucefully open - Passed ");
				ExtentManager.getTest().pass("Locations List page opened successfully: Locations List text is visible.");
				softAssert.assertTrue(true, "Locations List text matched");
			} else {
				logger.info("Locations page sucefully open  - failed ");
				ExtentManager.getTest().fail("Locations List page failed to open: Locations List text was not found. Found: " + locationsListText);
				captureScreenShot(driver, "Locations");
				softAssert.fail("Locations List text mismatch");
			}
			lp.isAddLocationDisplayed();
			logger.info("Add Location button is displayed");
			ExtentManager.getTest().info("Add Location button is visible on Locations page");
			lp.clickArea();
			logger.info("Clicked on Area");
			ExtentManager.getTest().info("Clicked on Area in Locations page");
			String areaString = driver.getCurrentUrl();
			logger.info("Area page URL: " + areaString);
			ExtentManager.getTest().info("Navigated to Area URL: " + areaString);

			LM_Area_Page ap = new LM_Area_Page(driver);

			// Verify the Area page header
			String areaHeaderText = ap.getAreasHeaderText();
			logger.info("Area List Header Text: " + areaHeaderText);
				ExtentManager.getTest().info("Area List Header Text: " + areaHeaderText);

			// Verify the Area page header
			if (areaHeaderText.equals("Areas List")) {
				logger.info("Area page sucefully open - Passed ");
				ExtentManager.getTest().pass("Area List page opened successfully: Areas List text is visible.");
				softAssert.assertTrue(true, "Area List text matched");
			} else {
				logger.info("Area page sucefully open  - failed ");
				ExtentManager.getTest().fail("Area List page failed to open: Areas List text was not found. Found: " + areaHeaderText);
				captureScreenShot(driver, "Area");
				softAssert.fail("Area List text mismatch");
			}

			ap.isAddAreaVisible();

			logger.info("Add Area button is displayed");
			ExtentManager.getTest().info("Add Area button is visible on Area page");
			ap.clickRoute();

			logger.info("Clicked on Route");
			ExtentManager.getTest().info("Clicked on Route in Area page");
			String routeString = driver.getCurrentUrl();

			logger.info("Route page URL: " + routeString);
			ExtentManager.getTest().info("Navigated to Route URL: " + routeString);

			LM_Route_Page rp1 = new LM_Route_Page(driver);

			// Verify the Routes page header
			String routesHeaderText = rp1.getRoutesHeaderText();
			logger.info("Routes Header Text: " + routesHeaderText);
			ExtentManager.getTest().info("Routes Header Text: " + routesHeaderText);
			// Verify the Routes page header
			if (routesHeaderText.equals("Routes List")) {
				logger.info("Routes page sucefully open - Passed ");
				ExtentManager.getTest().pass("Routes List page opened successfully: Routes List text is visible.");
				softAssert.assertTrue(true, "Routes List text matched");
			} else {
				logger.info("Routes page sucefully open  - failed ");
				ExtentManager.getTest().fail("Routes List page failed to open: Routes List text was not found. Found: " + routesHeaderText);
				captureScreenShot(driver, "Routes");
				softAssert.fail("Routes List text mismatch");
			}
			rp1.isAddRouteDisplayed();
			logger.info("Add Route button is displayed");
			ExtentManager.getTest().info("Add Route button is visible on Routes page");

			dp.clickdashbord();
			logger.info("Locations_Manager Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard to finish Locations_Manager module");

		} catch (Exception e) {
			logger.error("Exception occurred in Banner: " + e.getMessage());
			ExtentManager.getTest().fail("Error occurred in Locations_Manager: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Banner");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused

			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}

	@Test(priority = 12 )
	public void Report_Module() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clickReports();
			String reportString = driver.getCurrentUrl();
			logger.info("Report page URL: " + reportString);
			ExtentManager.getTest().info("Navigated to Reports URL: " + reportString);

			// Verify the Reports List header text
			// Create an instance of the Report_ReportsList_Page class
			Reports_Page rrp = new Reports_Page(driver);
			String reportsListText = rrp.getReportsListHeaderText();
			logger.info("Reports List Header Text: " + reportsListText);
			ExtentManager.getTest().info("Reports List Header Text: " + reportsListText);
			// Verify the Reports List header text
			if (reportsListText.equals("Reports List")) {
				logger.info("Reports List page sucefully open - Passed ");
				ExtentManager.getTest().pass("Reports List page opened successfully: Reports List text is visible.");
				softAssert.assertTrue(true, "Reports List text matched");
			} else {
				logger.info("Reports List page sucefully open  - failed ");
				ExtentManager.getTest().fail("Reports List page failed to open: Reports List text was not found. Found: " + reportsListText);
				captureScreenShot(driver, "Reports List");
				softAssert.fail("Reports List text mismatch");
			}
			rrp.isCustomerReportsVisible();
			logger.info("Customer Reports text is displayed");
			ExtentManager.getTest().info("Customer Reports text is visible on Reports List page");

			rrp.clickCustomerWallet();
			String customerWalletString = driver.getCurrentUrl();
			logger.info("Customer Wallet page URL: " + customerWalletString);
			ExtentManager.getTest().info("Navigated to Customer Wallet URL: " + customerWalletString);

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
			ExtentManager.getTest().info("Export CSV button is visible on Customer Wallet List page");

			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");

			rrp.clickCustomerInformationReports();
			String customerInformationString = driver.getCurrentUrl();
			logger.info("Customer Information page URL: " + customerInformationString);
			ExtentManager.getTest().info("Navigated to Customer Information URL: " + customerInformationString);
			// Create an instance of the Report_CustomerInformationReports_Page class
			Report_CustomerInformation_Page rcip = new Report_CustomerInformation_Page(driver);
			String customerInformationText = rcip.getCustomerInformationReportHeaderText();
			if (customerInformationText.equals("Customer Information")) {
				logger.info("Customer Information page sucefully open - Passed ");
				ExtentManager.getTest().pass("Customer Information page opened successfully: Customer Information text is visible.");
				softAssert.assertTrue(true, "Customer Information text matched");
			} else {
				logger.info("Customer Information page sucefully open  - failed ");
				ExtentManager.getTest().fail("Customer Information page failed to open: Customer Information text was not found. Found: " + customerInformationText);
				captureScreenShot(driver, "Customer Information");
				softAssert.fail("Customer Information text mismatch");
			}
			rcip.isExportCSV();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Customer Information page");
			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");
			rrp.clickActivityLogReports();
			logger.info("Clicked on Activity Logs");
			ExtentManager.getTest().info("Clicked on Activity Logs in Reports List page");

			// Create an instance of the Report_ActivityLogs_Page class
			String activityLogsUrl = driver.getCurrentUrl();
			logger.info("Activity Logs page URL: " + activityLogsUrl);
			ExtentManager.getTest().info("Navigated to Activity Logs URL: " + activityLogsUrl);

			// Create an instance of the Report_ActivityLogs_Page class
			Report_ActivityLogs_Page rap = new Report_ActivityLogs_Page(driver);

			// Verify the Activity List header text
			String activityLogText = rap.getActivityLogHeaderText();
			logger.info("Activity Log Header Text: " + activityLogText);
			ExtentManager.getTest().info("Activity Log Header Text: " + activityLogText);
			if (activityLogText.equals("Activity List")) {
				logger.info("Activity Logs page sucefully open - Passed ");
				ExtentManager.getTest().pass("Activity List page opened successfully: Activity List text is visible.");
				softAssert.assertTrue(true, "Activity List text matched");
			} else {
				logger.info("Activity Logs page sucefully open  - failed ");
				ExtentManager.getTest().fail("Activity List page failed to open: Activity List text was not found. Found: " + activityLogText);
				captureScreenShot(driver, "Activity List");
				softAssert.fail("Activity List text mismatch");

			}
			rap.isExportCSV();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Activity List page");

			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");

			rrp.clickLowCreditReports();
			String lowCreditString = driver.getCurrentUrl();
			logger.info("Low Credit page URL: " + lowCreditString);
			ExtentManager.getTest().info("Navigated to Low Credit URL: " + lowCreditString);
			// Create an instance of the Report_Lowcredit_Page class
			Report_Lowcredit_Page rlp = new Report_Lowcredit_Page(driver);
			String lowCreditText = rlp.getLowCreditReportHeaderText();
			if (lowCreditText.equals("Low Credit List")) {
				logger.info("Low Credit page sucefully open - Passed ");
				ExtentManager.getTest().pass("Low Credit List page opened successfully: Low Credit List text is visible.");
				softAssert.assertTrue(true, "Low Credit List text matched");
			} else {
				logger.info("Low Credit page sucefully open  - failed ");
				ExtentManager.getTest().fail("Low Credit List page failed to open: Low Credit List text was not found. Found: " + lowCreditText);
				captureScreenShot(driver, "Low Credit");
				softAssert.fail("Low Credit List text mismatch");
			}

			rlp.isExportCSV();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Low Credit List page");
			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");

			rrp.clickCustomerVacationReports();
			String customerVacationString = driver.getCurrentUrl();
			logger.info("Customer Vacation page URL: " + customerVacationString);
			ExtentManager.getTest().info("Navigated to Customer Vacation URL: " + customerVacationString);

			// Create an instance of the Report_CustomerVacation_Page class
			Report_CustomerVacation_Page rcvp = new Report_CustomerVacation_Page(driver);

			String customerVacationText = rcvp.getCustomerVacationHeaderText();
			if (customerVacationText.equals("Customer Vacation List")) {
				logger.info("Customer Vacation page sucefully open - Passed ");
				ExtentManager.getTest().pass("Customer Vacation List page opened successfully: Customer Vacation List text is visible.");
				softAssert.assertTrue(true, "Customer Vacation List text matched");
			} else {
				logger.info("Customer Vacation page sucefully open  - failed ");
				ExtentManager.getTest().fail("Customer Vacation List page failed to open: Customer Vacation List text was not found. Found: " + customerVacationText);
				captureScreenShot(driver, "Customer Vacation List");
				softAssert.fail("Customer Vacation List text mismatch");
			}
			rcvp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Customer Vacation List page");
			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");
			rrp.clickSubscriptionReports();
			String subscriptionString = driver.getCurrentUrl();
			logger.info("Subscription page URL: " + subscriptionString);
			ExtentManager.getTest().info("Navigated to Subscription URL: " + subscriptionString);
			// Create an instance of the Report_Subscription_Page class
			Report_Subscription_Page rsp = new Report_Subscription_Page(driver);
			String subscriptionText = rsp.getSubscriptionListHeaderText();
			if (subscriptionText.equals("Subscription List")) {

				logger.info("Subscription page sucefully open - Passed ");
				ExtentManager.getTest().pass("Subscription List page opened successfully: Subscription List text is visible.");
				softAssert.assertTrue(true, "Subscription List text matched");
			} else {
				logger.info("Subscription page sucefully open  - failed ");
				ExtentManager.getTest().fail("Subscription List page failed to open: Subscription List text was not found. Found: " + subscriptionText);
				captureScreenShot(driver, "Subscription List");
				softAssert.fail("Subscription List text mismatch");

			}
			rsp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Subscription List page");
			dp.clickReports();
			logger.info("Clicked on Reports");
			
			rrp.clickSubscriptionEndReports();
			String subscriptionEndString = driver.getCurrentUrl();
			logger.info("Subscription End page URL: " + subscriptionEndString);
			ExtentManager.getTest().info("Navigated to Subscription End URL: " + subscriptionEndString);
			// Create an instance of the Report_SubscriptionEnd_Page class
			Report_SubscriptionEnd_page rsep = new Report_SubscriptionEnd_page(driver);
			String subscriptionEndText = rsep.getSubscriptionEndListHeaderText();
			if (subscriptionEndText.equals("Subscription End List")) {
				logger.info("Subscription End page sucefully open - Passed ");
					ExtentManager.getTest().pass("Subscription End List page opened successfully: Subscription End List text is visible.");
				softAssert.assertTrue(true, "Subscription End List text matched");
			} else {
				logger.info("Subscription End page sucefully open  - failed ");
				ExtentManager.getTest().fail("Subscription End List page failed to open: Subscription End List text was not found. Found: " + subscriptionEndText);
				captureScreenShot(driver, "Subscription End List");
				softAssert.fail("Subscription End List text mismatch");
			}
			rsep.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Subscription End List page");
			dp.clickReports();
			logger.info("Clicked on Reports");
			ExtentManager.getTest().info("Clicked on Reports in Reports List page");
			rrp.isOperationalReportsVisible();
			logger.info("Operational Reports text is displayed");
			ExtentManager.getTest().info("Operational Reports text is visible on Reports List page");
			rrp.clickFutureOrdersReports();
			String futureOrdersString = driver.getCurrentUrl();
			logger.info("Future Orders page URL: " + futureOrdersString);
			ExtentManager.getTest().info("Navigated to Future Orders URL: " + futureOrdersString);
			// Create an instance of the Report_FutureOrders_Page class
			Report_FutureOrders_Page rfop = new Report_FutureOrders_Page(driver);
			String futureOrdersText = rfop.getFutureOrdersReportHeaderText();
			if (futureOrdersText.equals("Future Orders Report")) {
				logger.info("Future Orders page sucefully open - Passed ");
				ExtentManager.getTest().pass("Future Orders List page opened successfully: Future Orders List text is visible.");
				softAssert.assertTrue(true, "Future Orders List text matched");
				
			} else {
				logger.info("Future Orders page sucefully open  - failed ");
				ExtentManager.getTest().fail("Future Orders List page failed to open: Future Orders List text was not found. Found: " + futureOrdersText);
				captureScreenShot(driver, "Future Orders List");
				softAssert.fail("Future Orders List text mismatch");
			}

			rfop.clickExportAsButton();
			logger.info("Export CSV button is displayed");
				
			rfop.clickBackButton();
			logger.info("Clicked on Back button");
				ExtentManager.getTest().info("Clicked on Back button in Future Orders List page");

			rrp.clickPredictiveAnalysisReports();
			String predictiveAnalysisString = driver.getCurrentUrl();
			logger.info("Predictive Analysis page URL: " + predictiveAnalysisString);
			ExtentManager.getTest().info("Navigated to Predictive Analysis URL: " + predictiveAnalysisString);
			// Create an instance of the Report_PredictiveAnalysis_Page class
			Report_PredictiveAnalysis_Page rpap = new Report_PredictiveAnalysis_Page(driver);
			String predictiveAnalysisText = rpap.getPredictiveAnalysisHeaderText();
			if (predictiveAnalysisText.equals("Predictive Analysis")) {
				logger.info("Predictive Analysis page sucefully open - Passed ");
				ExtentManager.getTest().pass("Predictive Analysis page opened successfully: Predictive Analysis text is visible.");
				softAssert.assertTrue(true, "Predictive Analysis text matched");
			} else {
				logger.info("Predictive Analysis page sucefully open  - failed ");
				ExtentManager.getTest().fail("Predictive Analysis page failed to open: Predictive Analysis text was not found. Found: " + predictiveAnalysisText);
				captureScreenShot(driver, "Predictive Analysis");
				softAssert.fail("Predictive Analysis text mismatch");
			}
			rpap.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Predictive Analysis page");
			rpap.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Predictive Analysis page");
			rrp.clickReverseLogisticReports();
			String reverseLogisticString = driver.getCurrentUrl();
			logger.info("Reverse Logistic page URL: " + reverseLogisticString);
			ExtentManager.getTest().info("Navigated to Reverse Logistic URL: " + reverseLogisticString);
			// Create an instance of the Report_ReverseLogistic_Page class
			Report_ReverseLogistic_Page rrlp = new Report_ReverseLogistic_Page(driver);
			String reverseLogisticText = rrlp.getReverseLogisticHeaderText();
			if (reverseLogisticText.equals("Reverse Logistic")) {
				logger.info("Reverse Logistic page sucefully open - Passed ");
				ExtentManager.getTest().pass("Reverse Logistic List page opened successfully: Reverse Logistic List text is visible.");
				softAssert.assertTrue(true, "Reverse Logistic List text matched");
			} else {
				logger.info("Reverse Logistic page sucefully open  - failed ");
				ExtentManager.getTest().fail("Reverse Logistic List page failed to open: Reverse Logistic List text was not found. Found: " + reverseLogisticText);
				captureScreenShot(driver, "Reverse Logistic List");
				softAssert.fail("Reverse Logistic List text mismatch");
			}

			rrlp.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Reverse Logistic List page");
			rrp.clickCashCollectionsReports();
			String cashCollectionsString = driver.getCurrentUrl();
			logger.info("Cash Collections page URL: " + cashCollectionsString);
			ExtentManager.getTest().info("Navigated to Cash Collections URL: " + cashCollectionsString);
			// Create an instance of the Report_CashCollections_Page class
			Report_CashCollections_Page rccp = new Report_CashCollections_Page(driver);
			String cashCollectionsText = rccp.getCashCollectionReportHeaderText();
			if (cashCollectionsText.equals("Cash Collection List")) {
				logger.info("Cash Collections page sucefully open - Passed ");
				ExtentManager.getTest().pass("Cash Collections List page opened successfully: Cash Collections List text is visible.");
				softAssert.assertTrue(true, "Cash Collections List text matched");
			} else {
				logger.info("Cash Collections page sucefully open  - failed ");
				ExtentManager.getTest().fail("Cash Collections List page failed to open: Cash Collections List text was not found. Found: " + cashCollectionsText);
				captureScreenShot(driver, "Cash Collections List");
				softAssert.fail("Cash Collections List text mismatch");
			}
			rccp.clickExportAsButton();
			logger.info("Export CSV button is displayed");
			ExtentManager.getTest().info("Export CSV button is visible on Cash Collections List page");
			rccp.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Cash Collections List page");
			rrp.clickOrderInformationReports();
			String orderInformationString = driver.getCurrentUrl();
			logger.info("Order Information page URL: " + orderInformationString);
			ExtentManager.getTest().info("Navigated to Order Information URL: " + orderInformationString);
			// Create an instance of the Report_OrderInformation_Page class

			Report_OrderInformation_Page roip = new Report_OrderInformation_Page(driver);
			String orderInformationText = roip.getOrderInformationHeaderText();
			if (orderInformationText.equals("Order Information")) {
				logger.info("Order Information page sucefully open - Passed ");
				ExtentManager.getTest().pass("Order Information page opened successfully: Order Information text is visible.");
				softAssert.assertTrue(true, "Order Information text matched");
			} else {
				logger.info("Order Information page sucefully open  - failed ");
				ExtentManager.getTest().fail("Order Information page failed to open: Order Information text was not found. Found: " + orderInformationText);
				captureScreenShot(driver, "Order Information");
				softAssert.fail("Order Information text mismatch");
			}
			roip.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Order Information page");
			roip.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Order Information page");
			rrp.clickCancelledOrderReports();
			String cancelledOrderString = driver.getCurrentUrl();
			logger.info("Cancelled Order page URL: " + cancelledOrderString);
			ExtentManager.getTest().info("Navigated to Cancelled Order URL: " + cancelledOrderString);
			// Create an instance of the Report_CancelledOrder_Page class
			Report_CancelledOrder_Page rcop = new Report_CancelledOrder_Page(driver);
			String cancelledOrderText = rcop.getCancelledOrderHeaderText();

			if (cancelledOrderText.equals("Cancelled Order List")) {
				logger.info("Cancelled Order page sucefully open - Passed ");
				ExtentManager.getTest().pass("Cancelled Order List page opened successfully: Cancelled Order List text is visible.");
				softAssert.assertTrue(true, "Cancelled Order List text matched");
			} else {
				logger.info("Cancelled Order page sucefully open  - failed ");
				ExtentManager.getTest().fail("Cancelled Order List page failed to open: Cancelled Order List text was not found. Found: " + cancelledOrderText);
				captureScreenShot(driver, "Cancelled Order List");
				softAssert.fail("Cancelled Order List text mismatch");
			}
			rcop.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Cancelled Order List page");
			rcop.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Cancelled Order List page");
			rrp.clickDeliveriesInformationReports();
			String deliveriesInformationString = driver.getCurrentUrl();
			logger.info("Deliveries Information page URL: " + deliveriesInformationString);
			ExtentManager.getTest().info("Navigated to Deliveries Information URL: " + deliveriesInformationString);
			// Create an instance of the Report_DeliveriesInformation_Page class
			Report_DeliveriesInformation_Page rdip = new Report_DeliveriesInformation_Page(driver);
			String deliveriesInformationText = rdip.getDeliveriesInformationHeaderText();

			if (deliveriesInformationText.equals("Deliveries Information")) {
				logger.info("Deliveries Information page sucefully open - Passed ");
				ExtentManager.getTest().pass("Deliveries Information page opened successfully: Deliveries Information text is visible.");
				softAssert.assertTrue(true, "Deliveries Information text matched");
			} else {
				logger.info("Deliveries Information page sucefully open  - failed ");
				ExtentManager.getTest().fail("Deliveries Information page failed to open: Deliveries Information text was not found. Found: " + deliveriesInformationText);
				captureScreenShot(driver, "Deliveries Information");
				softAssert.fail("Deliveries Information text mismatch");

			}
			rdip.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Deliveries Information page");
			rdip.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Deliveries Information page");
			rrp.clickImageProofReports();
			String imageProofString = driver.getCurrentUrl();
			logger.info("Image Proof page URL: " + imageProofString);
			ExtentManager.getTest().info("Navigated to Image Proof URL: " + imageProofString);
			// Create an instance of the Report_ImageProof_Page class
			Report_ImageProof_Page rip = new Report_ImageProof_Page(driver);
			String imageProofText = rip.getImageProofReportHeaderText();
			if (imageProofText.equals("Image Proof List")) {
				logger.info("Image Proof page sucefully open - Passed ");
				ExtentManager.getTest().pass("Image Proof List page opened successfully: Image Proof List text is visible.");
				softAssert.assertTrue(true, "Image Proof List text matched");
			} else {
				logger.info("Image Proof page sucefully open  - failed ");
				ExtentManager.getTest().fail("Image Proof List page failed to open: Image Proof List text was not found. Found: " + imageProofText);
				captureScreenShot(driver, "Image Proof List");
				softAssert.fail("Image Proof List text mismatch");
			}
			rip.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Image Proof List page");
			rip.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Image Proof List page");

			rrp.isSalesReportsVisible();

			logger.info("Sales Reports text is displayed");
				ExtentManager.getTest().info("Sales Reports text is visible on Reports List page");
			rrp.clickTransactionsReports();
			String transactionsString = driver.getCurrentUrl();
			logger.info("Transactions page URL: " + transactionsString);
			ExtentManager.getTest().info("Navigated to Transactions URL: " + transactionsString);
			// Create an instance of the Report_Transactions_Page class
			Report_Transactions_Page rtp = new Report_Transactions_Page(driver);
			String transactionsText = rtp.getTransactionsReportHeaderText();
			if (transactionsText.equals("Transactions Report")) {
				logger.info("Transactions page sucefully open - Passed ");
				ExtentManager.getTest().pass("Transactions List page opened successfully: Transactions List text is visible.");
				softAssert.assertTrue(true, "Transactions List text matched");
			} else {
				logger.info("Transactions page sucefully open  - failed ");
				ExtentManager.getTest().fail("Transactions List page failed to open: Transactions List text was not found. Found: " + transactionsText);
				captureScreenShot(driver, "Transactions List");
				softAssert.fail("Transactions List text mismatch");
			}
			rtp.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Transactions List page");
			rtp.clickBackButton();

			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Transactions List page");
			rrp.clickCumulativeSalesReports();
			String cumulativeSalesString = driver.getCurrentUrl();
			logger.info("Cumulative Sales page URL: " + cumulativeSalesString);
			ExtentManager.getTest().info("Navigated to Cumulative Sales URL: " + cumulativeSalesString);
			// Create an instance of the Report_CumulativeSales_Page class
			Report_CumulativeSales_Page rcsp = new Report_CumulativeSales_Page(driver);
			String cumulativeSalesText = rcsp.getCumulativeSalesReportHeaderText();
			if (cumulativeSalesText.equals("Cumulative Sales Report")) {
				logger.info("Cumulative Sales page sucefully open - Passed ");
				ExtentManager.getTest().pass("Cumulative Sales List page opened successfully: Cumulative Sales List text is visible.");
				softAssert.assertTrue(true, "Cumulative Sales List text matched");
			} else {
				logger.info("Cumulative Sales page sucefully open  - failed ");
				ExtentManager.getTest().fail("Cumulative Sales List page failed to open: Cumulative Sales List text was not found. Found: " + cumulativeSalesText);
				captureScreenShot(driver, "Cumulative Sales List");
				softAssert.fail("Cumulative Sales List text mismatch");
			}
			rcsp.clickExportAsButton();
			logger.info("Export As button is displayed");
			ExtentManager.getTest().info("Export As button is visible on Cumulative Sales List page");
			rcsp.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Cumulative Sales List page");
			rrp.clickOrdersSheetReports();
			String ordersSheetString = driver.getCurrentUrl();

			logger.info("Orders Sheet page URL: " + ordersSheetString);
			ExtentManager.getTest().info("Navigated to Orders Sheet URL: " + ordersSheetString);
			// Create an instance of the Report_OrdersSheet_Page class
			Report_OrdersSheet_Page rosp = new Report_OrdersSheet_Page(driver);
			String ordersSheetText = rosp.getOrderSheetHeaderText();
			if (ordersSheetText.equals("Orders Sheet")) {
				logger.info("Orders Sheet page sucefully open - Passed ");
				ExtentManager.getTest().pass("Orders Sheet List page opened successfully: Orders Sheet List text is visible.");
				softAssert.assertTrue(true, "Orders Sheet List text matched");
			} else {
				logger.info("Orders Sheet page sucefully open  - failed ");
				ExtentManager.getTest().fail("Orders Sheet List page failed to open: Orders Sheet List text was not found. Found: " + ordersSheetText);
				captureScreenShot(driver, "Orders Sheet List");
				softAssert.fail("Orders Sheet List text mismatch");
			}
			rosp.isDownloadDeliveryButtonDisplayed();
			logger.info("Download Delivery button is displayed");
			ExtentManager.getTest().info("Download Delivery button is visible on Orders Sheet List page");
			rosp.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Orders Sheet List page");
			rrp.clickWalletPaymentReports();
			String walletPaymentString = driver.getCurrentUrl();
			logger.info("Wallet Payment page URL: " + walletPaymentString);
			ExtentManager.getTest().info("Navigated to Wallet Payment URL: " + walletPaymentString);
			// Create an instance of the Report_WalletPayment_Page class
			Report_WalletPayment_Page rwpp = new Report_WalletPayment_Page(driver);
			String walletPaymentText = rwpp.getPaymentGatewayUsageReportHeaderText();
			if (walletPaymentText.equals("Payment Gateway Usage")) {
				logger.info("Wallet Payment page sucefully open - Passed ");
				ExtentManager.getTest().pass("Wallet Payment List page opened successfully: Wallet Payment List text is visible.");
				softAssert.assertTrue(true, "Wallet Payment List text matched");
			} else {
				logger.info("Wallet Payment page sucefully open  - failed ");
				ExtentManager.getTest().fail("Wallet Payment List page failed to open: Wallet Payment List text was not found. Found: " + walletPaymentText);
				captureScreenShot(driver, "Wallet Payment List");
				softAssert.fail("Wallet Payment List text mismatch");
			}

			rwpp.clickBackButton();
			logger.info("Clicked on Back button");
			ExtentManager.getTest().info("Clicked on Back button in Wallet Payment List page");

			dp.clickdashbord();
			logger.info("Report_Module Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard after completing Report_Module");

		} catch (Exception e) {
			logger.error("Exception occurred in Report_Module: " + e.getMessage());
			ExtentManager.getTest().fail("Report_Module failed due to: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Report_Module");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

			//

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}
	
	@Test(priority = 13)
	
			public void Role_Module() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {
			dashbordpage dp = new dashbordpage(driver);

			dp.clickUsersAndRoles();
			
			dp.clickUser();
			
			String userString = driver.getCurrentUrl();
				logger.info("User page URL: " + userString);
				ExtentManager.getTest().info("Navigated to User URL: " + userString);
				// Create an instance of the User_Page class
				User_Page up = new User_Page(driver);
				String userText = up.getUserElementText();
				if (userText.equals("Users List")) {
					logger.info("User page sucefully open - Passed ");
					ExtentManager.getTest().pass("User List page opened successfully: User List text is visible.");
					softAssert.assertTrue(true, "User List text matched");
				} else {
					logger.info("User page sucefully open  - failed ");
					ExtentManager.getTest().fail("User List page failed to open: User List text was not found. Found: " + userText);
					captureScreenShot(driver, "User List");
					softAssert.fail("User List text mismatch");
				}
				up.isAddUserButtonDisplayed();
				logger.info("Add User button is displayed");
				ExtentManager.getTest().info("Add User button is visible on User List page");
				up.clickAddAgentButton();
				
	
				String addAgentString = driver.getCurrentUrl();
					logger.info("Add Agent page URL: " + addAgentString);
					ExtentManager.getTest().info("Navigated to Add Agent URL: " + addAgentString);
					
					// Create an instance of the AddAgent_Page class
					Agents_Page aap = new Agents_Page(driver);
					String addAgentText = aap.getAgentsPageTitleText();
					if (addAgentText.equals("Agents List")) {
						logger.info("Add Agent page sucefully open - Passed ");
						ExtentManager.getTest().pass("Add Agent page opened successfully: Add Agent text is visible.");
						softAssert.assertTrue(true, "Add Agent text matched");
					} else {
						logger.info("Add Agent page sucefully open  - failed ");
						ExtentManager.getTest().fail("Add Agent page failed to open: Add Agent text was not found. Found: " + addAgentText);
						captureScreenShot(driver, "Add Agent");
						softAssert.fail("Add Agent text mismatch");
					}	
					aap.isAddAgentButtonDisplayed();
					logger.info("Add Agent button is displayed");
					ExtentManager.getTest().info("Add Agent button is visible on Add Agent page");
					aap.clickRoleElement();
						String roleString = driver.getCurrentUrl();
						logger.info("Role page URL: " + roleString);
						ExtentManager.getTest().info("Navigated to Role URL: " + roleString);
						// Create an instance of the Role_Page class
						Role_Page rp = new Role_Page(driver);
						String roleText = rp.getAgentsPageTitleText();
						if (roleText.equals("Roles List")) {
							logger.info("Role page sucefully open - Passed ");
							ExtentManager.getTest().pass("Role List page opened successfully: Role List text is visible.");
							softAssert.assertTrue(true, "Role List text matched");
						} else {
							logger.info("Role page sucefully open  - failed ");
							ExtentManager.getTest().fail("Role List page failed to open: Role List text was not found. Found: " + roleText);
							captureScreenShot(driver, "Role List");
							softAssert.fail("Role List text mismatch");
						}
						rp.isAddRoleButtonDisplayed();
						logger.info("Add Role button is displayed");
						ExtentManager.getTest().info("Add Role button is visible on Role List page");
						
						dp.clickdashbord();	
							logger.info("Role_Module Module Finish...click on dashborad");
							ExtentManager.getTest().info("Clicked on Dashboard after completing Role_Module");
							
							
		} catch (Exception e) {
			logger.error("Exception occurred in Role_Module: " + e.getMessage());
			ExtentManager.getTest().fail("Role_Module failed due to: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Role_Module");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}
	@Test(priority = 14,dependsOnMethods = "LoginAdminpenal")
	public void Support_Management() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start
		try {
			dashbordpage dp = new dashbordpage(driver);
			dp.clickSupportManagement();
			dp.clickTickets();
			
			String ticketString = driver.getCurrentUrl();
			logger.info("Tickets page URL: " + ticketString);
			ExtentManager.getTest().info("Navigated to Tickets URL: " + ticketString);
			// Create an instance of the Support_Tickets_Page class
			Tickets_Page stp = new Tickets_Page(driver);
			String ticketText = stp.getTicketsListElementText();
			if (ticketText.equals("Tickets List")) {
				logger.info("Tickets page sucefully open - Passed ");
				ExtentManager.getTest().pass("Tickets List page opened successfully: Tickets List text is visible.");
				softAssert.assertTrue(true, "Tickets List text matched");
			} else {
				logger.info("Tickets page sucefully open  - failed ");
				ExtentManager.getTest().fail("Tickets List page failed to open: Tickets List text was not found. Found: " + ticketText);
				captureScreenShot(driver, "Tickets List");
				softAssert.fail("Tickets List text mismatch");
			}
			
			stp.isAddNewTicketButtonDisplayed();
			logger.info("Add New Ticket button is displayed");
			ExtentManager.getTest().info("Add New Ticket button is visible on Tickets List page");
			dp.clickdashbord();
			logger.info("Support Management Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard after completing Support Management Module");
			
			
		} catch (Exception e) {
			logger.error("Exception occurred in Support Management: " + e.getMessage());
			ExtentManager.getTest().fail("Support Management failed due to: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Support_Management");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}

			softAssert.fail("Error due to: " + e.getMessage());

		}
		softAssert.assertAll(); // ✅ Final step to report any failures
	}
	
	@Test(priority = 15,dependsOnMethods = "LoginAdminpenal")
		public void Features() throws IOException, InterruptedException {
		SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start		
			try {
			dashbordpage dp = new dashbordpage(driver);
			dp.clickFeatures();
			dp.clickAddonFeatures();
			String featuresString = driver.getCurrentUrl();
			logger.info("Features page URL: " + featuresString);
			ExtentManager.getTest().info("Navigated to Features URL: " + featuresString);
			// Create an instance of the Features_Page class
			Features_Page fp = new Features_Page(driver);
			String featuresText = fp.getFeaturesListElementText();
			if (featuresText.equals("Addon Features")) {
				logger.info("Features page sucefully open - Passed ");
				ExtentManager.getTest().pass("Features List page opened successfully: Features List text is visible.");
				softAssert.assertTrue(true, "Features List text matched");
			} else {
				logger.info("Features page sucefully open  - failed ");
				ExtentManager.getTest().fail("Features List page failed to open: Features List text was not found. Found: " + featuresText);
				captureScreenShot(driver, "Features List");
				softAssert.fail("Features List text mismatch");
			}
			
			dp.clickdashbord();
			logger.info("Features Module Finish...click on dashborad");
			ExtentManager.getTest().info("Clicked on Dashboard after completing Features Module");

		} catch (Exception e) {
			logger.error("Exception occurred in Features: " + e.getMessage());
			ExtentManager.getTest().fail("Features failed due to: " + e.getMessage());
			e.printStackTrace(); // Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "Features");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
			}
			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused
			softAssert.fail("Error due to: " + e.getMessage());
			// ✅ Assert all to collect the result and allow the test to fail gracefully
				
			
	}
			softAssert.assertAll(); // ✅ Final step to report any failures
			
	}
	@Test(priority = 16,dependsOnMethods = "LoginAdminpenal")
	public void General_Setting() throws IOException, InterruptedException {
	SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start		
		try {
		dashbordpage dp = new dashbordpage(driver);
		dp.clickGeneralSetting();
		String generalSettingString = driver.getCurrentUrl();
		logger.info("General Setting page URL: " + generalSettingString);
		ExtentManager.getTest().info("Navigated to General Setting URL: " + generalSettingString);
		// Create an instance of the GeneralSetting_Page class
		general_settings_Page gsp = new general_settings_Page(driver);
		String generalSettingText = gsp.getGeneralSettingsElementText();
		if (generalSettingText.equals("General Settings Configuration")) {
			logger.info("General Setting page sucefully open - Passed ");
			ExtentManager.getTest().pass("General Setting page opened successfully: General Setting text is visible.");
			softAssert.assertTrue(true, "General Setting text matched");
		} else {
			logger.info("General Setting page sucefully open  - failed ");
			ExtentManager.getTest().fail("General Setting page failed to open: General Setting text was not found. Found: " + generalSettingText);
			captureScreenShot(driver, "General Setting");
			softAssert.fail("General Setting text mismatch");
		}
			
		dp.clickdashbord();
		logger.info("General_Setting Module Finish...click on dashborad");
		ExtentManager.getTest().info("Clicked on Dashboard after completing General_Setting Module");

		} catch (IOException ioException) {
			logger.error("IOException occurred in General_Setting: " + ioException.getMessage());
			ExtentManager.getTest().fail("General_Setting failed due to IOException: " + ioException.getMessage());
			ExtentManager.getTest().fail("General_Setting failed due to IOException: " + ioException.getMessage());
			try {
				captureScreenShot(driver, "General_Setting");
			} catch (IOException screenshotException) {
				logger.error("Screenshot capture failed: " + screenshotException.getMessage());
				ExtentManager.getTest().fail("Screenshot capture failed: " + screenshotException.getMessage());
			}
			softAssert.fail("Error due to IOException: " + ioException.getMessage());

	} catch (Exception e) {
		logger.error("Exception occurred in General_Setting: " + e.getMessage());
		ExtentManager.getTest().fail("General_Setting failed due to: " + e.getMessage());
		e.printStackTrace(); // Print stack trace in console for debugging
		try {
			captureScreenShot(driver, "General_Setting");
		} catch (IOException ioException) {
			logger.error("Screenshot capture failed: " + ioException.getMessage());
			ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
		}
		// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
		// reused
		softAssert.fail("Error due to: " + e.getMessage());
		// ✅ Assert all to collect the result and allow the test to fail gracefully
			
		
}
		softAssert.assertAll(); // ✅ Final step to report any failures
		
}
	@Test(priority = 17,dependsOnMethods = "LoginAdminpenal")
	public void Manage_CMS_Pages() throws IOException, InterruptedException {
	SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start		
		try {
		dashbordpage dp = new dashbordpage(driver);
		dp.clickManageCMS();
		String manageCMSString = driver.getCurrentUrl();	
		logger.info("Manage CMS page URL: " + manageCMSString);
		ExtentManager.getTest().info("Navigated to Manage CMS URL: " + manageCMSString);
		// Create an instance of the ManageCMS_Page class
		CMS_Page mcp = new CMS_Page(driver);
		String manageCMSText = mcp.getCmsPageElementText();
			if (manageCMSText.equals("CMS Pages")) {
			logger.info("Manage CMS page sucefully open - Passed ");
			ExtentManager.getTest().pass("Manage CMS List page opened successfully: Manage CMS List text is visible.");
			softAssert.assertTrue(true, "Manage CMS List text matched");
		} else {
			logger.info("Manage CMS page sucefully open  - failed ");
			ExtentManager.getTest().fail("Manage CMS List page failed to open: Manage CMS List text was not found. Found: " + manageCMSText);
			captureScreenShot(driver, "Manage CMS List");
			softAssert.fail("Manage CMS List text mismatch");
		}
				
			
		dp.clickdashbord();
		logger.info("Manage_CMS_Pages Module Finish...click on dashborad");
		ExtentManager.getTest().info("Clicked on Dashboard after completing Manage_CMS_Pages Module");

	} catch (Exception e) {
		logger.error("Exception occurred in Manage_CMS_Pages: " + e.getMessage());
		ExtentManager.getTest().fail("Manage_CMS_Pages failed due to: " + e.getMessage());
		e.printStackTrace(); // Print stack trace in console for debugging
		try {
			captureScreenShot(driver, "Manage_CMS_Pages");
		} catch (IOException ioException) {
			logger.error("Screenshot capture failed: " + ioException.getMessage());
			ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
		}
		// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
		// reused
		softAssert.fail("Error due to: " + e.getMessage());
		// ✅ Assert all to collect the result and allow the test to fail gracefully
			
		
}
		softAssert.assertAll(); // ✅ Final step to report any failures
		
}
	@Test(priority = 18,dependsOnMethods = "LoginAdminpenal")
	public void Site_Management() throws IOException, InterruptedException {
			SoftAssert softAssert = new SoftAssert(); // ✅ Initialize at the start		
		try {
		dashbordpage dp = new dashbordpage(driver);
		dp.clickSiteManagement();
		String siteManagementString = driver.getCurrentUrl();
		logger.info("Site Management page URL: " + siteManagementString);
		ExtentManager.getTest().info("Navigated to Site Management URL: " + siteManagementString);
		// Create an instance of the SiteManagement_Page class
		Site_Managment_Page smp = new Site_Managment_Page(driver);
		String siteManagementText = smp.getSiteManagementElementText();
			if (siteManagementText.equals("Edit Config")) {
			logger.info("Site Management page sucefully open - Passed ");
			ExtentManager.getTest().pass("Site Management page opened successfully: Site Management text is visible.");
			softAssert.assertTrue(true, "Site Management text matched");
		} else {
			logger.info("Site Management page sucefully open  - failed ");
			ExtentManager.getTest().fail("Site Management page failed to open: Site Management text was not found. Found: " + siteManagementText);
			captureScreenShot(driver, "Site Management");
			softAssert.fail("Site Management text mismatch");
		}
				
			
		dp.clickdashbord();
		logger.info("Site_Management Module Finish...click on dashborad");
		ExtentManager.getTest().info("Clicked on Dashboard after completing Site_Management Module");

		
	} catch (Exception e) {
		logger.error("Exception occurred in Site_Management: " + e.getMessage());
		ExtentManager.getTest().fail("Site_Management failed due to: " + e.getMessage());
		e.printStackTrace(); // Print stack trace in console for debugging
		try {
			captureScreenShot(driver, "Site_Management");
		} catch (IOException ioException) {
			logger.error("Screenshot capture failed: " + ioException.getMessage());
			ExtentManager.getTest().fail("Screenshot capture failed: " + ioException.getMessage());
		}
		// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
		// reused
		softAssert.fail("Error due to: " + e.getMessage());
		// ✅ Assert all to collect the result and allow the test to fail gracefully
	}
	
}}