package automationtesting;

public class Area_Circumference_of_circle_by_final_variable 
{
	final static double pi=3.14;
	final static int r=10;
	
 static void area()
 {
	 
	 double area=pi*r*r;
	 System.out.println("AREA IS :" +area);
 }
 static void circumference()
 {
	 double circumference=2*pi*r;
	 System.out.println("CIRCUMFERENCE IS :" +circumference);
 }
	
	public static void main(String[] args) 
	{
		
		area();
		circumference();
		
	}

}
