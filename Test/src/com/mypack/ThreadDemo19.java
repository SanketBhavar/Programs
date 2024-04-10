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
		t.setDaemon(true); //-----> line 22
		t.start();
		System.out.println("end of main thread");
	}
}

/*
 * If we are commenting line 22 then both main and child threads are non daemon and hence both will be executed until they completion.
 * 
 * If we are not commenting line 22 then both main thread is non daemon and child thread is daemon and hence whenever main thread terminates 
   automatically child thread will be terminated. 
*/
