package packagefortestng;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit 
{
	@Test
	public void addtocart()
	{

	 driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("(//input)[5]"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	WebElement e1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	e1.click();
	Set<String> s1=	driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1=s1.iterator();
		String parentid=i1.next();//parent winodw id
		String childid=	i1.next();//any child id
		System.out.println(parentid);
		System.out.println(childid);

		driver.switchTo().window(childid);
		WebElement add=driver.findElement(By.name("submit.add-to-cart"));
		add.click();
	}
	
    
}
