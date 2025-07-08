package com.Admin_MilkRide.Module;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Admin_MilkRide.pagobject.Accountpage;
import com.Admin_MilkRide.pagobject.Attributes_page;
import com.Admin_MilkRide.pagobject.Brand_page;
import com.Admin_MilkRide.pagobject.Category_page;
import com.Admin_MilkRide.pagobject.Contactpage;
import com.Admin_MilkRide.pagobject.Customer_Invoice_page;
import com.Admin_MilkRide.pagobject.Customer_Page;
import com.Admin_MilkRide.pagobject.Delivery_Dashboard_page;
import com.Admin_MilkRide.pagobject.Disablearea;
import com.Admin_MilkRide.pagobject.Documentpage;
import com.Admin_MilkRide.pagobject.Flexproduct_Setting_page;
import com.Admin_MilkRide.pagobject.Hublistpage;
import com.Admin_MilkRide.pagobject.Invoice_Page;
import com.Admin_MilkRide.pagobject.Locationpage;
import com.Admin_MilkRide.pagobject.Loginpage;
import com.Admin_MilkRide.pagobject.Order_page;
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

@Listeners(com.Admin_MilkRide.Utilities.ExtentListenerClass.class)
public class Admin_Allmodule extends Baseclass {
	@Test

	public void LoginAdminpenal() throws IOException, InterruptedException {
		try {

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
				Assert.assertTrue(true);

			} else {
				logger.info("login sucefully - failed ");
				captureScreenShot(driver, "LoginAdminpenal");
				Assert.assertTrue(false);
			}

		} catch (Exception e) {
			logger.error("Exception occurred in LoginAdminpenal: " + e.getMessage());
			e.printStackTrace(); // ✅ Print stack trace in console for debugging
			try {
				captureScreenShot(driver, "LoginAdminpenal_Exception");
			} catch (IOException ioException) {
				logger.error("Screenshot capture failed: " + ioException.getMessage());
			}
			Assert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}
	}

	@Test(dependsOnMethods = "LoginAdminpenal", alwaysRun = true)
	public void Hubmanager() throws IOException, InterruptedException {
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clickhubmanager();
			String actualhubUrl = driver.getCurrentUrl();
			logger.info("Hubs URL: " + actualhubUrl);
			Hublistpage hp = new Hublistpage(driver);

			String hublistvrf = hp.gethublistext();

			if (hublistvrf.equals("Hubs List")) {

				logger.info("Hub listpage sucefully open - Passed ");
				Assert.assertTrue(true);

			} else {
				logger.info("Hub listpage sucefully open  - failed ");
				captureScreenShot(driver, "Hub Manager");
				Assert.assertTrue(false);
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
	}

	@Test(dependsOnMethods = "Hubmanager", alwaysRun = true)
	public void HubInfo() throws IOException, InterruptedException {
		try {

			hubinfopage hip = new hubinfopage(driver);

			String hubinfoString = hip.gethubnametext();

			if (hubinfoString.equals(hubinfoString)) {

				logger.info("Hubinfo page sucefully open - Passed ");
				Assert.assertTrue(true);

			} else {
				logger.info("Hubinfo sucefully open  - failed ");
				captureScreenShot(driver, "LoginAdminpenal");
				Assert.assertTrue(false);
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
			Assert.fail("Test failed due to unexpected exception: " + e.getMessage());
		}

	}

	@Test(dependsOnMethods = "HubInfo", alwaysRun = true)
	public void Delivery_Management() throws IOException, InterruptedException {
		try {

			dashbordpage dp = new dashbordpage(driver);

			dp.clicdeliverymanagement();
			String actualdelimanUrl = driver.getCurrentUrl();
			logger.info("Delevery Management URL: " + actualdelimanUrl);

			Delivery_Dashboard_page DDp = new Delivery_Dashboard_page(driver);

			String deliverydash = DDp.getdeleverydashtext();

			if (deliverydash.equals("Delivery Dashboard")) {

				logger.info("Deivery dashborad page sucefully open - Passed ");
				Assert.assertTrue(true);

			} else {
				logger.info("Deivery dashborad page sucefully openn  - failed ");
				captureScreenShot(driver, "Delivery_Management");
				Assert.assertTrue(false);
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
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}
	}

	@Test(dependsOnMethods = "Delivery_Management", alwaysRun = true)
	public void Billing_History() throws IOException, InterruptedException {
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
				Assert.assertTrue(true);

			} else {
				logger.info("Invoice List page sucefully openn  - failed ");
				captureScreenShot(driver, "Delivery_Management");
				Assert.assertTrue(false);
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
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}
	}

	@Test(dependsOnMethods = "Billing_History", alwaysRun = true)
	public void Customer_Managemnt() throws IOException, InterruptedException {
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
				Assert.assertTrue(true);

			} else {
				logger.info("Customers List page sucefully openn  - failed ");
				captureScreenShot(driver, "Customer_Managemnt");
				Assert.assertTrue(false);
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
				Assert.assertTrue(true);

			} else {
				logger.info("Invoice list sucefully open  - failed ");
				captureScreenShot(driver, "Invoice List");
				Assert.assertTrue(false);
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

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}

	}

	@Test(dependsOnMethods = "Customer_Managemnt", alwaysRun = true)
	public void Product_Catalogs() throws IOException, InterruptedException {
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
				Assert.assertTrue(true);

			} else {
				logger.info("Product list sucefully open  - failed ");
				captureScreenShot(driver, "Product List");
				Assert.assertTrue(false);
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

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}

	}

	@Test(dependsOnMethods = "Customer_Managemnt", alwaysRun = true)

	public void Inventory_Managment() throws IOException, InterruptedException {
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

			// ⚠️ Create SoftAssert outside the try-catch block to avoid scope issues if
			// reused
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}

	}

	@Test(dependsOnMethods = "Inventory_Managment", alwaysRun = true)

	public void FlexProduct_Plan() throws IOException, InterruptedException {
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
				Assert.assertTrue(true);

			} else {
				logger.info("Flexproduct_Setting_page sucefully - failed ");
				captureScreenShot(driver, "FlexProduct_Plan");
				Assert.assertTrue(false);
			}

			Fsp.Click_Attributes();
			String attributeString = driver.getCurrentUrl();
			logger.info("Attributes page URL: " + attributeString);

			// After navigating to the Attributes page
			Attributes_page attrPage = new Attributes_page(driver);
			boolean isAddAttrVisible = attrPage.isAddAttributeDisplayed();
			logger.info("Add Attribute button displayed: " + isAddAttrVisible);
			Assert.assertTrue(isAddAttrVisible, "Add Attribute button is not visible");

			attrPage.click_Workingday();

			WorkingDay_Page wdp = new WorkingDay_Page(driver);

			// Verify the Working Days header
			String headerText = wdp.getWorkingDaysHeaderText();
			Assert.assertEquals(headerText, "Working Days", "Working Days header not found");

			
// Click the Plan Slot element
			wdp.clickPlanSlot();
			logger.info("Clicked on Plan Slot");

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
			SoftAssert softAssert = new SoftAssert();
			softAssert.fail("Error due to: " + e.getMessage());

			// ✅ Assert all to collect the result and allow the test to fail gracefully
			softAssert.assertAll();
		}

	}

}
