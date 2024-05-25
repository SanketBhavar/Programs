package com.mypack;

public class Student {
	String name;
	int rollno;
	Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		
		//If our class doesn't contain .equals() method then object class .equals() method will be executed. 
		//which is always meant for reference comparison[Address comparison].
		
		Student s1 = new Student("Sanket",101);
		Student s2 = new Student("Rahul",102);
		Student s3 = new Student("Sanket",101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
/*
false
false
true
*/