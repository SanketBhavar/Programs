package com.mypack;

public class ThreadDemo9 {
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("M");
		Thread.sleep(3000);
		System.out.println("E");
		Thread.sleep(3000);
		System.out.println("G");
		Thread.sleep(3000);
		System.out.println("A");
		Thread.sleep(3000);
	}
}
