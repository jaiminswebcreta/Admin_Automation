package com.Admin_MilkRide.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

    // Singleton instance of ExtentReports
    public static ExtentReports extent;
    
    // ThreadLocal is used to make the ExtentTest object thread-safe for parallel execution
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    /**
     * The singleton getInstance() method. It creates the ExtentReports instance
     * if it doesn't exist, and returns the existing one if it does.
     */
    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    /**
     * Creates the ExtentReports and ExtentSparkReporter objects.
     */
    public static void createInstance() {
        ReadConfig readConfig = new ReadConfig();
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String reportName = "AdminMilkRideTestReport-" + timestamp + ".html";
        String reportPath = System.getProperty("user.dir") + "/Reports/" + reportName;

        // Configure the Spark Reporter (the HTML file)
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        htmlReporter.config().setDocumentTitle("MilkRide Admin Automation Report");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("utf-8");

        // Create the main ExtentReports object and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Add system information to the report
        extent.setSystemInfo("Machine", "TestPC1");
        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", readConfig.getbrowser());
        extent.setSystemInfo("User", "Jaimin Sharma");
    }

    /**
     * Starts a new test in the report and stores it in the ThreadLocal variable.
     */
    public static synchronized void startTest(String testName, String description) {
        ExtentTest test = getInstance().createTest(testName, description);
        extentTest.set(test);
    }

    /**
     * Retrieves the current test from the ThreadLocal variable.
     * This ensures the log messages go to the correct test.
     */
    public static synchronized ExtentTest getTest() {
        return extentTest.get();
    }
}