//Launch the google page search for India and Enter using Enter key using name locator
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_India_and_Press_Enterbutton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
