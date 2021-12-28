package com.te.threads.funs;

public class InterfaceTest {

	public static void main(String[] args) {

		MyInterface ref = () -> {
			System.out.println("Inside the count method ");
		};

		MyInterface ref2 = () -> {
			System.out.println("One more impl ");
		};

		MyInterface ref3 = () -> {
			System.out.println("again one more impl ");
		};

		ref.count();

		ref3.count();
		ref2.count();
	}

}
