package com.te.collectionimpl.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetMethods {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();

		hset.add("Jeans");
		hset.add("Shirt");
		hset.add("Pants");
		hset.add("T-shirt");
		hset.add("Shorts");
		hset.add("Trousers");
		System.out.println(hset);
		
		hset.add("Pants");
		System.out.println("-------------------------");
		System.out.println(hset);

		String Dress = "Pants";
		if (hset.contains(Dress)) {
			System.out.println(Dress + " is in the list.");
		} else {
			System.out.println(Dress + " is not in the list.");
		}

		List<String> list = new ArrayList<String>(hset);
		Collections.sort(list);
		System.out.println("-------------------------");
		System.out.println("Sorted Order List : " + list);
		hset.remove("Pants");
		System.out.println("-----------------------------------------");
	
		System.out.println("------------Iterating ------------");
		Iterator<String> iterator = hset.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("*******************************************************");
		HashSet<String> newDress = new HashSet<String>();
		newDress.add("Shoes");
		newDress.add("Belt");
		newDress.add("Perfumes");
		
		hset.removeAll(newDress);
		System.out.println("After removeAll : " + hset);

		System.out.println("-----------------------------------------");
		System.out.println("After removeIf : " + hset);
		System.out.println("-----------------------------------------");
		hset.retainAll(newDress);
		System.out.println("After retainAll : " + newDress);

		System.out.println("-----------------------------------------");
		hset.clear();
		System.out.println("After clear : " + hset);

	}
}
