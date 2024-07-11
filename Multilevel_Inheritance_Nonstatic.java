package automationtesting;
class GrandParent
{
	void cash()
	{
		System.out.println("Grandfather have cash");
	}
}
class Parent extends GrandParent
{
	void home()
	{
		System.out.println("Parent have home");
	}
}

public class Multilevel_Inheritance_Nonstatic extends  Parent {
void book()
{
System.out.println("i have book");
}
	public static void main(String[] args)
	{
		Multilevel_Inheritance_Nonstatic s1=new Multilevel_Inheritance_Nonstatic();
				s1.cash();
				s1.home();
		s1.book();
}
}
