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
}
