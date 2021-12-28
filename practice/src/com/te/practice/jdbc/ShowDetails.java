package com.te.practice.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowDetails {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
	//		Step 1 Load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
	//	Step 2 get connection via driver
		String str = "jdbc:mysql://localhost:3306/technoelevate?user=root&password=root";
		
	// Step 3 issue sql quarries	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
