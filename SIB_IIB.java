package assignments;
//Find out the order of execution in between SIB, IIB, Constructor and Main method
public class SIB_IIB {
static
{
	System.out.println("SIB");
}
{
System.out.println("IIB");
}
SIB_IIB()
{
	System.out.println("CONSTRUCTOR");
}
	public static void main(String[] args) {
		
System.out.println("main method");
new SIB_IIB();
	}

}
