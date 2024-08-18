package assignments;
class Login{
	void login()
	{
		System.out.println("login with mail id");
	}
}

public class Super_Keyword extends Login{
	void login()
	{
		super.login();//used to get parent class implementation together with child class implementation.
		System.out.println("login with mob no");
	}
	
	
	public static void main(String[] args) {
		Super_Keyword sk=new Super_Keyword ();
		sk.login();

	}

}
