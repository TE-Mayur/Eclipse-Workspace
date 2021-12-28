package com.te.exceptions.tests;

public class CloneTest {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("Paul");
		employee.setRole("Developer");
		employee.setSalary(45000);

		System.out.println("Before Changes");
		Employee employee2 = null;
		try {
			System.out.println("Emp :" + employee);
			employee2 = (Employee) employee.clone();
			System.out.println("Emp 2 :" + employee2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("After Changes");
		employee.setEid(50);
		employee.setEname("Sharuk");
		
		System.out.println("Emp :"+ employee);
		
		System.out.println("Emp2 :"+ employee2);

	}

}
