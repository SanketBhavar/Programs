package com.mypack;

class MyThread11 extends Thread {
	public void run()
	{
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("I am Lazy Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted..!");
		}
	}
}

public class ThreadDemo11 {
	public static void main(String[] args) {
		MyThread11 t = new MyThread11();
		t.start();
		t.interrupt();
		//interrupt()- We can interrupt a sleeping or waiting Thread by using interrupt() method of Thread class.
		System.out.println("End of main thread");
	}
}

