package automationtesting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionHierarchyaddmethod {
static void Arraylistaddmethod()
{
//add object
		ArrayList a1=new ArrayList();
		a1.add("Aravind");
		a1.add("balu");
		a1.add("Bindhu");
		a1.add("Cathy");
		a1.add("giya");
		a1.add("unicorn");
		a1.add("weather");
		a1.add("Diya");
		a1.add("xerox");
		a1.add("Treesa");
		a1.add("vinu");
		a1.add("giya");
		 System.out.println("ArrayList following  indexing" + a1);//
		 System.out.println("ArrayList following  order of insertion" + a1);
		Collections.sort(a1);
		System.out.println("ArrayList follows sort" +a1);
		a1.add(null);
		a1.add("balu");
		a1.add(null);
		a1.add("giya");
		System.out.println("ArrayList accept null values" +a1);
		a1.add("Bindhu");
		a1.add("Bindhu");
		System.out.println("ArrayList accept dulpicate  values" +a1);
		a1.add(true);
		a1.add(23);
		a1.add(34.56);
		a1.add('d');
		a1.add(false);
		System.out.println("ArrayList is dynamic " +a1);
		System.out.println("ArrayList is Heterogenious " +a1);
}

static void Linkedlist_addmethod()
{
	LinkedList l1=new LinkedList();
	l1.add("Beno");
	l1.add("Cyril");
	l1.add("Gokul");
    l1.add("Manasa");
	l1.add("Anusha");
	l1.add("Beni");
	System.out.println("linked list add method datas are--->" +l1);
	System.out.println("Linked list follows indexing " +l1);
	System.out.println("Linked list follows order of insertion  " +l1);
	 Collections.sort(l1);
	 System.out.println("Linked list follows sort " +l1);
	 l1.add("Beno");
		l1.add("Cyril");
		l1.add("Gokul");
		l1.add("Beno");
		l1.add("Cyril");
		l1.add("Gokul");
		l1.add("Beno");
		l1.add("Cyril");
		l1.add("Gokul");
		System.out.println("Linked list allows duplicate values " +l1);
		l1.add('f');
		l1.add(4);
		l1.add(789.908f);
		l1.add(45.345678);
		l1.add(null);
		l1.add(null);
		System.out.println("Linked list accept nullvalues " +l1);
		
		l1.add("Benyl");
		System.out.println("Linked list i s Dynamic " +l1);
		
	
}
   static void vector_addmethod()
   {
	   Vector v1=new Vector();
	   v1.add("Liya");
	   v1.add("Lionel");
	   v1.add("Joel");
	   v1.add("Faith");
	   System.out.println(v1);
	   System.out.println("Vector follows indexing" + v1);
	   System.out.println("Vector follows order of insertion" +v1);
	   Collections.sort(v1);
	   System.out.println("vector follows sort " +v1);
	   v1.add(null);
	   v1.add(null);
	   v1.add("Liya");
	   v1.add("Lionel");
	   v1.add("Joel");
	   v1.add("Faith");
	   System.out.println("Vector accept null values and duplicate values" +v1);
	   v1.add(12);
	   v1.add(false);
	   v1.add(12.78908789);
	   v1.add(12.123456f);
	   v1.add(345789);
	   v1.add(true);
	   System.out.println("Vector is dynamic " +v1);
	   System.out.println("Vector is heterogenious " +v1);
	   
   }
   static void PriorityQueue_addmethod()
   {
	   PriorityQueue p1=new PriorityQueue();
	   p1.add("X");
	   p1.add("A");
	   p1.add("J");
	   p1.add("U");
	   p1.add("I");
	   p1.add("N");
	   p1.add("C");
	   System.out.println(p1);
	   System.out.println("Priority queue not follows indexing" +p1);
	   System.out.println("Priority queue not follows order of insertion" +p1);
	   //Collections.sort(p1);
	   System.out.println("Priority queue not follows sort" +p1);
	   //p1.add(null);
	   p1.add("X");
	   p1.add("A");
	   p1.add("J");
	   p1.add("U");
	   //p1.add(null);
	   p1.add("I");
	   p1.add("N");
	  // p1.add(null);
	   p1.add("C");
	   p1.add("treesa");
	   System.out.println("null values are not accepted in Priority queue " +p1);
	   p1.add("treesa");
	   //p1.add(true);
	   //p1.add(false);
	   System.out.println("priority queue doesnot accept boolean values " +p1);
	   //p1.add(34.456);
	   p1.add("anbu");
	   p1.add("treesa");
	   p1.add("daisy");
	   p1.add("daisy");
	   p1.add("daisy");
	   System.out.println(" prority queue accept duplicate values" +p1);
	   System.out.println(" prority queue is not dynamic and not hetrogenious" +p1);
   }
   static void HashSet_addmethod()
   {
	   HashSet h1=new HashSet();
	   h1.add("veena");
	   h1.add("anju");
	   h1.add("nimmy");
	   h1.add("noel");
	   h1.add("mkt");
	   h1.add("broter");
	   System.out.println(h1);
	   System.out.println("Hash set not following indexing " +h1);
	   System.out.println("Hash set not following order of insertion" +h1);
	   //Collections.sort(h1);
	   System.out.println("Hash set not following sort" +h1);
	   h1.add("veena");
	   h1.add("anju");
	   h1.add("nimmy");
	   h1.add("noel");
	   h1.add("mkt");
	   h1.add("broter");
	   h1.add("veena");
	   h1.add("anju");
	   h1.add("nimmy");
	   h1.add("noel");
	   h1.add("mkt");
	   h1.add("broter");
	   h1.add("noel");
	   h1.add("noel");
	   h1.add("noel");
	   System.out.println(h1);	
	   System.out.println("Hash set not accept duplicate values" +h1);
	   h1.add(null);
	   System.out.println("Hash set accept null values" +h1);	
	   
	   System.out.println(h1);
   }
   static void TreeSet_addmethod()
   {
	   TreeSet t1=new TreeSet();
	   t1.add("miya");
	   t1.add("adhi");
	   t1.add("raju");
	   t1.add("jiju");
	   System.out.println(t1);
	   System.out.println("Treeset doesn't follows indexing"  + t1);
	   System.out.println("Treeset doesn't follows order of insertion"  + t1);
	   //t1.add(null);
	   System.out.println("Treesset not accept null values" + t1);
	   t1.add("miya");
	   t1.add("adhi");
	   t1.add("raju");
	   t1.add("jiju");
	   t1.add("miya");
	   t1.add("adhi");
	   t1.add("raju");
	   t1.add("jiju");
	   System.out.println("Treeset not accept duplicate values" +t1);
	   //Collections.sort(t1);
	   System.out.println("Treeset not follows sort" +t1);
	   //t1.add(true);
	   System.out.println("Treeset not accept  boolean values" +t1);
	  // t1.add(23);
	   //t1.add(345.67f);
	   System.out.println("Treeset is not dynamic" +t1);
	   System.out.println("Treeset is not Hetrogenius" +t1);
	      
   }
   static void LinkedHashSet_addmethod()
   {
	   LinkedHashSet lh=new LinkedHashSet();
	   lh.add("mano");
	   lh.add("ani");
	   lh.add("resh");
	   lh.add("sree");
	   System.out.println(lh);
	   System.out.println("LinkedHash set follows indexing " +lh);
	   System.out.println("LinkedHash set follows order of insertion" +lh);
	   lh.add("mano");
	   lh.add("ani");
	   lh.add("resh");
	   lh.add("sree");
	   lh.add("mano");
	   lh.add("ani");
	   lh.add("sree");
	   lh.add("mano");
	   lh.add("ani");
	   lh.add("resh");
	   lh.add("sree");
	   System.out.println("LinkedHashSet doesnt accept duplicate values " +lh);
	   lh.add(null);
	   lh.add(null);
	   System.out.println("LinkedHashSet accept null value" +lh);
	   lh.add(789);
	   lh.add(890.890);
	   lh.add(true);
	   lh.add(false);
	   lh.add("yui");
	   lh.add(78098);
	   lh.add(45.3455);
	   System.out.println(" LinkedHashSet is dynamic in nature " +lh);
	   System.out.println("LinkedhHashSet is Hetrogenius " +lh);
   }
	public static void main(String[] args) {
	Arraylistaddmethod();
	Linkedlist_addmethod();
	vector_addmethod();
	PriorityQueue_addmethod();
	HashSet_addmethod();
	TreeSet_addmethod();
	LinkedHashSet_addmethod();
		

	}

}
