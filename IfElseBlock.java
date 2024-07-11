package automationtesting;

public class IfElseBlock {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		if(a==b)
		{
			System.out.println("if will execute");
		}
		else 
		{
			System.out.println("else will execute");
		}
		//Age of a person in 17.Find out this person is eligible for vote or not//
		
		int age=17;
		int eligible_agefor_vote=18;
		if(age>=eligible_agefor_vote)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
	}

}
