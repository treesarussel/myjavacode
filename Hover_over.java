//On the amazon website, hover over the accounts and list and complete the sign in

package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.id("nav-link-accountList"));
	Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
	WebElement e2=	driver.findElement(By.xpath("//span[.='Sign in'][1]"));
	e2.click();
	WebElement e3=driver.findElement(By.id("ap_email_login"));
	e3.sendKeys("treesa@gmail.com");
	WebElement e4=driver.findElement(By.id("continue"));
	e4.click();
  WebElement e5=   driver.findElement(By.id("ap_password"));
    e5.sendKeys("Treesa@123");

		
		

	}

}
