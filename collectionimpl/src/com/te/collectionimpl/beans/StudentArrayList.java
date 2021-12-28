package com.te.collectionimpl.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(10,"Kevin"));
		list.add(new Student(80,"Ram"));
		list.add(new Student(40,"Harsh"));
		list.add(new Student(30,"Lucky"));
		
		
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("after sort");
		Collections.sort(list);
		for(Student student : list) {
			System.out.println(student);
		}
	}
}
