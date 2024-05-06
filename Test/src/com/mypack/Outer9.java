package com.mypack;

class PopCorn {
	public void taste()
	{
		System.out.println("Salty");
	}
}

public class Outer9 {
	public static void main(String[] args) {
		PopCorn p = new PopCorn()
		{
			public void taste()
			{
				System.out.println("Spicy");
			}
		};
		p.taste();	//Spicy
		PopCorn p1 = new PopCorn();
		p1.taste();	//Salty
	}
}
