package automationtesting;
import java.util.Scanner;

public class ScannerAllMethods {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Employee Details");
		System.out.println("Enter the name of Employee");
		String name= s1.next();
		System.out.println("Enter Employee ID");
		String id= s1.next();
		System.out.println("Enter the City");
		String city= s1.next();
		System.out.println("Enter the Phonenumber");
		long phno=s1.nextLong();
		System.out.println("Enter Employee Attendence percentage");
		double percentage=s1.nextDouble();
		System.out.println("Enter employee salary");
		long salary=s1.nextLong();
		System.out.println("Enter Age");
		int age=s1.nextInt();	
		//byte days=s1.nextByte();
		System.out.println("Wish to continue this form");
		boolean continueform=s1.nextBoolean();
		if(continueform)
		{
			System.out.println("Continuethis form");
		}
		else
		{
			System.out.println("Thanks");
		}
		
													
		

	}

}
