package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// Step 1
			Class.forName("com.mysql.jdbc.Driver");

			// Step 2
			String dburl = "jdbc:mysql://localhost:3306/technoelevate";

			connection = DriverManager.getConnection(dburl, "root", "root");

			// step 3
			String querry = "insert into interns values "
					+ "('Pawan',140,'1999-05-23','M','JFS',8543795144,90000,200,'B+','pawav@gmail.com')";

			statement = connection.createStatement();

			int result = statement.executeUpdate(querry);

			// step 4
			System.out.println(result + "No. of Records inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (connection != null) {
					connection.close();
				}

				if (statement != null) {
					statement.close();
				}

				} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
