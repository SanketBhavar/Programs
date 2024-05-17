package com.mypack;

public class Outer16 {
	int x=10;
	static int y=20;
	static class Nested {
		public void methodOne()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
}
