package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(10,15,20,25);
		
		List list1=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		
	}
}
