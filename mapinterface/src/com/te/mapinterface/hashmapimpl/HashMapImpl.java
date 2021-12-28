package com.te.mapinterface.hashmapimpl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("A", 10);			//Only 1 null key & multi null values
		map.put(null, 20);			//Duplicate keys not allowed & values can be duplicate
		map.put("B", 30);			//Not index based
		map.put("C", 50);			//No insertion order
		map.put(null, 30);					
		map.put("B", null);
		map.put("d", null);
		System.out.println(map);

		System.out.println("--------------EntrySet-----------");

		Set<Entry<String, Integer>> entries = map.entrySet();

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println("-----------get---------");

		Set<String> set = map.keySet();
		
		for (String key : set) {
			System.out.println(key + " = " + map.get(key));
		}
	
		System.out.println("----------Iterator---------");
		
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		
		System.out.println("only values");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	
	}
	

}
