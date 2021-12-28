package com.te.collectionimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl1 {

	public static void main(String[] args) {
		 
		List<Integer> list = new ArrayList();
		
		System.out.println("------Intial List--------");
		System.out.println(list);
		System.out.println("-----add(data) and add(index,data)-----");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(4,40);
		list.add(5,50);
		list.add(100);
		System.out.println(list);
		
		System.out.println("------ removes(data) and remove(index,data)-----");
		list.remove(0);
		list.remove(new Integer(100));
		System.out.println(list);
		
		System.out.println("-----set(index,data-----)");
		list.set(0, 100);
		list.set(3, 300);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		System.out.println("----clear()--------");
		list.clear();
		System.out.println(list);
		
		System.out.println("----contains(data) and containsAll----");
		System.out.println(list.contains(20));
		System.out.println(list.contains(100));
		
		List<Integer> integers = new ArrayList<Integer>();
	 	
		integers.add(10);
		integers.add(20);
		System.out.println(list.containsAll(integers));
		
		System.out.println("----indexOf(data) and lastIndexOf(data)----");
		list.add(20);
		System.out.println(list);
		System.out.println(list.indexOf(20));//0
		System.out.println(list.lastIndexOf(20));//6
		
		System.out.println("isEmpty()---> " + list.isEmpty());
		System.out.println(list.removeAll(integers));
		System.out.println("after removesAll ---> " + list);
		
		System.out.println("----toArray()----");
		Object[] arr = list.toArray();
		System.out.println(arr);
		
		System.out.println("---sublist(sindex,lindex)-----");
		
		System.out.println(list);
		List<Integer> subList = list.subList(0, 3);
		System.out.println(subList);
		
		System.out.println("---get index---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("----Sorting ArrayList---");
		System.out.println("Before sort " + list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("After sort " + list);
		
	}
}
