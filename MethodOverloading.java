package automationtesting;

public class MethodOverloading {
	static void add(int a, int b)
	{
		int add=a+b;
		System.out.println(add);
	}
    static void add(int a)
    {
    	int add=a+1;
    	System.out.println(add);
    }
    static void add(double a)
    {
    	double add=a+2;
    	System.out.println(add);
    }
    static void add(char a)
    {
    	System.out.println(a);
    }
    static void add(boolean a)
    {
    	System.out.println(a);
    }
    static void add(int a, int b, int c, int d, int e)
{
	int sum=a+b+c+d+e;
	System.out.println(sum);
}
    static void add(int a, double b, String x)
    {
    	System.out.println(a+""+b+""+x);
    }
    void add(int a, int b, int c)
    {
    	int sum=a+b+c;
    	System.out.println(sum);
    	
    }
	public static void main(String[] args) {
		add(10, 20);
		add(3);
		add(3.4458);
		add('D');
		add(false);
		add(40, 6000, 3456, 0, 0);
		add(2, 89.6789, "treesa");
		MethodOverloading s1=new MethodOverloading ();
		s1.add(12, 23, 10);
	}

	
	
}
