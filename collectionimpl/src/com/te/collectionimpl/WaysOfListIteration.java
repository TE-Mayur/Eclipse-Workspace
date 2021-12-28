package com.te.collectionimpl;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysOfListIteration {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println("----using Iterator------");

//		Iterator<Integer> itr = list.iterator(); ---> 
//		Iterator<Integer> itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.print(" " + itr.next());
//			
//		}
		
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();

		System.out.println("----using ListIterator (Forward)------");

		ListIterator<Integer> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.print(" " + listIterator.next());
		}
		System.out.println();

		System.out.println("----using ListIterator (Backward)------");
		ListIterator<Integer> iterator = list.listIterator(list.size());

		while (iterator.hasPrevious()) {
			System.out.print(" " + iterator.previous());
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
