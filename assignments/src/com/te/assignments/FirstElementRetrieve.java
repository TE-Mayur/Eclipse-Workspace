package com.te.assignments;

import java.util.LinkedList;

public class FirstElementRetrieve {

	public static void main(String[] args) {

		LinkedList<Integer> ref = new LinkedList();

		ref.add(21);
		ref.add(01);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);

		Integer obj = ref.peekFirst();// only wrapper class supports, only LinkedList should be used since this comes from deque
		
		System.out.println("-----------Original List-----------");
		System.out.println(ref);
		System.out.println("-----------After Retrieving-----------");
		System.out.println(obj);
	}
}
