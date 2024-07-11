package automationtesting;//Method overriding
class Random_class
{
	void login()
	{
		System.out.println("login with email id");
	}
}

public class Method_Override extends Random_class {
	void login()
	{
		super.login();
		System.out.println("login with mobile no");
	}
	
	public static void main(String args[])
	{
		Method_Override m1=new Method_Override();
		m1.login();	
	}

}
