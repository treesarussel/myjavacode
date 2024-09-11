package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_2 {

	public static void main(String[] args) {
//2. Write a code to return GitHub to original position after drag and drop
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.xpath("//div[@id='container-4']"));
		WebElement drop=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		WebElement drag2=driver.findElement(By.id("div2"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='container-4']"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(drag2, drop2).perform();
		
		
	}

}
