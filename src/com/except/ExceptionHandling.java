package com.except;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
       System.out.println("ExceptionHandling");
       ExceptionHandling ref = new ExceptionHandling();
       ref.firstmethod();
	}
	
	public void firstmethod() 
	{
		try
		{
		 System.out.println(50/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception in firstmethod");
		}
		secondmethod();		
	}
	
	public void secondmethod() 
	{
		System.out.println("Second ExceptionHandling");
		thirdmethod();
	}
	
	public void thirdmethod() 
	{
		System.out.println("Third ExceptionHandling");
	}
	
	
}
