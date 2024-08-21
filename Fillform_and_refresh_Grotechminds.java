package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillform_and_refresh_Grotechminds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.id("fname"));
		fname.sendKeys("treesa");
		WebElement lname=driver.findElement(By.id("lname"));
		lname.sendKeys("russelraj");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("treesarussel@gmail.com");
	WebElement pwd=	driver.findElement(By.id("password"));
	pwd.sendKeys("treesa@123");
	WebElement gender=driver.findElement(By.id("Female"));
	gender.click();
	Thread.sleep(4000);
	driver.navigate().refresh();
		

	}

}
