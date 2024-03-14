package com.mypack;

class MyThread2 extends Thread {
	public void start() {
		super.start();    
		System.out.println("start() method");	
	}
	public void run() {
		System.out.println("run() method");
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();  
		//in this case the entire output is produced by main thread. 
		//if we override the start method using super keyword, then child thread-run method also executed. 
		System.out.println("main() method");
	}
}

/*
Output: without using super keyword
start() method
main() method
*/

/*
Output: using super keyword
start() method
run() method
main() method
*/