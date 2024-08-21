package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbar_enable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver c=new ChromeDriver();	
		c.get("https://google.com");
		c.manage().window().maximize();
		WebElement e1=	c.findElement(By.name("q"));
		Thread.sleep(3000);
		boolean b1=	e1.isDisplayed();
		boolean b2=	e1.isEnabled();
		System.out.println(b1);
		System.out.println(b2);


		if(e1.isDisplayed()&& e1.isEnabled())
		{
			e1.sendKeys("India");
		}

	}

}
