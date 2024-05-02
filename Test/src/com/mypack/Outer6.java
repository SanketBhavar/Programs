package com.mypack;

public class Outer6 {
	public void methodOne() {
		class Inner6 {
			public void sum(int x, int y) {
				System.out.println("The sum: "+(x+y));
			}
		}
		Inner6 i = new Inner6();
		i.sum(10,20);
		i.sum(100,200);
		i.sum(1000,2000);
	}
	public static void main(String[] args) {
		new Outer6().methodOne();
	}
}
/*
The sum: 30
The sum: 300
The sum: 3000
 */