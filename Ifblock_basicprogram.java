package assignments;

import java.util.Scanner;

public class Ifblock_basicprogram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to find out which no is greater");
		System.out.println("Enter no 1");
		int no1=sc.nextInt();
		System.out.println("Enter no 2");
		int no2=sc.nextInt();
		if(no1<no2)
		{
			System.out.println(no2+ "is greater");
		}
		else
		{
			System.out.println(no1+ "is greater");
		}

	}

}
