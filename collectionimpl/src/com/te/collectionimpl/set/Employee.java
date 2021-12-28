package com.te.collectionimpl.set;

public class Employee implements Comparable<Employee> {

	private Integer id;

	private String name;

	private String role;

	private Double salary;

	private String client;

	public Employee(Integer id, String name, String role, Double salary, String client) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.client = client;
	}

	public Employee() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", client=" + client
				+ "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(Employee o) {
		return this.hashCode() - o.hashCode();
//		return this.name.compareTo(o.name);
	}
}
