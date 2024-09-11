package automationtesting;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_in_collection {
void iteratorcheck()
{
	ArrayList a2=new ArrayList();
	a2.add("sam");
	a2.add("sita");
	a2.add("laxman");
	a2.add(45);
	System.out.println("a2 is " +a2);
	Iterator i2=a2.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
} 
void iteratorcheck1()
{
	ArrayList a1=new ArrayList();
	   a1.add("treesa");
	   a1.add("anbu");
	   a1.add("altu");
	   a1.add("jancy");
	   a1.add(12);
	   System.out.println("a1 is ---->"+a1);
	   Iterator  i1= a1.iterator();
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
}
void iteratortest()
{
	ArrayList a3=new ArrayList();
	a3.add("chrome");
	a3.add("browser");
	a3.add(89);
	System.out.println("a3 is "+ a3);
	Iterator i3=a3.iterator();
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Iterator_in_collection ic1=new Iterator_in_collection();
		
  ic1.iteratorcheck();
  ic1.iteratorcheck1();
  ic1.iteratortest();
		
	
		
	}

}
