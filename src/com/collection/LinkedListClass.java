package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass 
{

	public static void main(String[] args) 
	{
      
	 ArrayList<String> ref = new ArrayList<String>();
	 ref.add("Saurab");
	 ref.add("Nikhil");
	 ref.add("Dev");
	 ref.add("Shilpa");
	 ref.add("Poonam");
	 
	 for (String obj2 : ref) 
	 {
		 System.out.println("ArrayList-------------- " +obj2 );
	 }
	 
	
	 LinkedList<String> str = new LinkedList<String>();      //linkedlist accept doublicate value.
	 str.add("Dev");
	 str.add("Vikas");
	 str.add("Dev");
	 str.add("Maharaj");
	 str.add("vikas");
	 
	 for (String obj : str) 
	 {
		 System.out.println("LinkedList:----------------" +obj);
	 }

	 
	}

}
