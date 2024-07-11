package automationtesting;
//1.write a program for remaining methods of string(isempty,lastindexof,replace,replaceall,) 


public class String_Function {

	public static void main(String[] args) {
		String a="manish kumar";	
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf('a'));

		String new1=	a.replace('m', 'a');
		System.out.println(new1);
		String new12=	a.replaceAll(" ", "");
		System.out.println(new12);
		
		System.out.println(a.replaceAll("kumar", "Tiwari"));
		String b="school123";
		System.out.println(	b.replaceAll("[0-9]", ""));
		System.out.println(b.replaceAll("[a-z]", ""));
		String c="Manish123 School";
		System.out.println(c.replaceAll("[A-Z]", ""));
		
		
		
		
		

	}


	}


