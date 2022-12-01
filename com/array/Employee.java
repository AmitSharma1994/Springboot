package com.array;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee emp = new Employee(10, "Amit", 10000.00);
		Employee emp1 = new Employee(50, "pawan", 50000.00);
		Employee emp2 = new Employee(80, "Nitesh", 90000.00);
		Employee emp3 = new Employee(60, "vikas", 20000.00);
		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		Collections.sort(list);

		// iterating of array
		for (Employee empi : list) {
			System.out.println(empi);

		}

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

//sorting by id
	/*
	 * @Override public int compareTo(Employee emp) {
	 * 
	 * return this.id-emp.id; }
	 */

	// sorting by salary

	/*
	 * @Override public int compareTo(Employee emp) {
	 * 
	 * return (int) (this.salary - emp.salary); }
	 */
	// sorting by name

	/*
	 * @Override public int compareTo(Employee emp) {
	 * 
	 * return (int) (this.name.charAt(0) - emp.name.charAt(0)); }
	 */
	
}
