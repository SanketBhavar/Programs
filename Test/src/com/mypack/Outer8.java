package com.mypack;

class Outer8 {
	int x=10;
	static int y=20;
	public void methodOne() {
		int k=30;
		final int l=40;
		class Inner8 {
			public void methodTwo() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(k);
				System.out.println(l);
			}
		}
		Inner8 i = new Inner8();
		i.methodTwo();
	}
	public static void main(String[] args) {
		new Outer8().methodOne();
	}
}
/* 
10
20
30
40 
 */