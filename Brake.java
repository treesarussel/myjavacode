package automationtesting;
class Car
{
	void color()
	{
		System.out.println("This is a red car(parent class)");
	}
}
class Light extends Car
{
	void lightspecification()
	{
		System.out.println("have 2 head light");
	}
	void lightcolor()
	{
		System.out.println("color of light is yellow");
	}
}
class Seat extends Car
{
	void seatcount()
	{
		System.out.println("it have 5 seat");
	}
	void seatcolor()
	{
		System.out.println("seat color is black");
		
	}
}
class Wheel extends Car
{
	void wheeldetails()
	{
		System.out.println("good wheel");
	}
	void wheelcolor()
	{
		System.out.println("black");
	}
	
}
public class Brake extends Car
{
void brakespecification()
{
	System.out.println("good brake");
}
public static void main(String[] args)
{
	Brake b1=new Brake ();
	b1.brakespecification();
	b1.color();
	Wheel w1=new Wheel ();
	w1.wheeldetails();
	w1.wheelcolor();
	w1.color();
	Seat s1= new Seat();
	s1.seatcolor();
	s1.seatcount();
	Light l1=new Light();
			l1.lightcolor();
	l1.lightspecification();
	l1.color();
		
}
}
