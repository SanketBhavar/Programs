package com.mypack;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);	//[A, 10, A, null]
		a.remove(2);
		System.out.println(a);
	}
}
