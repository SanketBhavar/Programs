package com.mypack;

public class Outer5 {
	int x=10;
	class Inner5 {
		int x=100;
		public void methodOne() {
			int x=1000;
			System.out.println(x);				//Instance variable of methodOne. i.e. 1000
			System.out.println(this.x);			//current class local variable. i.e.100
			System.out.println(Outer5.this.x);	//Outer class local variable. i.e. 10
		}
	}
	public static void main(String[] args) {
		new Outer5().new Inner5().methodOne();
	}
}
/*
1000
100
10
*/