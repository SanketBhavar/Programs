package com.mypack;

class Display {
	public void wish(String name)
	{
		;;;;;;;;;;;//1 Lakh lines of code.
		synchronized(this)
		{
			for(int i=0;i<10;i++)
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
		}
		;;;;;;;;;;;//1 Lakh lines of code.
	}
}

public class ThreadDemo12 {
	public static void main(String[] args) {
		
	}
}
