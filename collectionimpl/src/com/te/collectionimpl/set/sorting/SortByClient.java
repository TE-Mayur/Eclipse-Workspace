package com.te.collectionimpl.set.sorting;

import java.util.Comparator;

import com.te.collectionimpl.set.Employee;

public class SortByClient implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String client1 = o1.getClient();
		String client2 = o2.getClient();
		return client1.compareTo(client2);
	}

}
