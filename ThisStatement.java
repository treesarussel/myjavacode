package automationtesting;
public class ThisStatement {
	ThisStatement(int age)
	{
		System.out.println(age);
	}
	ThisStatement(double weight)
	{
		System.out.println(weight);
	}
	ThisStatement(String name)
	{
		this(13.4);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		new ThisStatement("ram");
		new ThisStatement("44.45");
		new ThisStatement(21);
	}
}
