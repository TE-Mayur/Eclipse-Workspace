package com.te.exceptions.throwtest;

import java.util.Scanner;

public class LoginToAdminTest {
	public static void main(String[] args) {
		
	

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the user name");
	String user= scanner.next();
	
	System.out.println("Enter the pwd name");
	String pwd= scanner.next();
	
	LoginToAdmin admin = new LoginToAdmin();
	try {
		admin.login(user,pwd);
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}

	
	
}
}