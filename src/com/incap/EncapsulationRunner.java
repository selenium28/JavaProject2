package com.incap;

public class EncapsulationRunner {

	public static void main(String[] args) {
		EncapsulationExample employee = new EncapsulationExample();
		employee.setSalary(3000f);
		System.out.println("Salary of employee is : " + employee.getSalary());
	}

}
