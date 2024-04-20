package com.mypack;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println(10/0);		//Abnormal Termination.
		System.out.println("Statement 2");
	}
}

/*
 Statement 1
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mypack.ExceptionDemo4.main(ExceptionDemo4.java:6)
 */