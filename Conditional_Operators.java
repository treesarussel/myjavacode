package automationtesting;

public class Conditional_Operators {
	static void greaterthan()
	{
	int a;
	a=134;
	int b=24;
	if(a>b)//conditional operator
	{
		System.out.println("a>b");
	}
	else
	{
		System.out.println("a is not greaterthan b");
	}
	}
	static void lessthan()
	{
		int a=200;
		int b=300;
		if(a<b) //conditional operator
		{
			System.out.println("a<b");
		}
		else {
			System.out.println("a is not greaterthan b");
		}
	}
	static void greaterthanorequalto()
	{
		int a=300; int b=300;int c=200;
		if(a>=b)//conditional operator
		{
			System.out.println("a>=b");
		}
		else {
			System.out.println("not");
		}
	}
	static void lessthan_or_equalto()
	{
		int a=9;int b=19;
		if(a<=b)//conditional operator
		{
			System.out.println("a<=b");
		}
		else
		{
			System.out.println("not");
		}
	}
	void not_equalto()
	{
		int a=12; int b=56;
		if(a!=b)//conditional operator
		{
			System.out.println("a!=b");
		}
		else {
			System.out.println("not");
		}
	}
	void equalto()
	{
		int a=10;int b=10;
		if(a==b)//conditional operator
		{
			System.out.println("a==b");
		}
		else{
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		System.out.println("This is my conditional operators in java");
		
		greaterthan();
		lessthan();
		greaterthanorequalto();
		lessthan_or_equalto();
		Conditional_Operators r1=new Conditional_Operators();
		r1.not_equalto();
		r1.equalto();
	}

}
