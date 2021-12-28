package com.te.assignments;

import java.util.LinkedList;

public class Occurrence {
	public static void main(String[] args) {

		LinkedList<Integer> ref = new LinkedList();

		ref.add(13);
		ref.add(21);
		ref.add(01);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);
		ref.add(14);
		ref.add(115);

		System.out.println("------------List Values-----------");
		System.out.println(ref);

		System.out.println("-----------first and last occurences-----------");
		Object o1 = ref.getFirst();
		Object o2 = ref.getLast();

		System.out.println("First element " + " " + o1);
		System.out.println("Last element " + " " + o2);

	}

}
