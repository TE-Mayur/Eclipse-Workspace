package com.te.jdbc.dynamic;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateRecord {
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
			String query = "update interns set name =?,salary=? where id=?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, (args[0]));
			preparedStatement.setDouble(2, Double.parseDouble(args[1]));
			preparedStatement.setInt(3, Integer.parseInt(args[2]));

			int res = preparedStatement.executeUpdate();

			// step 4
			if (res == 1) {
				System.out.println("Data updated successfully");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Step 5 
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
