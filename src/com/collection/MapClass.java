package com.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass
{

	public static void main(String[] args) 
	{
     
//	 Map<Integer, String> mapV = new HashMap<Integer, String>();
//	 Map<Integer, String> mapV = new LinkedHashMap<Integer, String>();
	 Map<Integer, String> mapV = new TreeMap<Integer, String>();
	 mapV.put(2, "Jagga");
	 
	 mapV.put(1, "Dhanu");
	 mapV.put(4, "Rohan");
	 mapV.put(3, "Balu");
	 
	 System.out.println("Before---"+mapV);
	 
	 mapV.put(3, "Deva");
	 
	 System.out.println("After---"+mapV);

	}

}
