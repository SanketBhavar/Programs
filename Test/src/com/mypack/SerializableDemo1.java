package com.mypack;

import java.io.*;
/*
Serialization interface present in java.io.package and does not contain any methods. It is marker interface.
We can add any no. of Objects to the file and we can read all those objects.
*/
class Dog1 implements Serializable
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
		Dog1 d1 = new Dog1();
		Cat c1 = new Cat();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		System.out.println("Serialization Ended");
		
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1)ois.readObject();
		Cat c2 = (Cat)ois.readObject();
		System.out.println("Deserialization Ended");
		System.out.println(d2.i+".........."+d2.j);
		System.out.println(c2.i+".........."+c2.j);
	}
}
/*
Serialization Started
Serialization Ended
Deserialization Started
Deserialization Ended
10..........20
30..........40
*/