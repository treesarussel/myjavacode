package automationtesting;

import java.util.Arrays;

public class String_with_array {

	public static void main(String[] args) {
		String name="ankita";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		
		
		String name1= "TREESA";
		char [] a2=name1.toCharArray();
		System.out.println(Arrays.toString(a2));
				
		String studentname="Manasa";
		char[] s1=studentname.toCharArray();
		System.out.println(Arrays.toString(s1));
		
//check if 2 arrays are equal to each other.
		String name01[]=new String[3];
		name01[0]="RAM";
		name01[0]="ANISH";
		name01[0]="RAJ";
		
		String name02[]=new String[3];
		
		 name02[0]="RAM";
		 name02[0]="ANISH";
		 name02[0]="RAJy";
		
		 System.out.println(Arrays.equals(name01, name02));
	}

}
