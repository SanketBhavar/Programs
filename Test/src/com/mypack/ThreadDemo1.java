package com.mypack;

class MyThread1 extends Thread {
	public void run()
	{
		System.out.println("No-arg method");
	}
	public void run(int i) {
		System.out.println("int arg method");
	}
}

public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
	}
}
