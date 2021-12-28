package org.te.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/ems_db";

			connection = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "update employees_info set emp_name ='Naveen' , pwd='naveen123' where emp_name='Naveen'";

			statement = connection.createStatement();

			int result = statement.executeUpdate(query);

			System.out.println(result + "Updated Successfully");

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
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
