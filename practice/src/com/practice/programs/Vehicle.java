package com.practice.programs;

// Program using abstract class and methods 
abstract class Vehicle {

	abstract void run();
}

class Bike extends Vehicle {
	void run() {
		System.out.println("bike is Running");
	}

	public static void main(String[] args) {

		Vehicle v = new Bike();
		v.run();
	}
}
