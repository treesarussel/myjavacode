//Launch the Amazon application and search for mobile phones and 
//select the 4th drop down item from the dropdown
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Mobilesearch {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobilephones");
		//select 4th option from autosuggestion
		WebElement select=driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[4]"));
		select.click();

	}

}
