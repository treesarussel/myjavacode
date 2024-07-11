package automationtesting;

import java.util.Arrays;

//isEmpty,lastIndexOf,replace
public class String_FunctionExample {

	public static void main(String[] args) {
		String name="treesa russel raj";
		System.out.println(name);
		String str="";
		System.out.println(name.isEmpty());
		System.out.println(str.isEmpty());
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.replace('e', 'i'/*new char*/));//REPLACE e with i o/p will be triisa russil raj
		System.out.println(name.replace("treesa", "sreeja"));
		System.out.println(name.replaceAll(" ", ""));//replace entire space
  
		String a="23 OCTOber 2024";
		System.out.println("The given string is..." + a);
		System.out.println("Replacing all numeric values from the string a is " +a.replaceAll("[0-9]", ""));
		System.out.println(a.replaceAll("[a-z]", ""));//removing the small letters from string a
		System.out.println(a.replaceAll("[A-Z]", ""));
		
		
	//Match String Function example
		
		String b="Alwin Jeyaraj Anbian";
		
		System.out.println(b.matches("A(.*)"));//stars with letter A
		System.out.println(b.matches("(.*)n"));//end with n
		System.out.println(b.matches("(.*)r(.*)"));// find out letter r is present in the given string
		String c="anu";
		System.out.println(c.matches("..."));//check string c is exact 3 character string
		
		
		
		//Arrays
		// Datatype [] variable= new datatype[size of arrays];
		//Datatype variable[]= new Datatype[size of array];
		
		String [] ename=new String[3];
		ename[0]="padma";
		ename[1]="prema";
		ename[2]="vimala";
		for(int i=0;i<=2;i++)
		{
			System.out.println(ename[i]);
		}
		System.out.println(Arrays.toString(ename));
		
		
		
		
		
		
	}

}
