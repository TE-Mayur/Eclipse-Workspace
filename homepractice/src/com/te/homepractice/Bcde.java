package com.te.homepractice;

import java.util.Scanner;

public class Bcde {

	public static void main(String[] args) {
		
		Abcd ref = new Abcd();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user name");
		String user= scan.next();
		
		System.out.println("Enter the password");
		String paswrd = scan.next();
		
		try {
			ref.login(user, paswrd);
	}catch(InvalidCredentialException e) {
		System.out.println(e.getMessage());
	}
	}
}
