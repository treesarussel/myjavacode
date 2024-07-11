package automationtesting;

public class IfElseIfBlock {

	public static void main(String[] args) {
		// if else if test program
		int a=12;
		int b=45;
		int c=46;
		int d=45;
		if(a<b)//first condition is true
		{
			System.out.println("if will execute");
		}
		else if(a<=b)//this also true but first condition will true, other part is ignored by java
		{
			System.out.println("else if will execute");
		}
		else
		{
			System.out.println("else will execute");
		}
		if(a>b)//false
		{
			System.out.println("false 1");
		}
		else if(c<d)//false
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("first two condition will false, it execute else block ");
		}

	}

}
