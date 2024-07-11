package automationtesting;

import java.util.Arrays;
//Write a program to find out alphabets in a given string (Eg: Name123, 50cents)
//Assignment 44
public class Alphabet {

	public static void main(String[] args) {
		String input="50 CENT";
		int count_of_alpha=0;
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
			
			boolean b1 =Character.isAlphabetic(c1[i]);
			if (b1==true)
			{
			count_of_alpha++;
			}
		}
		
		System.out.println(count_of_alpha);
	}
}

