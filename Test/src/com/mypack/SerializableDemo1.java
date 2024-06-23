package com.mypack;

import java.io.*;

class Dog implements Serializable
{
	int i=10;
	int j=20;
}
class Cat implements Serializable
{
	int i=30;
	int j=40;
}

public class SerializableDemo1 {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		System.out.println("Serialization Ended");
		
	}
}
