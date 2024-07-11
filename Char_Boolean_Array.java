package automationtesting;
///Try Out for char  and boolean

import java.util.Arrays;

public class Char_Boolean_Array {

	public static void main(String[] args) {
		char vowels[]=new char[5];
		vowels[0]='a';
		vowels[1]='e';
		vowels[2]='i';
		vowels[3]='o';
		vowels[4]='u';
		System.out.println(Arrays.toString(vowels));
		
		boolean array[]=new boolean[6];
		array[0]=true;
		array[1]=true;
		array[2]=false;
		array[3]=false;
		array[4]=true;
		array[5]=false;
		
		System.out.println(Arrays.toString(array));
		
				
	}

}
