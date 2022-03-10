package com.qa.ac.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFIile {

	public String geturl(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/propertyFIle.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty(key);
		return url;
	}

	public String HPtitle() throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/propertyFIle.property");
		Properties p = new Properties();
		p.load(fis);
		String HPtitle = p.getProperty("TitleOFHomepage");
		return HPtitle;

	}

	public String HPRtitle() throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/propertyFIle.property");
		Properties p = new Properties();
		p.load(fis);
		String HPRtitle = p.getProperty("TitleOFHomepage1");
		return HPRtitle;

	}
}
