package com.practice.programs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> ref = new LinkedList<Integer>();
		
		ref.add(54);
		ref.add(21);
		ref.add(514);
		ref.add(34);
		ref.add(94);
		ref.add(74);
		ref.add(54);
		
		System.out.println("original " + ref);
		Collections.sort(ref);
		
		System.out.println("After Iterator ");
		Iterator<Integer> itr =	ref.iterator();
		for (Integer integer : ref) {
			System.out.println(integer);
			
		}
	
	
		
	}
}
