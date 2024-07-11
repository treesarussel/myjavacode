package automationtesting;//Call multiple nonstatic method

public class NonstaticTest {
	void add()//non static 
	{
		int x=20;
		int y=56;
		System.out.println(x+y);
	}
	 void sub()//non static
	{
		int m=23;
		float n=2.559f;
		System.out.println(m+n);
	}

	public static void main(String[] args) {
		NonstaticTest a1=new NonstaticTest();//nonstatic inside static
		a1.add();
		a1.sub();//NON static inside static
		
		

	}

}
