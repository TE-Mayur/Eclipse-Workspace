package com.te.homepractice;

public class ThrowsTest {

	public static int div(int m, int n) throws ArithmeticException {
		int div = m / n;
		return div;

	}

	public static void main(String[] args) {

		ThrowsTest ref = new ThrowsTest();
		try {
				System.out.println(ref.div(5 , 0));

		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0");

		}
		System.out.println("Rest of the code");
	}
}
