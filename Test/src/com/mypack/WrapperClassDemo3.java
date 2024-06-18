package com.mypack;

public class WrapperClassDemo3 {
	public static void main(String[] args) {
		
		//Form 1
		Integer i = Integer.valueOf("10");
		System.out.println(i); 		//10
		
		//Form2
		String s1 = Integer.toString(10);
		String s2 = Boolean.toString(true);
		String s3 = Character.toString('a');
		System.out.println(s1);		//10
		System.out.println(s2);		//true
		System.out.println(s3);		//a
		
		//Form3
		String s4 = Integer.toString(7,2);
		String s5 = Integer.toString(11,16);
		System.out.println(s4);		//111
		System.out.println(s5);		//b
	}
}
