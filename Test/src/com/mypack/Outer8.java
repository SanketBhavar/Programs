package com.mypack;

public class Outer8 {
	int x=10;
	public void methodOne() {
		int y=20;
		class Inner8 {
			public void methodTwo() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner8 i = new Inner8();
		i.methodTwo();
	}
	public static void main(String[] args) {
		new Outer8().methodOne();
	}
}
