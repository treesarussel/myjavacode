//Launch the google.com and Right click on Gmail
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.contextClick(Gmail).perform();

	}

}
