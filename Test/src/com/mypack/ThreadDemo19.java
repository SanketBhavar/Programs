package com.mypack;

class MyThread19 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("lazy thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}

public class ThreadDemo19 {
	public static void main(String[] args) {
		MyThread19 t = new MyThread19();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main thread");
	}
}
