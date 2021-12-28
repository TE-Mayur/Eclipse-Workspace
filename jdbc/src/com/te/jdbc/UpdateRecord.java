package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			
			//Step 1 load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2 get db connection via driver
			
			String dburl ="jdbc:mysql://localhost:3306/technoelevate";
			
			connection = DriverManager.getConnection(dburl, "root", "root");
			
			//Step 3 issue sql queries via connection
			
			String query="update interns set name='Sachin' where name='Mayur'" ;
			
			statement=connection.createStatement();
			
			int result = statement.executeUpdate(query);
			//Step4 
			System.out.println(result+"Record updated");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		finally {
			try {
			if(connection != null) {
				connection.close();
			}
			
			if(statement != null) {
				statement.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		}
	}
}