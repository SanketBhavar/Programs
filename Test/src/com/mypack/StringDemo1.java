package com.mypack;

public class StringDemo1 {
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		String s = new String(ch);
		System.out.println(s);	//abc
		
		byte[] b = {100,101,102};
		String s1 = new String(b);
		System.out.println(s1);	//def
	}
}
