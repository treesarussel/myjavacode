package automationtesting;
//Write a Program to copy one array in to another array using iteration

import java.util.Arrays;

//Assignment 42
public class Copy_Array {

	public static void main(String[] args) {
		int input[]=new int[3];
		input[0]=67;
		input[1]=89;
		input[2]=907;
		int output[]=new int [3];
		for(int i=0;i<=2;i++)
{
	output[i]=input[i];
	
}
System.out.println("Input is..." +Arrays.toString(input));
System.out.println("Output is..." +Arrays.toString(output));
		

	}

}
