package com.mypack;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());	//10
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity()); //10
		v.addElement("A");
		//One Vector reaches its maximum capacity then a new vector object will be created with double capacity.
		//i.e "NewCapacity = CurrectCapacity*2"
		System.out.println(v.capacity()); //20
		System.out.println(v);	//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
	}
}
/*
10
10
20
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
*/