package org.te.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/ems_db?user=root&password=root";

			connection = DriverManager.getConnection(dbUrl);

			String query = "insert into employees_info values(60,'Ram','ram@gmail.com','ram123','1999-02-03',938345114)";

			statement = connection.createStatement();

			int result = statement.executeUpdate(query);
			
			System.out.println(result + "No. of rows affected");

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
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
