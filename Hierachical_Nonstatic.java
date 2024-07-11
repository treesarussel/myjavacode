package automationtesting;
class Nine
{
	void college()
	{
		System.out.println("parent class");
	}
}
class Ten extends Nine
{
	void school()
	{
		System.out.println("this is a child class one");
	}
}

public class Hierachical_Nonstatic extends Nine
{
void play()
{
	System.out.println("this is child class two");
}

public static void main(String[] args)
{
	
	System.out.println("Main method");
	 Hierachical_Nonstatic h1=new  Hierachical_Nonstatic();
	 h1.play();
	 h1.college();
	 Ten t1=new Ten();
	 t1.school();
	 t1.college();
}	
}