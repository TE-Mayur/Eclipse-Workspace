package com.te.collectionimpl.set;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashSetSudentImp {
	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);

		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			arrayList.add(30);
			System.out.println(iterator.next());
			System.out.println(arrayList);
		}
	}
}