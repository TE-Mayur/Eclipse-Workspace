package com.obj.classmethods;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();

		employee1.setEid(10);
		employee1.setEname("Boopathi");
		employee1.setRole("Developer");
		employee1.setSalary(20000.0);

		System.out.println(employee1.hashCode());
		System.out.println(employee1.toString());

		Employee employee2 = new Employee();

		employee2.setEid(55);
		employee2.setEname("Ram");
		employee2.setRole("Tester");
		employee2.setSalary(150000);

		Employee employee3 = new Employee();

		employee3.setEid(55);
		employee3.setEname("Ram");
		employee3.setRole("Tester");
		employee3.setSalary(150000);
		
		Employee employee4 = new Employee();

		employee4.setEid(47);
		employee4.setEname("Ramesh");
		employee4.setRole("Senior Tester");
		employee4.setSalary(150000);
		
		Employee employee5 = new Employee();

		employee5.setEid(60);
		employee5.setEname("Ramesh");
		employee5.setRole("Manager");
		employee5.setSalary(500000);

//		System.out.println(employee2.equals(employee1));
//		System.out.println(employee2.equals(employee3));
//		System.out.println(employee3.equals(employee4));
		
		Object[] employees = new Object[5];
				employees[0] = employee1;
				employees[1] = employee2;
				employees[2] = employee3;
				employees[3] = employee4;
				employees[4] = employee5;
				
				for(Object emp : employees ) {
					Employee employee = (Employee) emp;
					System.out.println(employee.getEid());
					System.out.println(employee.getEname());
					System.out.println("===================================");
					
					
				}
				Employee[] employees1 = new Employee[4];
				employees[0] = employee1;
				employees[1] = employee2;
				employees[2] = employee3;
				employees[3] = employee4;
				
				for (Employee employee : employees1) {
					System.out.println(employee.getEid());
					System.out.println(employee.getEname());
					System.out.println(employee.getRole());
					System.out.println(employee.getSalary());
					System.out.println("============================");
				}
				
	}
}
