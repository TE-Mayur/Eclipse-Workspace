package com.te.practice.collection;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("naveen", 5, 200.00);
		Employee emp2 = new Employee("david", 4, 100.00);
		Employee emp3 = new Employee("Ajith", 6, 400.00);
		
		TreeSet<Employee> ref = new TreeSet<Employee>();
		ref.add(emp1);
		ref.add(emp2);
		ref.add(emp3);
		System.out.println(ref);
		
		
	}

}
