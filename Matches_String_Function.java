package automationtesting;////2.write a program for matches string function for 4 questions given in class 22 
//i.e  1.check given string ends with i for string manish kumar tiwari
//2.check given string starts with m 
//3.check if letter k is present or not 
//4.check if given string tom,has 3 characters or not(as per class 22)

public class Matches_String_Function {

	public static void main(String[] args) {
		String a1="manish kumar tiwari";
		// %i
		System.out.println(a1.matches("(.*)i"));//check given string ends with i for string manish kumar tiwari
		System.out.println(a1.matches("(.*)k"));//check if letter k is present or not

		System.out.println(a1.matches("m(.*)"));//check given string starts with m 
		System.out.println(a1.matches("(.*)z(.*)"));
		String a="tom";
		//_
		System.out.println(a.matches("..."));//check if given string tom,has 3 characters or not
		

	}

}
