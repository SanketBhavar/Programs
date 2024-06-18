package com.mypack;

public class WrapperClassDemo2 {
	public static void main(String[] args) {
		int i = Integer.parseInt("10");
		boolean b = Boolean.parseBoolean("Durga");
		double d = Double.parseDouble("10.5");
		System.out.println(i);	//10
		System.out.println(b);	//false
		System.out.println(d);	//10.5
		
		//parseXxx() - To convert String to corresponding primitive.
	}
}
