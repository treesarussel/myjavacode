package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchgoogle_clickon_gmail {

	public static void main(String[] args) {
		// Launch google and click on gmail//example for link text locator
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");//launch google
		driver.manage().window().maximize();
	WebElement gmail=	driver.findElement(By.linkText("Gmail"));
	gmail.click();
		
	}

}
