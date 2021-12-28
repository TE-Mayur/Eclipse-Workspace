package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
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
			
			String querry = "delete from interns where id=60";
					
			 statement = connection.createStatement();
			 
			 //Step 4 process the result returned sql queries
			 
			 int result = statement.executeUpdate(querry);
			
			 System.out.println(result + " No. of row deleted");
			
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
