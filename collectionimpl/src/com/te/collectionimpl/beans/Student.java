package com.te.collectionimpl.beans;

import java.io.Serializable;

public class Student implements Serializable,Comparable<Student>{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	public Student() {
		
	}

	public Student(int id , String name) {
		super();
		this.id =id;
		this.name= name;
	}
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student std) {
	//	return this.getId() - std.getId(); //
	//	return this.getId() - this.getId();
		return this.getName().compareTo(std.getName());
	//	return 0;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	}
	
	
