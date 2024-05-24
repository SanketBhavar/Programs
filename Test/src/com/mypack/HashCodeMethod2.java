package com.mypack;

public class HashCodeMethod2 {
	int i;
	public HashCodeMethod2(int i) {
		this.i=i;	
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
	public static void main(String[] args) {
		
		//For correct output we need to use both toString() and hashCode() Methods.
		HashCodeMethod2 h1 = new HashCodeMethod2(10);
		HashCodeMethod2 h2 = new HashCodeMethod2(100);
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
/*
10
100
*/