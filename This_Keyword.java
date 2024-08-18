package assignments;


public class This_Keyword {
	int age;//global variable
	 String name;//g.v
	 double salary;//gv
	 void student_details(int age,String name, double salary)
	 {
		 this.age=age;//using this keyword. we assign the value of global variable to local variable
		 this.name=name;
		 this.salary=salary;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Keyword t1=new This_Keyword();//creating an object
		t1.student_details(20, "treesa", 82000);//using object call non static method
		System.out.println(t1.salary);
		System.out.println(t1.age);
		System.out.println(t1.name);
 
	}

}
