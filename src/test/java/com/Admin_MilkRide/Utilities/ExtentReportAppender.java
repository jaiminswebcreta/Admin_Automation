package com.Admin_MilkRide.Utilities;

import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.Serializable;

// This annotation tells Log4j2 that this class is a custom appender plugin
@Plugin(name = "ExtentReportAppender", category = "Core", elementType = "appender", printObject = true)
public class ExtentReportAppender extends AbstractAppender {

    protected ExtentReportAppender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, Property[] properties) {
        super(name, filter, layout, ignoreExceptions, properties);
    }

    // This method is called by Log4j2 whenever a log message is generated (e.g., logger.info)
    @Override
    public void append(LogEvent event) {
        // We get the currently running test from our ExtentManager
        if (ExtentManager.getTest() != null) {
            // Map Log4j2 levels to ExtentReports status
            final Status status = getStatus(event.getLevel().toString());
            // Log the message to the report
            ExtentManager.getTest().log(status, event.getMessage().getFormattedMessage());
        }
    }

    // Factory method that Log4j2 will use to create an instance of our appender
    @PluginFactory
    public static ExtentReportAppender createAppender(
            @PluginAttribute("name") String name,
            @PluginElement("Filter") final Filter filter,
            @PluginElement("Layout") Layout<? extends Serializable> layout,
            @PluginAttribute("ignoreExceptions") boolean ignoreExceptions) {
        
        if (name == null) {
            LOGGER.error("No name provided for ExtentReportAppender");
            return null;
        }
        if (layout == null) {
            layout = PatternLayout.createDefaultLayout();
        }
        return new ExtentReportAppender(name, filter, layout, ignoreExceptions, null);
    }

    // Helper method to convert Log4j2 Level to ExtentReports Status
 // In ExtentReportAppender.java

 // In ExtentReportAppender.java

    private Status getStatus(String level) {
        switch (level.toUpperCase()) {
            case "FATAL":
            case "ERROR":
                return Status.FAIL;
            case "WARN":
                return Status.WARNING;
            // Map both INFO and DEBUG from Log4j to INFO in the report
            case "INFO":
            case "DEBUG":
            case "TRACE":
                return Status.INFO;
            default:
                return Status.INFO; // Default to INFO for any other levels
        }
    }
    
    }
