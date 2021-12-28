package org.te.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetching {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

//		Step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");

//		Step 2 Get the connection via driver

			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=root";

			connection = DriverManager.getConnection(dbUrl);

//		Step 3 Issue the sql query via connection

			String query = "select * from employees_info where emp_id = 30";

			statement = connection.createStatement();

			resultSet = statement.executeQuery(query);

//		Step 4 Process the result

			while (resultSet.next()) {
				System.out.println("EmpId : " + resultSet.getInt("emp_id"));
				System.out.println("EmpName : " + resultSet.getString("emp_name"));
				System.out.println("Email : " + resultSet.getString("mail"));
				System.out.println("Password : " + resultSet.getString("pwd"));
				System.out.println("DOB : " + resultSet.getDate("dob"));
				System.out.println("Mobile : " + resultSet.getLong("mobile"));
				System.out.println("============xxxxxxxxxx============");
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
//		Step 5 Close all the objects
			finally {
			try {
			if (connection != null) {
				connection.close();
			}if (statement != null) {
				statement.close();
			}if (resultSet != null) {
				resultSet.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
