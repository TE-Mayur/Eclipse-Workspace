package com.training.practice;

import java.util.Scanner;

public class ExceptoinTest {
	
	public static void main(String[] args) {
		
		//Class.forName("com.mysql.jdbc.Driver");
		ValidationTest ref = new ValidationTest();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		
		try {
			ref.check(a);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
