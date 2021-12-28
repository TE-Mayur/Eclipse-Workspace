package com.te.jdbc.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFIle {
	public static void main(String[] args) {

		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("dbIn.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();

		prop.setProperty("user", "root");
		prop.setProperty("password", "root");
		prop.setProperty("dbUrl", "jdbc:mysql://localhost:3306/technoelevate");
		prop.setProperty("driver", "com.mysql.jdbc.Driver");

		try {
			prop.store(outputStream, "DB Inforamation");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Success");
		}
	}
}