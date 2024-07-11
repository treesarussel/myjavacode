package automationtesting;
class Country_class
{
	Country_class(String a)
	{
		System.out.println("contry class constructor");
	}
}
class State_Class extends Country_class
{
	State_Class(int a)
	{
		super("manish");
		System.out.println("State class constructor");
	}
}
public class Super_calling_Para extends State_Class
{
	Super_calling_Para()
	
	{
		super(100);//implicitly or explicitly
		System.out.println("Super_Calling_Statement constructor");
	}
public static void main(String[] args) 
{

	new Super_Calling_Statement();
}
}

