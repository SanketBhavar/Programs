package com.mypack;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			if(i%2==0)
				System.out.println(i);		//printing even numbers from vector.
		}
		System.out.println(v);		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
}
/*
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
0
2
4
6
8
10
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] 
 */