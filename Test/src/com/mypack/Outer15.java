package com.mypack;

public class Outer15 {
	static class Nested {
		public static void main(String[] args) {
			System.out.println("Nested Class Main Method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer class Main Method");
	}
}
/*
Outer15$Nested-
Nested Class Main Method

Outer15-
Outer class Main Metho
 */