//"On the flipkart website,
//Try to hover over home and furniture and then hover over home decor and then click on clocks"
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleHoverover_furniture_hoverover_homedecor_click_clock {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//span[.='Home & Furniture'])[2]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.linkText("Home Decor"));
		Actions a2=new Actions(driver);
		a2.moveToElement(e2).perform();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.linkText("Clocks"));
		e3.click();
	}

}
