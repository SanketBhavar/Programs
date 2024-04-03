package com.mypack;

class A {
	public synchronized void d1(B b) {
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
	public void last()
	{
		System.out.println("inside A, this is last() method");
	}
}

class B {
	public synchronized void d2(A a) {
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
	public void last()
	{
		System.out.println("inside B, this is last() method");
	}
}

public class ThreadDemo16 implements Runnable {
	
	public static void main(String[] args) {
		
	}
}
