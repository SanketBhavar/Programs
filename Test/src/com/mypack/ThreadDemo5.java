package com.mypack;

class MyThread5 extends Thread {
	
}

public class ThreadDemo5 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority()); //5
		Thread.currentThread().setPriority(9);
		MyThread5 t = new MyThread5();
		System.out.println(t.getPriority()); //9
	}
}
