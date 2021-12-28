package com.te.assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class CopyArrayList implements Cloneable {

	public static void main(String[] args) {

		ArrayList<Integer> ref = new ArrayList();

		ref.add(13);
		ref.add(21);
		ref.add(01);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);
		ref.add(14);
		ref.add(115);

		ArrayList<Integer> ref1 = ref;// by shallow copy

		ArrayList<Integer> obj = (ArrayList<Integer>) ref.clone();// by clone method

		ArrayList<Integer> ref2 = new ArrayList(ref);// by directly passing to the constructor

		System.out.println(ref2);
		System.out.println("By clone method");
		System.out.println(obj);

		Iterator<Integer> itr = ref.iterator();
		Iterator<Integer> itr1 = ref1.iterator();
		Iterator<Integer> itr2 = obj.iterator();

		for (Integer integer : obj) {
			System.out.print(integer + " ");
		}

		System.out.println();

		for (Integer integer1 : ref) {
			System.out.print(integer1 + " ");
		}

		System.out.println();

		for (Integer integer2 : ref1) {
			System.out.print(integer2 + " ");
		}

	}

}
