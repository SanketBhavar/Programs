package com.mypack;

public class Outer13 {
	public static void main(String[] args) {
		new Thread(
				new Runnable()		//Anonymous Inner Class that define inside Method Arguments.
				{
					public void run()
					{
						for(int i=0;i<10;i++)
						{
							System.out.println("Child Thread");
						}
					}
				}).start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
/*
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
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
*/