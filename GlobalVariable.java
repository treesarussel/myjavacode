package automationtesting;

public class GlobalVariable 
{
	static double pi=3.14; //global 
    static void brother()
    {
		int radius=10;
		double area_of_circle=pi*radius*radius;
		System.out.println(area_of_circle);
    }
	int a=100;//global(inside class&outside method)
	double b=9.90;
	void add()
	{
		int salary=5000; //local, inside method
		int a=100;
		int sum=salary+a;
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		String name="treesaa";//local inside method
		System.out.println(name);
		GlobalVariable s1=new GlobalVariable ();
		s1.add();
		brother();
		int r=7;
		double area=pi*r*r;
		System.out.println(area);

	}

}
