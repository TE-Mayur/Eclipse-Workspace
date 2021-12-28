package com.te.collectionimpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListimpl {

	public static void main(String[] args) {
			
			List list = new ArrayList();
			try {
			list.add(10);
			list.add("Name");
			list.add(true);
			list.add(null);
			list.add('c');
			list.add(null);
			list.add(10);
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}	
			Collections.sort(list);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
