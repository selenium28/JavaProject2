package com.construtor;

public class TestClass {
	
	//Construtor
	TestClass(){
		System.out.println("I am in Construtor");
	
	}
	
	public static void main(String[] args) {
		TestClass obj = new TestClass();
		// new keyword create obj of TestClass & invoke in Construtor to initialize the created object.

	}

}
// If there is no constructor in a class, compiler automatically creates a default constructor.
// What is the purpose of a default constructor?
// The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.