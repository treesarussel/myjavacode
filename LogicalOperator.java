package automationtesting;

public class LogicalOperator {

	public static void main(String[] args) {
		int age=19;
		char gender_1='M';
		char gender_2='F';
		// syntax of AND Operator
		// if(c1&&c2)
		//{
			//}
				if(age>=18&&gender_1=='M')//AND operator 
				{
					System.out.println("Full ticket");
				}
				if(age>=18||gender_2=='F')//OR Operator
				{
					System.out.println("Ticket is free");
				}
				if(!(age>=18&&gender_1=='M'))
				{
					System.out.println("And not ");
				}

	}

}
