package com.training.practice;

public class ValidationTest {
	
	public void check(int age) throws InvalidException {
		
		if (age > 18) {
			System.out.println("vote eligible");
		} else {
			throw new InvalidException();
		}
		
	}

}
