package automationtesting;

public class Addition {
	static void add() {
		int no1= 30;
		int no2=40;
		int sum=no1+no2;
		System.out.println("The sum is: " + sum);
	}
	
	static void sub()
	{
		int no1=45;
		double no2=34.5;
		double sub=no1-no2;
		
			System.out.println("The difference is: "+ sub);	
				
	}
static void mul() 

{
	int no1=23;
	float no2=5.567f;
	float multiply=no1*no2;
	System.out.println("Multiplication: "+multiply);
}
static void mod()
{
	int a=18;
	int b= 2;
	int mod=a/b;
	System.out.println("Modulus: "+mod);
}
static void div()
{
	int no1=66;
	int no2=4;
	int divide=no1%no2;
	System.out.println("Division: "+divide);
}
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		mod();
		div();
	}

}
