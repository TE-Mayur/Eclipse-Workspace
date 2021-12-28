package com.te.threads.funs;

public class Test {
	public static void main(String[] args) {

		MyInterface2 ref = (a) -> {
			System.out.println("Inside the count method ");
		};

		MyInterface2 ref2 = (a) -> {
			System.out.println("One more method ");
		};
		
		MyInterface2 ref3 = (c) -> {
			System.out.println("Extra method ");
		};
	}

}
