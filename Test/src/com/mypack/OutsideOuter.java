package com.mypack;

class Outer3 {
	class Inner3 {
		public void methodOne() {
			System.out.println("**Inner Class Method**");
		}
	}
}
//Accessing Inner class code from Outside of Outer class.
class OutsideOuter{
	public static void main(String[] args) {
		new Outer3().new Inner3().methodOne();
	}
}
/*
 **Inner Class Method**
*/