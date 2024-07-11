package automationtesting;

public class StaticMethod //Program to call multiple static method
{
	static void add() 
	{
	System.out.println("Addition");

	}
	static void sub()
	{
		int a= 19; 
		int b=10;
		System.out.println(a+b);
		
	}
	static void div()
	{
		System.out.println("Call multiple static method");
	}
public static void main(String[] args)
{
	add();
	sub();
	div();
	System.out.println("Main Method");
	
}
}