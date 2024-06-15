package com.mypack;

public class WrapperClassDemo1 {
	public static void main(String[] args) {
		Integer i = new Integer(130);
		System.out.println(i.byteValue());	//-126
		System.out.println(i.shortValue());	//130
		System.out.println(i.intValue());	//130
		System.out.println(i.longValue());	//130
		
	}
}
