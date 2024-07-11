package com.june15;

public class Employee {

	int emp_id;
	String name;
	String role;
	double salary;

	public Employee(int emp_id, String name, String role, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}

	
}
