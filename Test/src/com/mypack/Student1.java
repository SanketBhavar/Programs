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
			Student s2=(Student)obj;
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
		
		}
	}
}
