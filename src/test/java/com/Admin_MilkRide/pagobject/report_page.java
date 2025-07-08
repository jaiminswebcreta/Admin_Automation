package com.Admin_MilkRide.pagobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class report_page {
    WebDriver lDriver;

    public report_page(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    // Add your web elements and methods here
}
