package com.mypack;

public class HashCodeMethod1 {
	int i;
	public HashCodeMethod1(int i) {
		this.i=i;
	}
	public int hashCode()	{
		return i;
	}
	public static void main(String[] args) {
		
		//In this case, Object class toString() method got executed which is internally calls HashCodeMethod1 class hashCode() method.
		
		HashCodeMethod1 h1 = new HashCodeMethod1(10); //a --->10 value in hexadecimal.
		HashCodeMethod1 h2 = new HashCodeMethod1(100); //64 --->100 value in hexadecimal.
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
/*
com.mypack.HashCodeMethod1@a
com.mypack.HashCodeMethod1@64
*/