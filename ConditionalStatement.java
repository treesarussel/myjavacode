package automationtesting;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=4;
		if(a<b)
		{
			System.out.println("a is lessthan b, true statement");
		}
		if(b<a)
		{
			System.out.println("it is a false statement, false statement not executed in if");
		}
		if(c<a)
		{
			System.out.println("c is lessthan a, only true statement is executed in if");
		}

	}

}
