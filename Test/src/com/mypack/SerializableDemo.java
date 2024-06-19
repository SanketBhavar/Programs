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
	}
}
