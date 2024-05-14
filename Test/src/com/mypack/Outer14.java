package com.mypack;

public class Outer14 {
	static class Nested {
		public void methodOne()
		{
			System.out.println("Nested Class Method.");
		}
	}
	public static void main(String[] args) {
		Outer14.Nested n = new Outer14.Nested();
		n.methodOne();
	}
}
