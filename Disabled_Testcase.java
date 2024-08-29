//Write a program to demonstrate that when a Test case is disabled,
//it is not executed.
package selenium.packkage.testng;

import org.testng.annotations.Test;

public class Disabled_Testcase 
{
	@Test(enabled=false)
	public void Disableddemo()
	{
		System.out.println("disabled demo");
	}

}
