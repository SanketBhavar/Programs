package com.mypack;

public class WrapperClassDemo {
	public static void main(String[] args) throws Exception
	{
		Integer i = Integer.valueOf("10");
		Double d = Double.valueOf("10.5");
		Boolean b = Boolean.valueOf("Durga");
		System.out.println(i);	//10
		System.out.println(d);	//10.5
		System.out.println(b);	//false
		
		//valueOf() method: To create wrapper object for given primitive or String .
	}
}
