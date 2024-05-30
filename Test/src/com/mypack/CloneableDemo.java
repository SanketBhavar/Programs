package com.mypack;

public class CloneableDemo implements Cloneable
{
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneableDemo c1 = new CloneableDemo();
		CloneableDemo c2 = (CloneableDemo)c1.clone();
	}
}
