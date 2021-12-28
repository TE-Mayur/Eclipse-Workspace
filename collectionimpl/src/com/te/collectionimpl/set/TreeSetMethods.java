package com.te.collectionimpl.set;

import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {

		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(50);
		integers.add(20);
		integers.add(80);
		integers.add(10);
		integers.ceiling(5);
		integers.clone();
		System.out.println(integers);
		System.out.println("====================================");
		System.out.println("Contains " + integers.contains(30));
		System.out.println("====================================");
		System.out.println("First Value " + integers.first());
		System.out.println("====================================");
		System.out.println("Last Value " + integers.last());
		System.out.println("====================================");
		System.out.println("Lower " + integers.lower(12));
		System.out.println("====================================");
		System.out.println("Higher " + integers.higher(10));
		System.out.println("====================================");
		integers.remove(50);
		System.out.println("After removing element " + integers);
		integers.pollFirst();
		System.out.println("====================================");
		System.out.println("After removing first " + integers);
		integers.pollLast();
		System.out.println("====================================");
		System.out.println("After removing last " + integers);
		for (Integer value : integers)
			System.out.print(value + " ");
		System.out.println();
	}

}
