package com.string;

public class ConcatString 
{

	public static void main(String[] args)
	{
		String s1 = "Dev";
		System.out.println(s1); //Dev
	    s1.concat("Dubale");   // output only print Dev but another string object is created.
	    System.out.println(s1); //Dev
		s1 = s1.concat(" Dubale"); // output print Dev Dubale but Dev object is not modified.
		System.out.println(s1); //Dev Dubale

	}

}
