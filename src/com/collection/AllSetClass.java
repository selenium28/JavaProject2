package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class AllSetClass 
{

	public static void main(String[] args)
	{
		Set<String> str = new HashSet<String>();
//		Set<String> str = new LinkedHashSet<String>();
//		Set<String> str = new TreeSet<String>();
		
		 str.add("Dhanu");
		 str.add("Vikas");
		 str.add("Dev");
		 str.add("Vikas");
		 str.add("Dhanu");
		 
		 for (String obj : str) 
		 {
			 System.out.println("Set-------" +obj);
		 }

	}

}
