package com.mypack;

public class CloneableDemo implements Cloneable
{
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneableDemo c1 = new CloneableDemo();
		CloneableDemo c2 = (CloneableDemo)c1.clone();	//Cloning object
		c2.i=888;
		c2.j=999;
		System.out.println(c1.i +"-----------"+c1.j);
		System.out.println(c2.i +"----------"+c2.j);
		
		Object o = new String("Durga");
		System.out.println(o.getClass().getName());	//getClass method- returns runtime class definition of an object.
	}
}
/*
10-----------20
888----------999
java.lang.String
*/