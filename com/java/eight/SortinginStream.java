package com.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortinginStream {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//myList.stream().sorted().forEach(System.out::println);
		
		
		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
