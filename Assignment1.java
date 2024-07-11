package automationtesting;

public class Addition {
	static void add() {
		int no1= 30;
		int no2=40;
		int sum=no1+no2;
		System.out.println(sum);
	}
	
	static void sub()
	{
		int no1=45;
		double no2=34.5;
		double sum=no1-no2;
		
			System.out.println(sum);	
				
	}
static void mul() 

{
	int no1=23;
	float no2=5.567f;
	float sum=no1*no2;
	System.out.println(sum);
}
static void mod()
{
	int a=18;
	int b= 2;
	int sum=a/b;
	System.out.println(sum);
}
static void div()
{
	int no1=66;
	int no2=4;
	int sum=no1%no2;
	System.out.println(sum);
}
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		mod();
		div();
	}

}
