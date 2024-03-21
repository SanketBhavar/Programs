package com.mypack;

class MyThread7 extends Thread {
	public void run() {
		for (int i=0;i<10;i++) {
			Thread.yield();			
			//yield() method- To pause current executing thread for giving chance of remaining waiting threads of same priority.
			System.out.println("Child Thread");			
		}
	}
}

public class ThreadDemo7 {
	public static void main(String[] args) {
		MyThread7 t=new MyThread7();
		t.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}
}
