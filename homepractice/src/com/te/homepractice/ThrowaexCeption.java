package com.te.homepractice;

public class ThrowaexCeption {

	public int hari() {
		int i = 4;
		int j = 4;

		if (i == j) {
			System.out.println(i);
			return i;

		} else {
			throw new ArithmeticException("not possible");
		}
	}

}
