package com.mypack;

class A1 {
	public void d1(B1 b) {
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

class B1 {
	public void d2(A1 a) {
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

public class ThreadDemo17 implements Runnable {
	A1 a = new A1();
	B1 b = new B1();
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
		ThreadDemo17 td = new ThreadDemo17();  //main thread
		td.m1();
	}
}

//Synchronized keyword is the cause for deadlock hence whenever we are using synchronized keyword we have to take special care.
//In above program, we have not using synchronized keyword so that deadloack is not occur in this program.
//but In this program, output is not in sync.
