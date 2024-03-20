package com.mypack;

class MyThread6 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo6 {
	public static void main(String[] args) {
		MyThread6 t = new MyThread6();
		//t.setPriority(10);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}
