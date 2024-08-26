//Login to grotech minds application and on the registration page, 
//provide username and copy paste the same in the last name field
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname=	driver.findElement(By.id("fname"));
		fname.sendKeys("Treesa");
		fname.sendKeys(Keys.CONTROL+"a");
		fname.sendKeys(Keys.CONTROL+"c");
		WebElement lname=	driver.findElement(By.id("lname"));
		lname.sendKeys(Keys.CONTROL+"v");
	}

}
