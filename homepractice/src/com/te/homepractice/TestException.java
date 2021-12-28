package com.te.homepractice;

public class TestException {
	public static void main(String[] args) {
		
		ThrowaexCeption ref= new ThrowaexCeption();
		try {
		ref.hari();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		}
}
