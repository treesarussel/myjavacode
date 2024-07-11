package automationtesting;
import java.util.Scanner;

public class AllareaandCirbyScanner {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Find area of Circle");
		System.out.println("Enter the value of r");
		double r=s1.nextDouble();
		double area=Math.PI*r*r;
		System.out.println("The area of circle is: "+ area);
		System.out.println("Find Circumference of the circle");
		System.out.println("enter the value of r");
		double radius=s1.nextDouble();
		double circumference = Math.PI*2*radius;
		System.out.println("The circumference of the circle is: "+circumference);
		System.out.println("Find area of Square");
		System.out.println("enter the  value of a");
		int a=s1.nextInt();
		int area_of_square=a*a;
		System.out.println("The area of Square is: " +area_of_square);
		System.out.println("Find the area of Rectangle");
		System.out.println("Enter the value of l");
		int l=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int area_of_rectangle=l*b;
		System.out.println("The area of rectangle is: " +area_of_rectangle);
		System.out.println("Find the area of Triangle");
		System.out.println("Enter the value of base");
		double base=s1.nextDouble();
		System.out.println("Enter the value of height");
		double height=s1.nextDouble();
		double area_of_triangle=(base*height)/2;
		System.out.println("The area of Triangle is: " +area_of_triangle);
		System.out.println("Find the area of Trepezium");
		System.out.println("enter value of base1");
		int base1=s1.nextInt();
		System.out.println("Enter the value of base2");
		int base2=s1.nextInt();
		System.out.println("Enter the value of height");
		int height1=s1.nextInt();
		double area_of_trepezium= (0.5)*(base1+base2)*height1;
		System.out.println("The area of trepezium is: " +area_of_trepezium);
		System.out.println("Find the circumference of square");
		System.out.println("Enter the value of A");
		int a1=s1.nextInt();
		int circumference_of_square=4*a1;
		System.out.println("The circumference of the sqare is: " +circumference_of_square);
		System.out.println("Find the circumference of rectangle");
		System.out.println("Enter the value of l");
		int l3=s1.nextInt();
		System.out.println("Enter the value of W");
		int w1=s1.nextInt();
		int circumference_of_rectangle=2*(l3+w1);
		System.out.println("The circumference of rectangle is: "+circumference_of_rectangle);
		System.out.println("Find the circumference_of_Triangle");
		System.out.println("enter the value of a");
		int aa1=s1.nextInt();
		System.out.println("enter the value of b");
		int bb1=s1.nextInt();
		System.out.println("enter the value of c");
		int cc1=s1.nextInt();
		int circumference_of_triangle=aa1+bb1+cc1;
		System.out.println("the circumference_of_rectangle is: "+circumference_of_triangle);
		System.out.println("Find the circumference_of_trepezium");
		System.out.println("enter the value of a");
		int aaa1=s1.nextInt();
		System.out.println("enter the value of b");
		int bbb1=s1.nextInt();
		System.out.println("enter the value of c");
		int ccc1=s1.nextInt();
		System.out.println("enter the value of d");
		int ddd1=s1.nextInt();
		int circumference_of_trepezium=aaa1+bbb1+ccc1+ddd1;
		System.out.println("The circumference_of_trepezium is: "+ circumference_of_trepezium);
		
}
	
}