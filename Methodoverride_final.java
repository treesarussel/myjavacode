package automationtesting;//For methodoverride concept,make parent method as final,check override is possible or not? (as per class 18)
class Anyclass
{
	final void CreateAccountone()
	{
		System.out.println("create account with mail id");
	}
}
public class Methodoverride_final extends Anyclass{
void CreateAccountone()
{
	super.CreateAccountone();
	System.out.println("create account with mob no");
}
public static void main (String[] args)
{
	Methodoverride_final f1=new Methodoverride_final();
	f1.CreateAccountone();
}
}
