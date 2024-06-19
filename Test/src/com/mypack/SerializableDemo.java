package com.mypack;

import java.io.*;

class Dog implements Serializable
{
	int i=10;
	int j=20;
}

public class SerializableDemo {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization Ended");
		
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println("Deserialization Ended");
		System.out.println(d2.i+".........."+d2.j);
	}
}
/*
Serialization Started
Serialization Ended
Deserialization Started
Deserialization Ended
10..........20
*/