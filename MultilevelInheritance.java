package automationtesting;
class Alphabet_Auth
{
	static void auth1()
	{
		System.out.println("Grand parent property");
	}
}
class Amazon_Google_Auth extends Alphabet_Auth
	{
	static void auth2()
	{
		System.out.println("Parent property");
	}
	}
public class MultilevelInheritance extends Amazon_Google_Auth
{
	static void auth3()
	{
		System.out.println("Child property");
	}

	public static void main(String[] args) {
		auth1();
		auth2();
		auth3();
		
		

	}

}
