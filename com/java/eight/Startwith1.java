package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startwith1 {

	public static void main(String[] args) {
		List< Integer> list=Arrays.asList(10,20,30);
		
		
		//list.stream().map(e->e+"").filter(e->e.startsWith("1")).collect(Collectors.toList());
		list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::print);
	}
}
