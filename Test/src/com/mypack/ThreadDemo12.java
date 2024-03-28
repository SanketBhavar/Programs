package com.mypack;

class Display {
	public void wish(String name)
	{
		;;;;;;;;;;;//1 Lakh lines of code.
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print("Good Morning: ");
				try
				{
					Thread.sleep(2000);					
				}
				catch(InterruptedException e)
				{
				}
				System.out.println(name);
			}
		}
		;;;;;;;;;;;//1 Lakh lines of code.
	}
}

class MyThread12 extends Thread {
	Display d;
	String name;
	MyThread12(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() 
	{
		d.wish(name);
	}
}

public class ThreadDemo12 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread12 t1 = new MyThread12(d, "Rohit");
		MyThread12 t2 = new MyThread12(d, "Virat");
		t1.start();
		t2.start();
	}
}
