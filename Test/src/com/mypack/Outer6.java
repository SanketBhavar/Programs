package com.mypack;

public class Outer6 {
	public void methodOne() {
		class Inner6 {
			public void sum(int x, int y) {
				System.out.println("The sum: "+(x+y));
			}
		}
	}
}
