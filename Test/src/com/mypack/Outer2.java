package com.mypack;

public class Outer2 {
	class Inner2 {
		public void methodOne() {
			System.out.println("Inner Class Method");
		}
	}
	public void methodTwo() {
		Inner2 i = new Inner2();
		i.methodOne();
	}
}
