package com.mypack;

class Display1 {
	public void wish(String name)
	{
		;;;;;;;;;;;//1 Lakh lines of code.
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
		;;;;;;;;;;;//1 Lakh lines of code.
	}
}

class MyThread13 extends Thread {
	Display1 d;
	String name;
	MyThread13(Display1 d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run() 
	{
		d.wish(name);
	}
}

public class ThreadDemo13 {
	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread13 t1 = new MyThread13(d, "Rohit");
		MyThread13 t2 = new MyThread13(d, "Virat");
		t1.start();
		t2.start();
	}
}

/* Without Synchronized method
 * 
Good Morning: Good Morning: Rohit
Good Morning: Virat
Good Morning: Rohit
Good Morning: Virat
Good Morning: Rohit
Good Morning: Virat
Good Morning: Virat
Good Morning: Rohit
Good Morning: Virat
Rohit
 */
