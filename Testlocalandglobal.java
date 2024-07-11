package automationtesting;

public class Testlocalandglobal {
	static double pi=3.14;//global var
	static int no_of_days;//intialize no of days
	
	
	
	static void brother()//static mtd
	{
		int radius=10;
		double areof_circle=pi*radius*radius;
		System.out.println(areof_circle);
	}

	public static void main(String[] args) 
	{
		
		no_of_days=365;//declaring no of days
		System.out.println(no_of_days);
		no_of_days=366;//update the value of global var
		System.out.println(no_of_days);
		int r=7;//local var
		double area=pi*r*r;
		System.out.println(area);
		brother();//call static method
		

	}

}
