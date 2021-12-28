package com.practice.programs;

public class Program1 {

	public static void main(String[] args) {
		Program1 prog= new Program1();
		System.out.println("The sum of a+b is " + prog.add(25,45) );
	}
	
	int s;
 public int add(int a,int b) {
	s = a+b;
	return s;
	
}
}