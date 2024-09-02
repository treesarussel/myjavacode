package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Banglore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");//launch google
		driver.manage().window().maximize();
		WebElement searchfeild=driver.findElement(By.name("q"));
		searchfeild.sendKeys("Banglore");
		Thread.sleep(2000);
		List <WebElement> Autosugg=	driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		int count=Autosugg.size();
		System.out.println(count);
		Autosugg.get(3).click();
	}

}
