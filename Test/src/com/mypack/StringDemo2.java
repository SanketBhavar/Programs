package com.mypack;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "Durga";
		String s1 = "      Durga Software Solutions    ";
		
		System.out.println(s.charAt(3));	//g
		//System.out.println(s.charAt(10));	//java.lang.StringIndexOutOfBoundsException
		
		//'+' and '+=' are also meant for Concatenation purpose only.
		s=s.concat("Software");
		//s=s+"Software";
		//s+="Software";
		System.out.println(s); //DurgaSoftware
		
		System.out.println(s.equals("DurgaSoftware"));	//true
		System.out.println(s.equalsIgnoreCase("DURGASOFTWARE"));	//true
		
		System.out.println(s.substring(5));	//Software ----->Begin index
		System.out.println(s.substring(0, 5));	//Durga ---->Begin index to end-1
		
		System.out.println(s.length());	//13
		
		System.out.println(s.replace('a', 'h'));	//DurghSoftwhre
		
		System.out.println(s.toLowerCase());	//durgasoftware
		System.out.println(s.toUpperCase());	//DURGASOFTWARE
		
		System.out.println(s1.trim());	//Durga Software Solutions --->blank spaces present at beginning and end.
		
		System.out.println(s.indexOf('a'));		//4  --->index of 1st occurrence of specified character.
		System.out.println(s.lastIndexOf('a'));	//10 --->index of last occurrence of specified character.
		System.out.println(s.indexOf('z'));		//-1 --->if specified character is not available then return -1.
	}
}
