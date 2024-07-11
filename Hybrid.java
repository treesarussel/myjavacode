package automationtesting;
class One
{
	void Pen()
	{
		System.out.println("grand parent class");
		System.out.println("This is my pen");
	}
}
class Two extends One
{
	void pencil()
	{
		System.out.println("parent class");
		System.out.println("this is my pencil");
	}
}
class Three extends Two
{
	void Box()
	{
		System.out.println("child class");
		System.out.println("this is my box");
	}
	
}
public class Hybrid extends One {
	void colorpencil()
	{
		System.out.println("Another superclass");
		System.out.println("this is my color pencil");
	}

	public static void main(String[] args)
	{
		Three t1=new Three();
		t1.Box();
		t1.Pen();
		t1.pencil();
		Hybrid h1=new Hybrid();
		h1.colorpencil();
		
	}
}
