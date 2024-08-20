//Launch the facebook application and log in to the page using name locator
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginto_Fcaebook_withnamelocator {

	public static void main(String[] args) {
		
           ChromeDriver driver=new ChromeDriver();
           driver.get("http://www.facebook.com");
           driver.manage().window().maximize();
           driver.findElement(By.name("email")).sendKeys("testauto@gmail.com");
           driver.findElement(By.name("pass")).sendKeys("test@123");
           driver.findElement(By.name("login")).click();
	}

}
