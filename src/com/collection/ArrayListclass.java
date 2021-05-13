package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListclass
{

	public static void main(String[] args) 
	{
		int num[] = new int[6];
		num[0] = 14;
		num[1] = 141;
		num[2] = 1415;
		num[3] = 14151;
		num[4] = 141514;
		num[5] = 1415141;
		System.out.println(num[4]);
		
		ArrayList<String> no = new ArrayList<>();
		no.add("Jagga");
		no.add("Dev");
		no.add("Vikas");
		no.add("Dev");
		no.add("Maharaj");
		
//		System.out.println(no.size());

//		no.remove("Vikas");
//		System.out.println(no.get(2));
//		
	    for (int i = 0; i < no.size(); i++) 
	    {
	    	System.out.println(i);
	    	String str = no.get(i);
	    	System.out.println(str);
			
		}
		
	}

}

 
