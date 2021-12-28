package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch {

		public static void main(String[] args) {
			
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			
			try {
				//Step 1 Load the driver
//				Driver driver = new Driver();
//				DriverManager.registerDriver(driver);
				
				Class.forName("com.mysql.jdbc.Driver"); 
				
				//step 2 Get connection via driver
				String dburl = "jdbc:mysql://localhost:3306/technoelevate?user=root&password=root";
				
				connection = DriverManager.getConnection(dburl);
				//step 3 Issue sql querries via connection
				
				String query = "select * from employees";
				
				statement = connection.createStatement();
				
//				CallableStatement cs = connection.prepareCall(query);
				
				resultSet = statement.executeQuery(query);
				
				//step 4 Process the result
				
				int i = 1;
				while (resultSet.next()) {
					System.out.println("-------------" + i + "--------------");
					System.out.println("Names  :" + resultSet.getString("ename"));
					System.out.println("EMPNO  :" + resultSet.getInt("empno"));
					System.out.println("Designation  :" + resultSet.getString("job"));
					System.out.println("Names  :" + resultSet.getString(""));
					System.out.println("Names  :" + resultSet.getString("ename"));
					
				}
				
				
				
			} catch (Exception e) {
			e.printStackTrace();
			}
			
			
		}
}
