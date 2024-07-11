package automationtesting;
class Alphabet_Auth1
{
	static void auth()
	{
		System.out.println("1");
	}
}
class Amz_Google_Auth extends  Alphabet_Auth1
{
	static void auth2()
	{
		System.out.println("2");
	}
}

public class Amazon_Website extends Amz_Google_Auth
{
	static void auth3()
	{
		System.out.println("3");
	}


	public static void main(String[] args) {
		auth();
		auth2();
		auth3();
		
		

	}
	}

