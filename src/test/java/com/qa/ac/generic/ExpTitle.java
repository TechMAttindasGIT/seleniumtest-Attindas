package com.qa.ac.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExpTitle {
public	String getExpTitle(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./TestData/titles.property");
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	}

	
}
