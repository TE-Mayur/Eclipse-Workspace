package com.practice.programs;

class Bank {
	float getRateOfInterest() {
		return 0;
		}
}

class Sbi extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class Axis extends Bank {
	float getRateOfInterest() {
		return 5.4f;
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		Bank b;
		b = new Sbi();
		System.out.println("Rate of Interset of Sbi " + b.getRateOfInterest());
		b = new Axis();
		System.out.println("Rate of Interset of Axis " + b.getRateOfInterest());

	}

}
