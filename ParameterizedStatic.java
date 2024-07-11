package automationtesting;//Write a program with parameterized static method using char and Boolean as parameters                
public class ParameterizedStatic {
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
    static void sub(int x, int y)
    {
    	System.out.println(x-y);
    }
    static void mul(int a1,double a2)
    {
    	double mul=a1*a2;
    	System.out.println(mul);
    }
    static void test(int a, boolean my_result)
    {
    	System.out.println("12");
    }
    static void test2(char a, String name)
    {
    	System.out.println("example");
    }
    static void test3(char a, boolean my_result)
    {
    	System.out.println("char and boolean as parameter");
    }
	public static void main(String[] args) {
		add(100,234);
		sub(12,10);
        mul(133,7.34567);
        test(122, false);
        test2('A', "treesa");
        test3('s',true);
	}

}
