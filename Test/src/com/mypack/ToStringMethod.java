package com.mypack;

public class ToStringMethod {
	String name;
	int rollno;
	
	ToStringMethod(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public String toString() {
		return "Student Name:"+name +"and Roll No.:"+rollno;
	}
	
	public static void main(String[] args) {
		ToStringMethod t1 = new ToStringMethod("Sanket", 101);
		ToStringMethod t2 = new ToStringMethod("Rahul", 102);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);
	}
}
/*
com.mypack.ToStringMethod@515f550a
com.mypack.ToStringMethod@515f550a
com.mypack.ToStringMethod@cac736f
*/