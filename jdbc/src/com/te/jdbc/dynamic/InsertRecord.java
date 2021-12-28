package com.te.jdbc.dynamic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertRecord {
	public static void main(String[] args) {

		FileInputStream inputStream = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			inputStream = new FileInputStream("dbInfo.properties");
			Properties prop = new Properties();
			prop.load(inputStream);

			// Step 1
			Class.forName(prop.getProperty("driver"));

			// step 2
			connection = DriverManager.getConnection(prop.getProperty("dbUrl"), prop);

			// step 3
			String query = "insert into interns values (?,?,?,?,?,?,?,?,?)";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, (args[0]));
			preparedStatement.setInt(2, Integer.parseInt(args[1]));
			preparedStatement.setDate(3, java.sql.Date.valueOf(args[2]));
			preparedStatement.setString(4, args[3]);
			preparedStatement.setString(5, args[4]);
			preparedStatement.setLong(6, Long.parseLong(args[5]));
			preparedStatement.setDouble(7, Double.parseDouble(args[6]));
			preparedStatement.setInt(8, Integer.parseInt(args[7]));
			preparedStatement.setString(9, args[8]);
			
			int res = preparedStatement.executeUpdate();

			// step 4
			if (res == 1) {
				System.out.println("Data inserted successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(inputStream != null) {
				inputStream.close();
			}
			if(connection != null) {
				connection.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
