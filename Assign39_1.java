package automationtesting;

import java.util.Arrays;
import java.util.Scanner;

public class Assign39_1 {

	public static void main(String[] args) {
		boolean values[]=new boolean[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter value" + i);
			values[i]=sc.nextBoolean();
			System.out.println(Arrays.toString(values));
			
		}

	}

}
