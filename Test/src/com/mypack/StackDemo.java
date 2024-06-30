package com.mypack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);			//[A, B, C]
		System.out.println(s.pop()); 	//C
		System.out.println(s); 			//[A, B]
		System.out.println(s.peek()); 	//B - returns top of the stack element.
		System.out.println(s.search("A"));	//2 - return index of element.
		System.out.println(s.search("Z"));	//-1 -if element is not available in stack then returns -1.
		System.out.println(s.empty()); 		//returns true if stack is empty otherwise returns false.
	}
}
/*
[A, B, C]
C
[A, B]
B
2
-1
false
*/