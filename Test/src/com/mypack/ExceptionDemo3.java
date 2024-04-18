package com.mypack;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();	
	}
	public static void doMoreStuff() {
		System.out.println("Hello");
	}
}

/*
 Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mypack.ExceptionDemo2.doStuff(ExceptionDemo2.java:9)
	at com.mypack.ExceptionDemo2.main(ExceptionDemo2.java:5)
 */