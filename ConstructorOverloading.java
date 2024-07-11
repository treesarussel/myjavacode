package automationtesting;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println("non parameterized constructor");
	}
	ConstructorOverloading(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	ConstructorOverloading(double b,int a)
	{
	   System.out.println("my third constructor");
		
	}
	ConstructorOverloading(char c,int a)
	{
		System.out.println("my 4 rth constructor");
	}
	ConstructorOverloading (char c, double b, int a)
	{
		System.out.println("my 5 th constructor");
	}

	public static void main(String[] args) {
		new ConstructorOverloading();
	    new ConstructorOverloading(23,34);
        new ConstructorOverloading(67.88,23);
        new ConstructorOverloading('y',29);
        new ConstructorOverloading ('r',55.67,20);
	}

}
