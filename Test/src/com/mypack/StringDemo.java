package com.mypack;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("You cannot change me!");
		String s2 = new String("You cannot change me!");
		System.out.println(s1==s2);	//false
		String s3 = "You cannot change me!";
		System.out.println(s1==s3);	//false
		String s4 = "You cannot change me!";
		System.out.println(s3==s4);	//true
		String s5 = "You cannot "+"change me!";
		System.out.println(s3==s5);	//true
	}
}
