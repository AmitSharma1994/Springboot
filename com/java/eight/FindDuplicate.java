package com.java.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
	  List list=Arrays.asList(1,3,4,4,3,5,6,8,7);
	  
	  Set set= new HashSet<>();
	  
	List list1=  (List) list.stream().filter(e->!set.add(e)).collect(Collectors.toList());
	
	System.out.println(list1);
	  
	  
	}
}
