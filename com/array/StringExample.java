package com.array;

public class StringExample {

	void method1(String s) {
		System.out.println("String");
		System.out.println(s);
	}

	void method1(Object s) {
		System.out.println("Object");
		System.out.println(s);
	}

	void method1(int i) {
		
		System.out.println("int");
		
		System.out.println(i);
	}

	public static void main(String[] args) {
		StringExample se=new StringExample();
		
		se.method1('a');
	}
}
