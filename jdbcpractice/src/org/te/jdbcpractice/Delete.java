package org.te.jdbcpractice;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/ems_db" ;
			
			connection = DriverManager.getConnection(dbUrl , "root" ,"root" );
			
			String query = "delete from employees_info where emp_id = 60";
			
			statement = connection.createStatement();
			
			int result = statement.executeUpdate(query);
			
			System.out.println(result + " Delete Successfully");
			
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
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
