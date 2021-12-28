package com.practice.programs;

import java.util.PriorityQueue;

public class PriorityImpl {

	public static void main(String[] args) {
		 
		PriorityQueue<String> ref = new PriorityQueue<String>();
		
		ref.add("Naveen");
		ref.add("Hari");
		ref.add("Ram");
		ref.add("Mayur");
		
		System.out.println(ref);
		
	for (String msg : ref) {
		System.out.println(msg);
	}
	}

}
