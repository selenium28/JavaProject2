package com.except;

public class FinallyDemo 
{

	public static void main(String[] args) 
	{
		try{
			int x=0;
			int y=10;
			System.out.println("try block");
			
			System.out.println(y/x);
			
			}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
			finally
			 {
		    	System.out.println("finally block");
		    }
		
			System.out.println("code after try catch block");
		}
 

	}


