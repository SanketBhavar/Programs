package com.mypack;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("Statement1");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(10/2);   //--->Normal Termination
		}
		System.out.println("Statement2");
	}
}

/*
Statement1
5
Statement2 
 */