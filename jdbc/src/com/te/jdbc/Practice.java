package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;
public class Practice {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			//Step 1 Load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			//Step 2 get database connection via driver
			
			String dbUrl = "jdbc:mysql://localhost:3306/technoelevate?user=root&password=root";
			
			connection = DriverManager.getConnection(dbUrl);
			
			// Step 3 issue the sql query via connection
			String query = " select * from employees ";
		
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(query);
			
			//Step 4 process the result
			
			int i =1;
			while (resultSet.next()) {
				System.out.println("========="+ i + "==============");
				System.out.println("empNo :" + resultSet.getInt("empno"));
				System.out.println("Names :" + resultSet.getString("ename"));
//				System.out.println("Dob :" + resultSet.getDate("dob"));
				System.out.println("Job : " + resultSet.getString("job"));
//				System.out.println("Role   : " + resultSet.getString("role"));
//				System.out.println("Mobile : " + resultSet.getLong("mobile"));
//				System.out.println("DeptId : " + resultSet.getInt("deptid"));
//				System.out.println("Email  : " + resultSet.getString("email_id"));
				i++;	
			}
			
		} catch (Exception e) {
		}
		finally {
			try {
				if(connection != null ) {
					connection.close();
				}
				if(statement != null ) {
					statement.close();
				}
				if(resultSet != null ) {
					resultSet.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
