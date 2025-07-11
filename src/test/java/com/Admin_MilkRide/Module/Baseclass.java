package com.Admin_MilkRide.Module;


import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import com.Admin_MilkRide.Utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	ReadConfig readconfig = new ReadConfig();

	String url = readconfig.getBaseUrl();
	String browser = readconfig.getbrowser();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		default:
			driver = null;
			break;
		}
		
		// Maximize the browser window
		driver.manage().window().maximize();
		//implicitywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//for logging
		
		logger = LogManager.getLogger(Baseclass.class);	
		//open url
		
				driver.get(url);
				
				logger.info("Url Open");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
		
		
	}
	//user method to capture screen shot
	// In Baseclass.java
	public static String captureScreenShot(WebDriver driver, String testName) throws IOException {
	    TakesScreenshot screenshot = ((TakesScreenshot)driver);
	    File src = screenshot.getScreenshotAs(OutputType.FILE);
	    String destPath = System.getProperty("user.dir") + "//screenshots//" + testName + ".png";
	    File dest = new File(destPath);
	    FileUtils.copyFile(src, dest);
	    return destPath; // Return the path for the listener
	}

}
