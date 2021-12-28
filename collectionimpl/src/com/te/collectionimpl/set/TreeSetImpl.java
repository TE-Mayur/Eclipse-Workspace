package com.te.collectionimpl.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(0);
		treeSet.add(7);
		treeSet.add(3);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(8);
		treeSet.add(6);

		Iterator<Integer> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		}
		System.out.println();
		System.out.println(treeSet);

		TreeSet<Character> character = new TreeSet<Character>();

		character.add('a');
		character.add('A');
		character.add('Z');
		character.add('f');
		character.add('L');

		System.out.println(character);

		TreeSet<String> names = new TreeSet<String>();
		names.add("Rasheed");
		names.add("Boopathi");
		names.add("Kevin");
		names.add("Zain");
		names.add("vivek");
		names.add("lokesh");
		names.add("Kishore");

		System.out.println(names);

	}
}
