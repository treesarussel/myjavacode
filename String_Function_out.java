package automationtesting;//Write  program to remove school out ,name out,is out,vidya out (as per class 21)

public class String_Function_out {

	public static void main(String[] args) {
		String name="school name is vidya";
		System.out.println(name);
		System.out.println("The lenghth of the string is --" + name.length());
		System.out.println("remove school out --" + name.substring(0, 6));//remove school out
		System.out.println("remove name out ---" + name.substring(7, 11));//remove name out
		System.out.println("remove vidhya out -- " + name.substring(15, 20));//remove vidhya out
		
	}

}
