package com.interfacee;

public class InterfaceMain implements InterfaceClass
{

	@Override
	public void bank() 
	{
	  System.out.println("Bank");
		
	}

	@Override
	public void animal() 
	{
	  System.out.println("Animal");
		
	}
	public static void main(String[] args) 
	{
		InterfaceMain ref = new InterfaceMain();
		ref.bank();
		ref.animal();
	}

}
