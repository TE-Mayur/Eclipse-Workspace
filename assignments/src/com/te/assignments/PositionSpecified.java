package com.te.assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PositionSpecified {
	public static void main(String[] args) {

		List<Integer> ref = new LinkedList<Integer>();

		ref.add(10);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);

		Iterator<Integer> itr = ref.listIterator(1);// starting from index 1 (we can write 2 for second and so on)

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
