package com.mypack;

public class HashCodeMethod {
	int i;
	HashCodeMethod(int i)
	{
		this.i=i;
	}
	public static void main(String[] args)
	{
		HashCodeMethod h = new HashCodeMethod(10);
		HashCodeMethod h1 = new HashCodeMethod(100);
		
	}
}
