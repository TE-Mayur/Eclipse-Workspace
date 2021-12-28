package com.te.jdbc.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws Exception {
		
		FileInputStream inputStream = new FileInputStream("dbIn.properties");
		
		Properties prop = new Properties();
		prop.load(inputStream);
		
		System.out.println("User : " + prop.getProperty("user"));
		System.out.println("Password : " + prop.getProperty("password"));
		System.out.println("dbUrl : " + prop.getProperty("dbUrl"));
		System.out.println("Driver : " + prop.getProperty("driver"));
	}
}
