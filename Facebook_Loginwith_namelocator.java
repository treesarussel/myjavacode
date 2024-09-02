//Launch the facebook application and log in to the page using name locator
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Loginwith_namelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 WebElement w1 = driver.findElement(By.name("email"));
		 w1.sendKeys("8344829118");
		 WebElement w2 = driver.findElement(By.name("pass"));
		 w2.sendKeys("Demofacebook@123");
		 WebElement w3 = driver.findElement(By.name("login"));
		 w3.click();
	}

}
