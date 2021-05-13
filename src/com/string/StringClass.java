package com.string;

public class StringClass 
{

	public static void main(String[] args)
	{
		 String str = "I live in india";
	     
		    String a[] = str.split(" ");
		     
		     for(int i=0;i<a.length;i++)
		     {
		    	 System.out.println(a[i] + " ");
		     }
		     System.out.println(" ");
		     for(int i=a.length-1;i>=0;i--)
		     {
		    	 System.out.println(a[i] + " ");
		     }

	}

}
