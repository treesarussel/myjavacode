package automationtesting;
class Testcase_1
{
	static void Parentclassmethod()
	{
		System.out.println("Chexk line");
	}
	static void Readline()
	{
		System.out.println("read line");
	}
}
class Testcase_2 extends  Testcase_1
{
	static void childone()
	{
		System.out.println("Child class 1")
		System.out.println("Check spelling");
	}
	static void Autocorrector()
	{
		System.out.println("Correct spelling");
	}
}
public class Hierarchial_Levwl_inheritance extends  Testcase_1 {
	static void childtwo()
	{
		System.out.println("child class 2");
	}
	public static void main(String[] args)
	{
		childone();
		
	}
}
