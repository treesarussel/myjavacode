package assignments;

import java.util.Arrays;

public class Split_string {

	public static void main(String[] args) {
		String s1= "India is my country";
	String [] a1=s1.split(" ");
	System.out.println(Arrays.toString(a1));
String [] a2= s1.split(" ", 2);
System.out.println(Arrays.toString(a2));
	}

}
