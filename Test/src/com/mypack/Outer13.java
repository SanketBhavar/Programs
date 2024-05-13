package com.mypack;

public class Outer13 {
	public static void main(String[] args) {
		new Thread(
				new Runnable()
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
