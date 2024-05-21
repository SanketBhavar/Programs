package com.mypack;

public class HashCodeMethod {
	int i;
	HashCodeMethod(int i)
	{
		this.i=i;
	}
	public static void main(String[] args)
	{
		// in this case, Object class toString() method got executed which is internally calls object class hashcode() method.
		
		HashCodeMethod h = new HashCodeMethod(10);
		HashCodeMethod h1 = new HashCodeMethod(100);
		System.out.println(h);
		System.out.println(h1);
	}
}
/*
com.mypack.HashCodeMethod@515f550a
com.mypack.HashCodeMethod@cac736f
*/