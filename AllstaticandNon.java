package automationtesting;

public class AllstaticandNon {
	static void add()//static
	{
		int a=12;
		int b=23;
		int c=-1;
		int sum=a+b+c;
		if(sum>1000)
		{
			System.out.println("static if loop");
		}
		else
		{
			System.out.println("else loop");
		}
	}
	static void addp(int a,char b)//static parameterized
	{
		System.out.println("TESTING");
	}
	void addn()//nonstatic
	{
		int x=100;
		int y=200;
		int sum1=x+y;
		{
			System.out.println(sum1);
		}
	}
	void sub(int a, int b, int c)//nontatic parameterized
	{
		int sub=a-b-c;
		System.out.println(sub);
	}
	void mul(int a, float b, double c)
	{
		double mul=a*b*c;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		
		add();
		addp(200, 'P');
		 AllstaticandNon s1=new  AllstaticandNon();
		 s1.addn();
		 AllstaticandNon s2=new  AllstaticandNon ();
		 s2.sub(100, 50, 25);
		 AllstaticandNon m1=new AllstaticandNon();
		 m1.mul(10, 12.223f, 278.1234);
	}

}
