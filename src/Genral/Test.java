package Genral;


class Calculator
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
}


public class Test {
	
	public static void main(String[] args) {
	
		System.out.println("calling add method...");
		Calculator.add(10,10);
		System.out.println("done with add method");
		
		System.out.println("calling div method...");
		Calculator.div(10,0);
		System.out.println("done with div method");
		
		System.out.println("calling sub method...");
		Calculator.sub(10,10);
		System.out.println("done with sub method");	
	}	
}
