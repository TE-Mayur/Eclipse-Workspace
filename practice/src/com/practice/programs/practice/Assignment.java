package com.practice.programs.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment {

	public static void main(String[] args) {
		Set<String> h = new HashSet<String>();

		System.out.println(h.isEmpty());

		h.add("Mayur");
		h.add("Naveen");
		h.add("Hari");
		
		System.out.println(h);
		
		System.out.println("-----------------------------------------");
		System.out.println(h.contains("Mayur"));
		System.out.println(h.containsAll(h));

		System.out.println("----------------------------------------");
		System.out.println(h.remove("Naveen"));
		System.out.println(h);

		System.out.println("----------------------------------------");

		Iterator<String> itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			System.out.println("---------------------------------------");
			// * h.clear();
			System.out.println(h.isEmpty());
			System.out.println("---------------------------------------");

			System.out.println(h.size());
			System.out.println(h.spliterator());
		}

	}

}
