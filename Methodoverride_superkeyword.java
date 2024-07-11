package automationtesting;
class Random_class//Write a program for method overriding using super keyword (as per class 18)
{
	void login()
	{
		System.out.println("Login with mail id");
	}
}
public class Methodoverride_superkeyword extends Random_class
{
void login()
{
	super.login();
	System.out.println("login with mobile no");
}
public static void main (String[]args)
{
	Methodoverride_superkeyword m1= new Methodoverride_superkeyword();
	m1.login();
}
}
