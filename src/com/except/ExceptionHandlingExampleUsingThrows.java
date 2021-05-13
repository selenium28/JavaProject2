package com.except;

import java.io.IOException;

public class ExceptionHandlingExampleUsingThrows {
	
	public static void display() throws IOException { 
		throw new IOException("exception occured");
	}

	public static void main(String[] args) throws IOException 
	{
		ExceptionHandlingExampleUsingThrows ex = new ExceptionHandlingExampleUsingThrows();
		ex.display();
	}

}
