package com.mypack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClasses {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		System.out.println(e.getClass().getName()); 	//java.util.Vector$1
	}
}
