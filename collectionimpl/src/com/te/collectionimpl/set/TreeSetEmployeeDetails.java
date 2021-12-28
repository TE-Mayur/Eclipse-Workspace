package com.te.collectionimpl.set;

import java.util.TreeSet;

public class TreeSetEmployeeDetails {

	public static void main(String[] args) {

		Employee employee1 = new Employee(90, "Praveen", "Developer", 90000.0, "Bosch");
		Employee employee2 = new Employee(80, "Rasheed", "Tester", 25000.0, "Hitachi");
		Employee employee3 = new Employee(50, "Vivek", "Develop", 650000.0, "Hundai");
		Employee employee4 = new Employee(20, "Naveen", "Engineering", 45400.0, "Maruthi");
		Employee employee5 = new Employee(10, "Ram", "Archict", 950000.0, "Mahendra");

		TreeSet<Employee> employees = new TreeSet<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

//	Iterator<Employee> iterator =	employees.iterator();
//	while (iterator.hasNext()) {
//		Employee employee = (Employee) iterator.next();
//		System.out.println(employee);

		for (Employee employee : employees) {
			System.out.print(employee);
			System.out.println();
		}

	}
}
