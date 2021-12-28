package com.te.homepractice;

import java.io.Serializable;

public class Teachers implements Serializable,Comparable<Teachers> {
	
	private int id;
	
	private String name;

	public Teachers() {
		
	}

	public Teachers(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public int compareTo(Teachers o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", name=" + name + "]";
	}
	

}
