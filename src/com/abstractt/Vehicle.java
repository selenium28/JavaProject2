package com.abstractt;

public abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle{
		
	public void start() {
		System.out.println("Car starts with Key");
	}
}

class Bike extends Vehicle{
	public void start() {
		System.out.println("Bike starts with Kick");
	}
	
	public static void main(String[] args) {
//		Vehicle v = new Vehicle(); //Vehicle is abstract we can't create obj of abstract Class. Error: Cannot instantiate the type Vehicle
		Vehicle c = new Car();
		c.start();
		Bike b = new Bike();
		b.start();
		
	}
	
}