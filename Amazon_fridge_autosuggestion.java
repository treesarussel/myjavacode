//Launch the Amazon application and search for 
//a fridge and select the 4th from the dropdown
package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_fridge_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Refrigerator");
		Thread.sleep(2000);
		List<WebElement>refrigerator=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count=refrigerator.size();
		refrigerator.get(4);
		
	}

}
