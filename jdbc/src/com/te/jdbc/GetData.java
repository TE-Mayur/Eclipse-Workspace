package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/technoelevate?user=root&password=root";
			
			connection = DriverManager.getConnection(dbUrl);
			
			String query = "select * from employees";
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(query);
			
			int i = 1;
			while (resultSet.next()) {
				System.out.println("-------------"+ i +"------------");
				System.out.println("Names    :" + resultSet.getString("ename"));
				System.out.println("ID       :" + resultSet.getInt("empno"));
				System.out.println("HireDate :" + resultSet.getDate("hiredate"));
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
	}finally {
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
			// TODO: handle exception
		}
	}
	}
}
