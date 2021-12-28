package org.te.jdbcpractice.dynamically;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectDynamic {

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			fileInputStream = new FileInputStream("prop.properties");
			Properties proper = new Properties();
			proper.load(fileInputStream);

//			step 1 Load the driver
			Class.forName(proper.getProperty("Driver"));

//			step 2 Set a connection via driver 
			connection = DriverManager.getConnection(proper.getProperty("dbUrl"), proper);

			String query = "select * from employees_info where emp_id = ?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, Integer.parseInt(args[0]));

			resultSet = preparedStatement.executeQuery();

			// step 4
			if (resultSet.next()) {
				System.out.println("Name   : " + resultSet.getString("emp_name"));
				System.out.println("Id     : " + resultSet.getInt("emp_id"));
				System.out.println("DOB    : " + resultSet.getDate("dob"));
				System.out.println("Mobile : " + resultSet.getLong("mobile"));
				System.out.println("Password : " + resultSet.getString("pwd"));
				System.out.println("Email  : " + resultSet.getString("mail"));

			}

		} catch (Exception e) {
			e.printStackTrace();
//		} finally {
//			try {
//				preparedStatement.close();
//				connection.close();
//				resultSet.close();
//
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
	}
}
}