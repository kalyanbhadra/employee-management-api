package com.kals.rest.model;

public class Employee {
	private int employeeId;
	private String department;
	private double salary;
	
	
	public Employee() {
	}


	public Employee(int employeeId, String department, double salary) {
		super();
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
}
