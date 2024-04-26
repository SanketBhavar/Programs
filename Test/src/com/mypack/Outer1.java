package com.mypack;

public class Outer1 {
	class Inner1
	{
		public void methodOne() {
			System.out.println("inner class method");
		}
	}
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 i = o.new Inner1();
		i.methodOne();
	}
}
