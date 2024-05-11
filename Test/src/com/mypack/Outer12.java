package com.mypack;

public class Outer12 {
	public static void main(String[] args) {
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
	}
}
