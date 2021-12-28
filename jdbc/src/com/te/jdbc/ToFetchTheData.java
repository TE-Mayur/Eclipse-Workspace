package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToFetchTheData {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// Step 1 Load the driver
//			DriverManager.registerDriver(driver);
//			Driver driver = new Driver();

			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 Get database connection via driver

			String dburl = "jdbc:mysql://localhost:3306/technoelevate?user=root&password=root";

			connection = DriverManager.getConnection(dburl);

			// Step 3 issue sql quarries via connection
			String query = "select * from employees";

			statement = connection.createStatement();

			resultSet = statement.executeQuery(query);

			// Step 4 Process the result
			int i = 1;
			while (resultSet.next()) {
				System.out.println("-----------" + i +"-------------");
				System.out.println("Names    :" + resultSet.getString("ename"));
				System.out.println("ID       :" + resultSet.getInt("empno"));
				System.out.println("HireDate :" + resultSet.getDate("hiredate"));
				System.out.println("Role     :" + resultSet.getString("job"));
//				System.out.println("DeptNo   :" + resultSet.getInt("deptno"));
				System.out.println("Salary   :" + resultSet.getDouble("salary"));
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
