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
		
		//Form4
		String s6 = Integer.toBinaryString(7);
		String s7 = Integer.toOctalString(10);
		String s8 = Integer.toHexString(20);
		System.out.println(s6);		//111
		System.out.println(s7);		//12
		System.out.println(s8);		//14
		
		//toString() method - To convert Wrapper object or primitive to String.
		}
}
