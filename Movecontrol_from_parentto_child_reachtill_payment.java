//
package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movecontrol_from_parentto_child_reachtill_payment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	   WebElement search= 		driver.findElement(By.xpath("(//input)[5]"));
	    search.sendKeys("Shoes");
	    search.sendKeys(Keys.ENTER);
	    WebElement e1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	    e1.click();
	    Set<String>s1=driver.getWindowHandles();
	   Iterator<String> i1=s1.iterator();
	   String parentid=i1.next();
	   String childid=i1.next();
	   driver.switchTo().window(childid);
	   Thread.sleep(2000);
	   WebElement e2=driver.findElement(By.id("add-to-cart-button"));
	   e2.click();
	   WebElement e3=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	   e3.click();
	  WebElement e4= driver.findElement(By.xpath("//input[@type=\"email\"][1]"));
	  e4.sendKeys("8344829118");
	  //neeed to do with email login
	  WebElement con=driver.findElement(By.xpath("//span[@id='continue'][1]"));
		con.click();
		WebElement pwd=driver.findElement(By.xpath("//input[@type=\"password\"][1]"));
		pwd.sendKeys("Treesa@123");
		WebElement signin=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"][1]"));
		signin.click();
	}

}
