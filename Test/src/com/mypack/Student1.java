package com.mypack;

public class Student1 {
	String name;
	int rollno;
	Student1(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{
		try {
			String name1=this.name;
			int rollno1=this.rollno;
			Student1 s2=(Student1)obj;
			String name2=s2.name;
			int rollno2=s2.rollno;
			if(name1.equals(name2) && rollno1==rollno2)
			{
				return true;
			}
			else
				return false;
		}
		catch(ClassCastException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		//Based on Programming Requirement, we can override .equals() method for content comparison purpose.
		
		Student1 s1 = new Student1("Durga",101);
		Student1 s2 = new Student1("Ravi",102);
		Student1 s3 = new Student1("Durga",101);
		Student1 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));		//Handle Class Cast Exception.
		System.out.println(s1.equals(null));		//Handle Null Pointer Exception.
	}
}
/*
false
true
true
false
false
*/