package com.mypack;

public class Outer1 {
	class Inner1
	{
		public void methodOne() {
			System.out.println("**Inner Class Method**");
		}
	}
	public static void main(String[] args) {
//	***Ways of execution***
//	1st
//		Outer1 o = new Outer1();
//		Outer1.Inner1 i = o.new Inner1();
//		i.methodOne();
		
//	2nd
//		Outer1.Inner1 i = new Outer1().new Inner1();
//		i.methodOne();
		
//		3rd		
		new Outer1().new Inner1().methodOne();
	}
}

/*
**Inner Class Method**
*/