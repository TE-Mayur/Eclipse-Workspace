package com.te.homepractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListArray {

	public static void main(String[] args) throws NullPointerException {

		Vector<Integer> list = new Vector<Integer>();

		list.add(5);
		list.add(null);
		list.add(null);
		list.add(47);
		list.add(47);
		list.add(51);
		list.add(null);
		list.add(5, 99);
		
		System.out.println("--------original List-----------");
		System.out.println(list);

		System.out.println("--------ForEach loop-----------");
		for (Object obj : list) {
			System.out.print(" " + obj);
		}
		System.out.println();
		
		System.out.println("--------for loop-----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		System.out.println();
		System.out.println("--------Iterator-----------");
		Iterator<Integer> obj = list.iterator();
		while (obj.hasNext()) {
			System.out.print(" " + obj.next());
		}
		System.out.println();
		
		System.out.println("--------List Iterator-----------");
		ListIterator<Integer> obj1 = list.listIterator();
		while (obj1.hasNext()) {
			System.out.print(" " + obj1.next());
		}
		System.out.println();
		
		System.out.println("-----------backward iterator-------------");
		ListIterator<Integer> iter = list.listIterator(list.size());
		
		while (iter.hasPrevious()) {
			System.out.print(" " + iter.previous());
			
			
		}
		System.out.println();
	}
}
