package com.java.eight;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.stream.Collectors;



class Emplyee{
	private int id;
	private String name;
	private double salary;
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
	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Emplyee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}




public class EmpGretarSalary {

	public static void main(String[] args) {
		
	Emplyee e=new Emplyee(10,"Amit",10000.0);
	Emplyee e2=new Emplyee(10,"Pawan",5000.0);
	Emplyee e3=new Emplyee(10,"Sharma",7000.0);
	Emplyee e4=new Emplyee(10,"Neha",2000.0);
	Emplyee e5=new Emplyee(10,"Rat",3000.0);
		
	ArrayList<Emplyee> al=new ArrayList<Emplyee>();
	al.add(e);
	al.add(e5);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	
	// Find the salary which salary is grater than 5000
	//Solution filter method with method referance
	//al.stream().filter(emp->emp.getSalary()>5000).forEach(System.out::println);
	
	al.stream().filter(emp->emp.getSalary()>5000).forEach(emp->System.out.println(emp));
	// find the List of Employee which name is start with A
	//al.stream().filter(emp->emp.getName().startsWith("A")).forEach(System.out::println);
	
	//Find the List of Employee which  the salary is in sorting order 
	//Solution:-using sort method and passing the comprator 
	//al.stream().sorted((emp1,emp2)->(int)(emp2.getSalary()-emp1.getSalary())).collect(Collectors.toList()).forEach(System.out::println);;
	
	}
}
