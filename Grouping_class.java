package amazon_testcase1;

import org.testng.annotations.Test;

public class Grouping_class {
	
	@Test(groups={"smoke","system"})
	public void testcase_1()
	{
		System.out.println("1");
	}
	@Test(groups= {"system"})
	public void testcase_2()
	{
		System.out.println("2");
	}
	@Test(groups= {"smoke"})
	public void testcase_3()
	{
		System.out.println("3");
	}
	@Test(groups={"smoke","system"})
	public void testcase_4()
	{
		System.out.println("4");
	}
	@Test
	public void testcase_5()
	{
		System.out.println("5");
	}

}
