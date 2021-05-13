package com.classObjectMethod;

public class AnimalClass {         // Class

	public void eat() {            // method
		System.out.println("I am eating");
	}
	
	public static void main(String[] args) {
		System.out.println("MainMethod");
		AnimalClass doggy = new AnimalClass();        // new AnimalClass() is an object
		doggy.eat();
		doggy.run();			// we can create another object for run, but it occupy more memory

	}

	public void run() {			  // method
		System.out.println("I am Running");
	}
	
}
