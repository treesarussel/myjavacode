package automationtesting;//Single level inheritance
class Father
{
	static void house()
	{
		System.out.println("Father have car");
	}
	static void car()
	{
		System.out.println("father have car");
	}
}

public class SinglelevelInheritance extends Father {
	static void laptop()
	{
		System.out.println("Child have laptop");
	}
static void bike()
{
	System.out.println("Child have bike");
}
	public static void main(String[] args) {
		laptop();
		bike();
		house();
		car();
		

	}

}
