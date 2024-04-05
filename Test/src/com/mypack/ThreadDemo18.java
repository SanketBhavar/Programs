package com.mypack;

class A2 {
	public synchronized void d1(B2 b) {
		System.out.println("Thread1 starts execution of d1() method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{ }
		System.out.println("Thread1 trying to call b.last()");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("inside A2, this is last() method");
	}
}

class B2 {
	public synchronized void d2(A2 a) {
		System.out.println("Thread2 starts execution of d2() method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{ }
		System.out.println("Thread2 trying to call A.last()");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("inside B2, this is last() method");
	}
}

public class ThreadDemo18 implements Runnable {
	A2 a = new A2();
	B2 b = new B2();
	public void m1() 
	{
		Thread t = new Thread(this);
		t.start();
		a.d1(b); 	//this line expected by main thread.
	}
	public void run()
	{
		b.d2(a);  //this line expected by child thread.
	}
	public static void main(String[] args) {
		ThreadDemo18 td = new ThreadDemo18();  //main thread
		td.m1();
	}
}

//Synchronized keyword is the cause for deadlock hence whenever we are using synchronized keyword we have to take special care.
//In above program, we have using synchronized keyword for 4 methods so that deadloack is occur in this program.
//but In this program, Program is in execution state and both threads are waiting for execution of each others methods and 
//it never terminated, this is nothing but DEADLOCK.

/*
Thread1 starts execution of d1() method
Thread2 starts execution of d2() method
Thread1 trying to call b.last()
Thread2 trying to call A.last()
*/