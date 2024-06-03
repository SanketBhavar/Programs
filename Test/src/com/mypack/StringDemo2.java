package com.mypack;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "Durga";
		System.out.println(s.charAt(3));	//g
		//System.out.println(s.charAt(10));	//java.lang.StringIndexOutOfBoundsException
		
		s=s.concat("Software");
	}
}
