package com.mypack;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "Durga";
		System.out.println(s.charAt(3));	//g
		//System.out.println(s.charAt(10));	//java.lang.StringIndexOutOfBoundsException
		
		//'+' and '+=' are also meant for Concatenation purpose only.
		s=s.concat("Software");
		System.out.println(s); //DurgaSoftware
		s=s+"Solutions";
		//s+="Solutions";
		System.out.println(s);
	}
}
