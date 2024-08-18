package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class While_loop {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("treesa");
		a1.add("anbu");
		a1.add("altu");
		a1.add("alwi");
		a1.add(10);
		a1.add(2);
		System.out.println("a1 is " +a1);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
