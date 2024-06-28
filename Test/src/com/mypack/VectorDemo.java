package com.mypack;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());	//10
		for(int i=10;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity()); //10
	}
}
