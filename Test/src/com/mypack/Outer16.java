package com.mypack;

public class Outer16 {
	int x=10;
	static int y=20;
	static class Nested {
		public void methodOne()
		{
			//System.out.println(x); //Cannot make a static reference to the non-static field x
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		Outer16.Nested n = new Outer16.Nested();
		n.methodOne();
	}
}
/*
20
*/