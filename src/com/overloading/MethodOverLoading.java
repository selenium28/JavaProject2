package com.overloading;

 public class MethodOverLoading 
 {

	public static void main(String[] args) 
	{
		System.out.println("First MethodOverLoading");
		MethodOverLoading ref = new MethodOverLoading();
		ref.method();
		ref.method1(500);
		ref.method2(100,"Dev");
		ref.methodadd(20, 50);
		
		TestA ref1 = new TestA();
		ref1.methodtest();
		
		TestB ref2 = new TestA();
		ref2.methodtest();
		
	}
	
	private void method()
	{
		System.out.println("Test Method");
	}
	
	public String method1(int x)
	{
		System.out.println("Test Method first " + x);
		return "Dev";
	}
	
	protected void method2(int x,String name)
	{
		System.out.println("Test Method second "+ x+ " "+name);
	}
	
	public void methodadd(int a,int b)
	{
		int c = a + b;
		System.out.println("Addton = "+c);
	}

}
