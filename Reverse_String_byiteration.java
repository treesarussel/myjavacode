package automationtesting;
//Write a Program to reverse a string using iteration
//Assignment 43
public class Reverse_String_byiteration
{

	public static void main(String[] args) {
	
String input="treesa";
String output="";
for(int i=input.length()-1;i>0;i--)
{
	char c1=input.charAt(i);
	output=output+c1;
}
System.out.println(output);
}
}