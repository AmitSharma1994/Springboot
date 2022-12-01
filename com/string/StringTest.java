package com.string;

public class StringTest {

	public static void main(String[] args) {
		
		String s2=new String("ABCD");
		String s3=new String("ABCD");
		
		  System.out.println(s2==s3); //false
		  
		  System.out.println(s2.equals(s3));// true
		  
		  System.out.println(s3.compareTo(s2)); //0
		  
		  
		  System.out.println(s2.hashCode()); 
		  
		  System.out.println(s3.hashCode());
		  
		  //both will return  the  same hashcode value because it is equals to accourding to equals methods. 
		 
		String s="ABC";
		String s1="ABC";
		
		System.out.println(s==s1);
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s3.compareTo(s2));
		
		
		  System.out.println(s.hashCode());
		  
		  System.out.println(s1.hashCode());
		 	
	}
}
