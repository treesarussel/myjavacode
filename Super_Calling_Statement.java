package automationtesting;
class State_class
{
	State_class()//non parameterized
	{
		System.out.println("State class constructor");
	}
}

public class Super_Calling_Statement extends State_class
{
	Super_Calling_Statement()
	{
		super();//implicitly or explicitly
		System.out.println("Super_Calling_Statement constructor");
	}
public static void main(String[] args) 
{
	System.out.println("main method");
	new Super_Calling_Statement();
}
}

