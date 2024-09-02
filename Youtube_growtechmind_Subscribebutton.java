//Launch the Youtube application and search for Grotech minds 
//and verify if Subscribe button can be inspected and click on the same. 
//(It should re-direct to Gmail login page)
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube_growtechmind_Subscribebutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
WebElement searchbar=driver.findElement(By.name("search_query"));
searchbar.sendKeys("Growtechminds");
//w1.sendKeys(Keys.ENTER);
WebElement searcchicon=driver.findElement(By.id("search-icon-legacy"));
searcchicon.click();
Thread.sleep(2000);
WebElement subscribebutton=driver.findElement(By.linkText("Subscribe"));
subscribebutton.click();
	}
}

	
       

          

       

 

	


