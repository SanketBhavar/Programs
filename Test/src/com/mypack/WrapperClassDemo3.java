package com.mypack;

public class WrapperClassDemo3 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf("10");
		System.out.println(i); 	//10
		
		String s1 = Integer.toString(10);
		String s2 = Boolean.toString(true);
		String s3 = Character.toString('a');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
