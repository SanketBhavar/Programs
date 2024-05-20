package com.mypack;

public class ToStringMethod1 {
	public String toString()
	{
		return "ToStringMethod1";
	}
	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		String s = new String("Sanket");
		ToStringMethod1 t = new ToStringMethod1();
		System.out.println(i);
		System.out.println(s);
		System.out.println(t);
	}
}
/*
10
Sanket
ToStringMethod1
*/