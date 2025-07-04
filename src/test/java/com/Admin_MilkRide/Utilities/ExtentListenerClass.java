package com.Admin_MilkRide.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Admin_MilkRide.Module.Baseclass;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass extends Baseclass implements ITestListener {

    ExtentSparkReporter htmlReporter;
    ExtentReports reports;
    ExtentTest test;

    public void configureReport() {
        ReadConfig readConfig = new ReadConfig();
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String reportName = "AdminMilkRideTestReport-" + timestamp + ".html";
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
        reports = new ExtentReports();
        reports.attachReporter(htmlReporter);

        // System info
        reports.setSystemInfo("Machine", "TestPC1");
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("Browser", readConfig.getbrowser());
        reports.setSystemInfo("User", "Jaimin Sharma");

        // Report Theme
        htmlReporter.config().setDocumentTitle("MilkRide Admin Automation Report");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setTheme(Theme.DARK);
    }

    @Override
    public void onStart(ITestContext context) {
        configureReport();
        System.out.println("On Start method invoked....");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("On Finish method invoked....");
        reports.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = reports.createTest(result.getName());
        test.log(Status.PASS, MarkupHelper.createLabel("Test Passed: " + result.getName(), ExtentColor.GREEN));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        test = reports.createTest(result.getName());
        test.log(Status.FAIL, MarkupHelper.createLabel("Test Failed: " + result.getName(), ExtentColor.RED));

        // Take Screenshot
        String screenshotPath = System.getProperty("user.dir") + "//screenshots//" + result.getName() + ".png";
        try {
            captureScreenShot(driver, result.getName());
            File screenshot = new File(screenshotPath);
            if (screenshot.exists()) {
                test.fail("Screenshot:", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test = reports.createTest(result.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel("Test Skipped: " + result.getName(), ExtentColor.YELLOW));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not used
    }
}
