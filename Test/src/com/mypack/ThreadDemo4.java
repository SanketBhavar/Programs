package com.mypack;

class MyThread4 extends Thread {
	
}

public class ThreadDemo4 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); 
		MyThread4 t = new MyThread4();
		System.out.println(t.getName());
		Thread.currentThread().setName("Sanket Thread");   //setting name for thread
		System.out.println(Thread.currentThread().getName()); //get the name of thread
	}
}
