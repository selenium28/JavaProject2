package com.incap;

public class EncapsulationExample {
	private float salary;  // Member variable is inaccessible to outer world

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}
