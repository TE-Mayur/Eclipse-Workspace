package com.te.homepractice;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the User ");
		String user = scan.next();
		
		System.out.println("Enter the Password ");
		String paswsd = scan.next();
		
		LoginAdmin admin = new LoginAdmin();
		try {
		admin.login(user, paswsd);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
