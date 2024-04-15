package com.mypack;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);  //----->Exception handled by JVM
	}
}

/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mypack.ExceptionDemo1.doMoreStuff(ExceptionDemo1.java:11)
	at com.mypack.ExceptionDemo1.doStuff(ExceptionDemo1.java:8)
	at com.mypack.ExceptionDemo1.main(ExceptionDemo1.java:5) 
 */