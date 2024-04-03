package com.mypack;

class A {
	public void d1(B b) {
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
	public void d2(A a) {
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
	A a = new A();
	B b = new B();
	ThreadDemo16()
	{
		Thread t = new Thread(this);
		t.start();
		a.d1(b);  //main thread
	}
	public void run()
	{
		b.d2(a);  //child thread
	}
	public static void main(String[] args) {
		new ThreadDemo16();  //main thread
	}
}
