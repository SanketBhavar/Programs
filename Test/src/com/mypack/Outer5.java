package com.mypack;

public class Outer5 {
	int x=10;
	class Inner5 {
		int x=100;
		public void methodOne() {
			int x=1000;
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		
	}
}
