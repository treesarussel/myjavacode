package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;
//Write a program -send the value 2 from Scanner class try to get exception called as inputmismatchException and try to handle it.(As per class 29)
public class ExceptionHandling_from_scannerclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		try {
			
		
		int no=sc.nextInt();
		int no2=sc.nextInt();
		
		}
		catch(InputMismatchException e)
		{
		
			int no = 0;
			int no2 = 0;
			int sum=no+no2;
		System.out.println("i have handled the execption");
		}
		
		
		
		

	}

}
