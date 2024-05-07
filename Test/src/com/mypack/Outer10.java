package com.mypack;

class PopCorn1 {
	public void taste() 
	{
		System.out.println("Spicy");
	}
}

public class Outer10 {
	public static void main(String[] args) {
		PopCorn1 p = new PopCorn1()
		{
			public void taste()
			{
				methodOne();
				System.out.println("Salty");
			}
			public void methodOne()
			{
				System.out.println("Child Specific method");
			}
		};
		p.taste();
		PopCorn1 p1 = new PopCorn1();
		p1.taste();
	}
}
/*
Child Specific method
Salty
Spicy
*/