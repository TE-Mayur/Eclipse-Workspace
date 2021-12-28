package com.te.assignments;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> ref = new ArrayList();

		ref.add(13);
		ref.add(21);
		ref.add(01);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);

		System.out.println(ref);

		LinkedList<Integer> list = new LinkedList<Integer>(ref);// converting to Linked List
		System.out.println("After Converting to Linked List");
		System.out.println(list);

	}

}
