package com.te.mapinterface.hashmapimpl;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapImpl {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("A", 10);
		map.put("M", 20);
		map.put("B", 30);
		map.put("B", 50);
		map.put("Z", 30);
		map.put("C", null);
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
	
	
		
	
		
	}
	
}
