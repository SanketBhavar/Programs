package com.mypack;

public class Outer12 {
	public static void main(String[] args) {
		Runnable r = new Runnable()	//Here we are not creating for Runnable interface, we are creating implements class object.
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
