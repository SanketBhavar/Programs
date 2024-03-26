package com.mypack;

class MyThread10 extends Thread {
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

public class ThreadDemo10 {
	public static void main(String[] args) {
		MyThread10 t = new MyThread10();
		t.start();
		t.interrupt();
		//interrupt()- We can interrupt a sleeping or waiting Thread by using interrupt() method of Thread class.
		System.out.println("End of main thread");
	}
}

/*
End of main thread
I am Lazy Thread
I got Interrupted..!
*/
