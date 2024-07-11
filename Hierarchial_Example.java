package automationtesting;
class A
{
	static void Animal()
	{
	 System.out.println("Animals are two type");
	 System.out.println("1, 2");
	}
}
class B extends  A
{
	static void WildAnimal()
	{
		System.out.println("lion");
		System.out.println("Bear");
	}
	
}

public class Hierarchial_Example extends A
{
 static void DomensticAnimal()
{
	System.out.println("cow");
	System.out.println("Hen");
}

public static void main(String[] args)
{
	DomensticAnimal();
	Animal();
	
}
}
