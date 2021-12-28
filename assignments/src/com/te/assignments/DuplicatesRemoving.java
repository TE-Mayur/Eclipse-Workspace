package com.te.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesRemoving {
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
		ref.add(61);
		ref.add(14);
		
		// converting to LinkedHashSet using stream API
		Set<Integer> obj = ref.stream().map(x -> x).collect(Collectors.toCollection(LinkedHashSet::new));

		System.out.println("after removing duplicates ");
		System.out.println(obj);

	}

}
