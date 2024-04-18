package com.mypack;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		doStuff();
		System.out.println(10/0);  //----->Exception handled by JVM and program terminates abnormally
	}
	public static void doStuff() {
		doMoreStuff();
		System.out.println("Hi..!!");
	}
	public static void doMoreStuff() {
		System.out.println("Hello..!!");
	}
}

/*
Hello
Hi.!!
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mypack.ExceptionDemo3.main(ExceptionDemo3.java:6)
*/