package automationtesting;

public class NonstaticGlobalvar {
	int no_of_days=365;

	public static void main(String[] args) 
	{
		NonstaticGlobalvar ng1=new NonstaticGlobalvar();
		System.out.println(ng1.no_of_days);
		 int no_of_days=366;//how to update the value of global variable
		
		 System.out.println(ng1.no_of_days);
		

	}

}
