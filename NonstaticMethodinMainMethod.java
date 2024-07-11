package automationtesting;

public class NonstaticMethodinMainMethod {//program to call nonstatic method inside main method
	void add()
	{
		int a=40;
		int b=34;
	    int c=35;
		System.out.println(a+b+c
				);
	}

	public static void main(String[] args) {
		
          System.out.println("Call Nonstatic Method");
           NonstaticMethodinMainMethod a1=new NonstaticMethodinMainMethod();
           a1.add();
	}

}
