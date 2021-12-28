package com.te.collectionimpl.set.sorting;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.te.collectionimpl.set.Employee;

public class SortingEmployee {

	public static void main(String[] args) {

		System.out.println("Sort by : \n 1.Id \n 2.Name \n 3.Salary \n 4.Client");
		System.out.println("Choose your option");
		Scanner scanner = new Scanner(System.in);
		int optn = scanner.nextInt();

		TreeSet<Employee> employees = null;

		switch (optn) {
		case 1:
			employees = new TreeSet<Employee>();
			break;
		case 2:
			employees = new TreeSet<Employee>(new SortByName());
			break;
		case 3:
			employees = new TreeSet<Employee>(new SortBySalary());
			break;
		case 4:
			employees = new TreeSet<Employee>(new SortByClient());
			break;
		default:
			System.out.println("Wrong Option");
			break;
		}

		if (employees != null) {

			Employee employee1 = new Employee(90, "Praveen", "Developer", 90000.0, "Bosch");
			Employee employee2 = new Employee(80, "Rasheed", "Tester", 25000.0, "Hitachi");
			Employee employee3 = new Employee(50, "Vivek", "Develop", 650000.0, "Hundai");
			Employee employee4 = new Employee(20, "Naveen", "Engineering", 45400.0, "Maruthi");
			Employee employee5 = new Employee(10, "Ram", "Archict", 950000.0, "Mahendra");

			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			employees.add(employee4);
			employees.add(employee5);

			for (Employee employee : employees) {
				System.out.println(employee);
			}
			scanner.close();
		}

	}

}
