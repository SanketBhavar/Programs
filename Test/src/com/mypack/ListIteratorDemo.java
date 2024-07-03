package com.mypack;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l); 		//[balakrishna, venki, chiru, nag]
		ListIterator itr = l.listIterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("venki"))
			{
				itr.remove();			//[balakrishna, chiru, nag]
			}
			if(s.equals("chiru"))
			{
				itr.set("charan");		//[balakrishna, charan, nag]
			}
			if(s.equals("nag"))
			{
				itr.add("chaitu");		//[balakrishna, charan, nag, chaitu]
			}
		}
		System.out.println(l);		//[balakrishna, charan, nag, chaitu]
	}
}
/*
[balakrishna, venki, chiru, nag]
[balakrishna, charan, nag, chaitu]
*/