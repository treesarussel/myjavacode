package packagefortestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1  extends LaunchQuit 
{
	@Test
	public void login_searching() 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}

}
