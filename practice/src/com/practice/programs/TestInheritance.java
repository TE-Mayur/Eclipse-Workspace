package com.practice.programs;


class Animal{
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Eats Pideegri");
	}
}
class BabyDog extends Animal{
	void eat() {
		System.out.println("Drinks milk");
	}
}
public class TestInheritance {
	
	public static void main(String[] args) {
		
		Animal animal=new Animal();
		
	}
     
}
