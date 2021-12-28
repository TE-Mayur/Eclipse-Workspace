package com.te.collectionimpl.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
		
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println("--------for each----------");
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println("---------Iterator----------");
		
//		Iterator<Integer> iterator =set.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);
//		System.out.println("before sort " + arrayList);
//		Collections.sort(arrayList);
//		System.out.println("After sort " + arrayList);
//		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
				System.out.println(itr.next());
		}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);
		System.out.println("Before sorting " + arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting " + arrayList);
		
	}
}
