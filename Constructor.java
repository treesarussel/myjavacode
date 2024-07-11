package automationtesting;

public class Constructor {

	Constructor()//same name as class name,dont have return type, nonstatic
	{
		System.out.println("Login to amazon");
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor();
		new Constructor();
		
		

	}

}
