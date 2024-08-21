//In the HTML page(learningHtml), perform an action on the last name only if it is enabled and displayed.
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lastname_enabled_displayed_inhtml {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/trees/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
		boolean b1=e1.isEnabled();
		boolean b2=e1.isDisplayed();
		System.out.println(b1);
		System.out.println(b2);
		if(e1.isDisplayed()&&e1.isEnabled())
		{
			e1.sendKeys("russelraj");
		}
		else
		{
			System.out.println("sorry the last name feild is disabled");
		}

	}

}
