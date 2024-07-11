package automationtesting;

public class LocalandGlobalVariable {
	private static LocalandGlobalVariable lg1;

	void add()//non static mtd
	{
		int a=100;//local var
		int b=10;
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sub()//static mtd
	{
		int a=10;//local var
		String name="Ram";
		System.out.println(a+""+name);
	}

	public static void main(String[] args) {
		
		sub();
		LocalandGlobalVariable.lg1=new LocalandGlobalVariable();
		lg1.add();
		
	}

}
