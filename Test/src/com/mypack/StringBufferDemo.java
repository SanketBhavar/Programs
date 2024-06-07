package com.mypack;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =  new StringBuffer("Durga");
		System.out.println(sb.length());	//5
		System.out.println(sb.capacity());	//21
		System.out.println(sb.charAt(4));	//a
	}
}
