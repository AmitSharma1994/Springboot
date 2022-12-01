package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Mostrepationg {

	public static void main(String[] args) {

		String str = "WIPRO TECHNOLOGIES";

		char[] ch = str.toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++) {
			int counter=1;
			 for(int j=i;j<ch.length;j++) {
				 if(ch[i]==ch[j]) {
					 counter++;
					}	 
			 }
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		//HashMap<Character, Integer> hm = new HashMap<>();

		/*
		 * for (int i = 0; i < ch.length; i++) { int counter = 1; if
		 * (hm.containsKey(ch[i])) { hm.put(ch[i], ++counter);
		 * 
		 * }
		 * 
		 * else { hm.put(ch[i], counter); }
		 * 
		 * }
		 * 
		 * 
		 * for(Map.Entry<Character, Integer> hm1:hm.entrySet()) {
		 * 
		 * if(hm1.getValue()>1) { System.out.println(hm1.getKey()+"\t"+hm1.getValue());
		 * }
		 * 
		 * 
		 * 
		 * }
		 */

	}

}
