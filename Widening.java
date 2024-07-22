package assignment;
//store a big value in int datatype and covert it into byte 
//and note down the issue
public class Widening {

	public static void main(String[] args) {
		//int to byte
		int a=1234899;
		int b=45678906;
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
				//The literal 5678907654345 of type int is out of range 
		//int c=5678907654345;
		

		byte no= (byte)a;
		byte no1=(byte)b;
		//byte no2=(byte)c;
		//implicit manner
		System.out.println(no);
		System.out.println(no1);
		//System.out.println(no2);
		
	}

}
