package automationtesting;

public class NestedIf {

	public static void main(String[] args) {
		char gender_1='M';
		char gender_2='F';
		int age_kid=4;
		int ageof_adult=32;
		int ageof_adult_female=30;
		if(gender_1=='M')
		{
			if(age_kid>=4)
			{
				System.out.println("ticket is free");
			}
			else
			{
				System.out.println("full ticket");
			}

	}

}
}