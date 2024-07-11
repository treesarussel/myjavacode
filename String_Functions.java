package automationtesting;
//Write a program for all methods of String length,lowercase,uppercase,
//indexofchar,charAt(index),trim,equals,
//equalsignorecase,contains,substring(start index),substring(startindex,endindex) (as per class 21)
public class String_Functions {

	public static void main(String[] args) {
		String name1="manish";
		System.out.println("the length of manish is "+name1.length());
		String name="school name is vidya";
		System.out.println("the leghth of school name is vidhya is " +name.length());
		System.out.println("school name is vidhya in uppercase is " +name.toUpperCase());
		String name2="MANISH";
		System.out.println("the string MANISH in lower case is "+ name2.toLowerCase());
		String batch_name="AB43bymkt";
		System.out.println("the string batch name \"Ab43bymkt\" is in lower case is "+ batch_name.toLowerCase());
		System.out.println("in batch_name  \"Ab43bymkt\";the char in 7 th index is " + batch_name.charAt(7));
		System.out.println(batch_name.indexOf('b'));
		String a="   automation batch  ";
		System.out.println(a.trim());
		String b="          automation batch";
		System.out.println(b.trim());
		String batchname1="Ab43bymkt";
		System.out.println(batch_name.equals(batchname1));
		String student_name="ashwini";
		String student_name1="Ashwini";
		System.out.println(student_name.equals(student_name1));
		System.out.println(student_name.equalsIgnoreCase(student_name1));
		System.out.println(name.contains("manish"));
		System.out.println(name.contains("school"));
		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 5));
		

	}
	
}
