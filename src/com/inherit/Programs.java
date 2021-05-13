package com.inherit;

public class Programs extends Employee
{
    int bonus = 1000;
	public static void main(String[] args)
	{
		Programs prg = new Programs();
		System.out.println("Salary=" +prg.salary);
		System.out.println("Bonus=" +prg.bonus);

	}

}
