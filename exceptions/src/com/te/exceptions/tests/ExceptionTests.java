package com.te.exceptions.tests;

public class ExceptionTests {

	public static void main(String[] args) {
		try {
			try {
				int a = 10;
				int b = 2;  	 //if b = 0 then it will generate Arithmetic exception
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("Divide id not possible in java");
			}

			
			System.out.println("This is executed");
			
			String name = "90"; 	//if name = empty then it will generate NullPointer exception

			System.out.println(name.length());

		} catch (NullPointerException e) {
			System.out.println("String is null");
		}

		System.out.println("Hi");
	}

}
