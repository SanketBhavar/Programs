package com.mypack;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =  new StringBuffer("Durga");
		System.out.println(sb.length());	//5
		System.out.println(sb.capacity());	//21
		System.out.println(sb.charAt(4));	//a
		
		sb.setCharAt(3, 'G');
		System.out.println(sb);	//DurGa
		sb.setCharAt(3, 'g');
		
		//All these methods are Overloaded methods.
		StringBuffer sb1 = new StringBuffer();
		sb1.append("PI Value is: ");
		sb1.append(3.14);
		sb1.append(". This is exactly ");
		sb1.append(true);
		System.out.println(sb1);	//PI Value is: 3.14. This is exactly true
		
		sb.insert(5, "Software");
		sb.insert(13, 10);
		System.out.println(sb);		//DurgaSoftware10
		
		sb.delete(13, 15);
		System.out.println(sb);		//DurgaSoftware   ------>delete characters from begin index to end n-1 index.
		
		System.out.println(sb.reverse());	//erawtfoSagruD
		sb.reverse();
		
		sb.setLength(5);
		System.out.println(sb);		//Durga		---->Consider only specified no. of characters and remove all the remaining characters.
		
	}
}