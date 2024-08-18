package assignments;
//Write a program for SIB and IIB 
public class SIB_IIB_Program {
static
{
	System.out.println("static intialization block");
}
{
	System.out.println("iib");
}

	public static void main(String[] args) {
		new SIB_IIB_Program();
System.out.println("main method");

	
	}
}
