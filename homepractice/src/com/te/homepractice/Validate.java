package com.te.homepractice;

public class Validate {

		public static void validate(int age) {
			if(age<18) {
				throw new ArithmeticException("Person is not eligble to vote");
			}else {
				System.out.println("The person is eligible to vote ");
			}
			
		}

		public static void main(String[] args) {
			
			validate(13);
		System.out.println("Welcome to vote");
		}



}

