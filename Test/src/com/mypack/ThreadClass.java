package com.mypack;

class ThreadDemoClass extends Thread{
	public void run() {
		
		System.out.println("Run method executed by Thread: "+Thread.currentThread().getName());
	}
}
class ThreadClass {
	public static void main(String[] args) {
		ThreadDemoClass td = new ThreadDemoClass();
		td.start();
		System.out.println("Main method executed by Thread: "+Thread.currentThread().getName());
	}
}
