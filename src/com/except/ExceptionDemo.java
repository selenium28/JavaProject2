package com.except;

public class ExceptionDemo 
{

	public static void main(String[] args)
	{

     int x=0;
     int y=10;
     try 
     {  
    	 System.out.println(y/x); 
     }
     catch(Exception e)
     {  
    	 System.out.println("Exception Handling....");
    	 e.printStackTrace();
    	 System.out.println(e.toString());
    	 System.out.println(e.getMessage());
     }
     System.out.println("Exception Handling....");
	}

}


//    {  }