package com.java.eight;

import java.util.Arrays;
import java.util.List;

/*Q6 Given a list of integers, find the maximum value element present in it using Stream functions?*/


public class FindingMaximum {

	
	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,98,32,15);
	
	    long count=	list.stream().count();
	    
	    int maxvalue=list.stream().max(Integer::compare).get();
	
		System.out.println(count);
		System.out.println(maxvalue);
		
	}
}
