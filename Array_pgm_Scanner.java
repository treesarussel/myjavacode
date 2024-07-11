package automationtesting;

import java.util.Arrays;
import java.util.Scanner;

public class Array_pgm_Scanner {

	public static void main(String[] args) {
		int rollno[]=new int[3];
		Scanner s1= new Scanner(System.in);
for(int i=0;i<3;i++)
{
	System.out.println("Enter the value of index" + i);
   rollno[i]=s1.nextInt();

   System.out.println(Arrays.toString(rollno));
}

double cgp[]=new double[4];
Scanner sc=new Scanner(System.in);
for(int i=0;i<4;i++)
{
	System.out.println("Enter cgp" + i);
	cgp[i]=sc.nextDouble();
	System.out.println(Arrays.toString(cgp));
	
}

	}

}
