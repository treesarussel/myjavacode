package assignment;

//Write a addAll method(index int,collection c) program in Arraylist(As per class 31)
import java.util.ArrayList;

public class Addallmethod_arraylist {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("treesa");
		a1.add(3);
		a1.add(345.45f);
		a1.add(567.56789056);
		a1.add(null);
		a1.add("treesa");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("anbu");
		a2.add(322);
		a2.add(1005.45f);
		a2.add(23.456);
		a2.add("alwin");
		a2.add("altrin");
	//System.out.println(a1.addAll(4, a1));
	//System.out.println(a1.addAll(12, a1));
	System.out.println(a2);
	System.out.println(a1.addAll(6, a2));//if we given the index above 6 it will display 
	//exception becoze here the array size is 6

	}

}
