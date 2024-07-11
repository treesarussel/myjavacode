package automationtesting;

public class TreeNonstatic {
	void mark()
	{
		int tmark=10;
		int gmark=4;
		System.out.println(tmark+gmark);
		if(tmark+gmark>=200)
		{
			System.out.println("full mark");
		}
		else
		{
			System.out.println("Failed");
		}
		if(tmark+gmark<100)
		{
			System.out.println("test if else if");
		}
	}
	void div() 
	{ 
		int x=100;
		int y=12;
		System.out.println(x/y);
		
	}

	public static void main(String[] args) {
		TreeNonstatic m1=new TreeNonstatic();
		m1.mark();
      
		TreeNonstatic div1=new TreeNonstatic();
		div1.div();
		
	}
	

}
