package automationtesting;//Write a program to verify if the given String is a Palindrome (Eg: Madam, Radar, Mom, Wow, Dad)
//Assignment 41
public class Palindrome {

	public static void main(String[] args) {
		String input="MALAYALAM";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
			
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("this is not palindrome");
		}
	}

}
