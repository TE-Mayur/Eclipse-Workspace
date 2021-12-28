package com.te.practicemock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String dbUrl ="jdbc:mysql://localhost/3306:technoelevate?user:root&password:root";
			
			connection = DriverManager.getConnection(dbUrl);
			
			String query ="insert into employees where id=?";
			
		PreparedStatement statement = connection.prepareStatement(query);
			int result=statement.executeUpdate();
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
