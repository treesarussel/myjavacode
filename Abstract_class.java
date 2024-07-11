package automationtesting;
//Java Program to implement To display the
//method print the addition and subtraction
//by using abstraction

//Abstract Class
abstract class arithmetic_operation {
 abstract void printInfo();
}

//Class add
class add extends arithmetic_operation {
 // class add must override printInfo() method
 // otherwise, compile-time
 // exception will be thrown
 void printInfo()
 {
     int a = 3;
     int b = 4;
     System.out.println(a + b);
 }
}

//Class sub
class sub extends arithmetic_operation {
 // class sub must override printInfo() method
 // otherwise, compile-time
 // exception will be thrown
 void printInfo()
 {
     int c = 4;
     int d = 5;
     System.out.println(c - d);
 }
}

 

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		     arithmetic_operation n = new add();
		     n.printInfo();
		     arithmetic_operation y = new sub();
		     y.printInfo();
		 }
	}

}
