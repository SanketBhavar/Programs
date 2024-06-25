package com.mypack;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Durga");
		l.add(30);
		l.add(null);
		l.add("Durga");
		System.out.println(l);	//[Durga, 30, null, Durga]
		l.set(0, "Software");
		System.out.println(l);	//[Software, 30, null, Durga]
		l.removeLast();
		System.out.println(l);	//[Software, 30, null]
		l.addFirst("Durga");
		System.out.println(l);	//[Durga, Software, 30, null]
	}
}
