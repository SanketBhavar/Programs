package com.mypack;

public class ThreadDemo15 {
	public static void main(String[] args) throws InterruptedException
	{
		ThreadA b = new ThreadA();
		b.start();
		synchronized(b) {
			System.out.println("main Thread calling wait() method");  //Step 1
			b.wait();
			System.out.println("main Thread got notification call");
			System.out.println(b.total);
		}
	}
}

class ThreadA extends Thread {
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts calculation");  //Step 2
			for(int i=0;i<=100;i++) 
			{
				total=total+i;
			}
			System.out.println("child thread giving notification call");  //Step 3
			this.notify();
		}
	}
}

/*
main Thread calling wait() method
child thread starts calculation
child thread giving notification call
main Thread got notification call
5050
 */
