package com.te.exceptions.checked;

import com.te.exceptions.comman.Employee;

public class ClassLoader {
	public static void main(String[] args) {
		try {
			// if class is found it will be loaded succcessfully else exception will be handled in catch block
			Employee employee = (Employee) Class.forName("com.te.exceptions.comman.Employee").newInstance();
			System.out.println(employee);
			System.out.println("Loaded Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
