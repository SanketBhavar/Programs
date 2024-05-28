package com.mypack;

public class Student2 {
	String name;
	int rollno;
	Student2(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj)
	{
		try {
			Student2 s2 = (Student2)obj;
			
			if(name.equals(s2.name) && rollno==s2.rollno)
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
		
		Student2 s1 = new Student2("Durga",101);
		Student2 s2 = new Student2("Ravi",102);
		Student2 s3 = new Student2("Durga",101);
		Student2 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));		//Handle Class Cast Exception.
		System.out.println(s1.equals(null));		//Handle Null Pointer Exception.
	}
}
