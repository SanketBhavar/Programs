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
		HashCodeMethod1 h1 = new HashCodeMethod1(10);
		HashCodeMethod1 h2 = new HashCodeMethod1(100);
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
/*
com.mypack.HashCodeMethod1@a
com.mypack.HashCodeMethod1@64
*/