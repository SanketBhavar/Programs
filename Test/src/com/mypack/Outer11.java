package com.mypack;

public class Outer11 {
	public static void main(String[] args) {
		Thread t = new Thread()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
/* 
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
*/