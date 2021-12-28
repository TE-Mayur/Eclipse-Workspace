package org.te.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllData {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/ems_db";

			connection = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "select * from employees_info";

			statement = connection.createStatement();

			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("EmpId : " + resultSet.getInt("emp_id"));
				System.out.println("EmpName : "+ resultSet.getString("emp_name"));
				System.out.println("Email : "+ resultSet.getString("mail"));
				System.out.println("Password : "+ resultSet.getString("pwd"));
				System.out.println("DOB : "+ resultSet.getDate("dob"));
				System.out.println("Mobile : "+ resultSet.getLong("mobile"));
				System.out.println("======================================");
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
