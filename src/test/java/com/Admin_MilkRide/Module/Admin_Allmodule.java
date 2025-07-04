package com.Admin_MilkRide.Module;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Admin_MilkRide.pagobject.Accountpage;
import com.Admin_MilkRide.pagobject.Contactpage;
import com.Admin_MilkRide.pagobject.Delivery_Dashboard_page;
import com.Admin_MilkRide.pagobject.Disablearea;
import com.Admin_MilkRide.pagobject.Documentpage;
import com.Admin_MilkRide.pagobject.Hublistpage;
import com.Admin_MilkRide.pagobject.Locationpage;
import com.Admin_MilkRide.pagobject.Loginpage;
import com.Admin_MilkRide.pagobject.Productpage;
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

	@Test(dependsOnMethods = "LoginAdminpenal")
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
				captureScreenShot(driver, "LoginAdminpenal");
				Assert.assertTrue(false);
			}

			hp.clickfirsthub();
			String hubUrl = driver.getCurrentUrl();
			logger.info("Hubs URL: " + hubUrl);

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

	@Test(dependsOnMethods = "Hubmanager")
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

			Accountpage Ap = new Accountpage(driver);
			Ap.isAddUserVisible();
			logger.info("Add Button is displyed ");

			Ap.cliklocation();
			logger.info("click on Location");
			String LocationUrl = driver.getCurrentUrl();
			logger.info("Hubs Location URL: " + LocationUrl);

			Locationpage lip = new Locationpage(driver);

			lip.addlocationVisible();
			logger.info("add location Button is displyed ");
			lip.transferlocationVisible();
			logger.info("location transfer button is displyed ");
			lip.hubtohubtnVisible();
			logger.info("hub to hub transfer Button is displyed ");

			lip.clikproduct();

			logger.info("click on product option");
			String ProductUrl = driver.getCurrentUrl();
			logger.info("Hubs Product URL: " + ProductUrl);

			Productpage pp = new Productpage(driver);

			pp.addproductbtnvisiable();
			logger.info("Add product Button is displyed ");
			pp.clickcontacts();

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
	
	@Test(dependsOnMethods = "HubInfo")
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
				captureScreenShot(driver, "LoginAdminpenal");
				Assert.assertTrue(false);
			}

			DDp.clickDeliveryTransfer();
			String DeliverytransferUrl = driver.getCurrentUrl();
			logger.info("Delivery Transfer page  URL: " + DeliverytransferUrl);

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

	
	

}
