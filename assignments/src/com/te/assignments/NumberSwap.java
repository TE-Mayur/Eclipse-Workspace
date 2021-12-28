package com.te.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSwap {

	public static void main(String[] args) {

		ArrayList<Integer> ref = new ArrayList();

		ref.add(10);
		ref.add(21);
		ref.add(57);
		ref.add(32);
		ref.add(61);
		ref.add(45);

		System.out.println("-------Before Swapping the ArrayList--------------");
		System.out.println(ref);

		Collections.swap(ref, 4, 5);//swap inbuilt method of collections class
		System.out.println("---------After Swapping the ArrayList--------------");
		System.out.println(ref);

	}

}
