package com.Admin_MilkRide.Utilities;


import java.io.FileInputStream;

import java.util.Properties;



public class ReadConfig {

	Properties properties;

	String path = "C:\\Users\\manal\\eclipse-workspace\\Admin_MilkRide\\configurations\\config.properties";

//constructor
	public ReadConfig() {
		try {
			properties = new Properties();

			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");

		if (value != null)
			return value;
		else {
			throw new RuntimeException("url not specified in config");
		}
	}

	public String getbrowser() {
		String value = properties.getProperty("browser");

		if (value != null)
			return value;
		else {
			throw new RuntimeException("url not specified in config");
		}

	}
}