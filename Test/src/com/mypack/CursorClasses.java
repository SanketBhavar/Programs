package com.mypack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorClasses {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		System.out.println(e.getClass().getName()); 	//java.util.Vector$1
		System.out.println(itr.getClass().getName()); 	//java.util.Vector$Itr
		System.out.println(litr.getClass().getName()); 	//java.util.Vector$ListItr
	}
}
//Cursors inner class names Example.
/*
java.util.Vector$1
java.util.Vector$Itr
java.util.Vector$ListItr
*/