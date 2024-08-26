//Launch the google page search for India using down arrow select 2nd option 
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Arrowndown_googlesearch_Autosuggession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");//launch google
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("(//textarea)[1]"));
		search.sendKeys("India");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
	}

}
