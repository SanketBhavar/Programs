package com.mypack;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Durga").insert(5, "Software").delete(9, 13).reverse().append("Solutions").reverse();
		System.out.println(sb);		//snoituloSDurgaSoft
	}
}
