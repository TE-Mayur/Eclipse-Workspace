package com.obj.array;

import java.util.Scanner;

import com.obj.classmethods.Employee;

public class ScannerTest extends Employee {
	
	static Scanner scanner;
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		scanner = new Scanner(System.in);
		System.out.println("Enter the employee one details");
		
		System.out.println("Enter the Employee ID :");
		int eid = Integer.parseInt(scanner.next());
		employee1.setEid(eid);
	
		System.out.println("Enter the Employee name :");
		String name = scanner.next();
		employee1.setEname(name);
		
		System.out.println("Enter the Employee Role :");
		String role = scanner.next();
		employee1.setRole(role);
		
		System.out.println("Enter the Employee Salary :");
		double sal = Double.parseDouble(scanner.next());
		employee1.setSalary(sal);
		
		System.out.println("========================");
		System.out.println(employee1);
	
		
	
	
	}
	
}
