package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchamazon_searchfor_shoes_by_xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("(//input)[5]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement e1=	driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e1.click();
		Set<String> s1=	driver.getWindowHandles();
			System.out.println(s1);
		Iterator i1=			s1.iterator();
				i1.next();
				i1.next();
		
	
	}

}
