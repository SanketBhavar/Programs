package com.mypack;

public class Outer7 {
	
	int x=10;
	static int y=20;
	public void methodOne()
	{
		class Inner7 {
			public void methodTwo()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
}
