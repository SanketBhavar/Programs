package com.mypack;

public class Outer7 {
	//Declaring Inner class inside instance method then we can access both static and non static members of outer class directly.
	int x=10;
	static int y=20;
	public void methodOne()
	{
		class Inner7 {
			public void methodTwo()
			{
				System.out.println("Instance Variables: "+x);	//10
				System.out.println("Static Variables: "+y);	//20
			}
		}
		Inner7 i = new Inner7();
		i.methodTwo();
	}
	public static void main(String[] args) {
		new Outer7().methodOne();
	}
}

/*
 10
 20
*/