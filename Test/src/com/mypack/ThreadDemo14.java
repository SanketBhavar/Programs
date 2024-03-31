package com.mypack;

public class ThreadDemo14 {
	public static void main(String[] args) 
	{
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			System.out.println("main Thread calling wait() method");
			System.out.println("main Thread got notification call");
			System.out.println(b.total);
		}
	}
}

class ThreadB extends Thread {
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts calculation");
			for(int i=0;i<=100;i++) 
			{
				total=total+i;
			}
			System.out.println("child thread giving notification call");
		}
	}
}

/* Without wait(), notify() method.
main Thread calling wait() method
main Thread got notification call
0
child thread starts calculation
child thread giving notification call
 */