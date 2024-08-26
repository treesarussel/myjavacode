package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greotechmind_Registrationform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement fname=	driver.findElement(By.id("fname"));
		fname.sendKeys("Treesa");
		//Thread.sleep(2000);
		WebElement lname=	driver.findElement(By.id("lname"));
		lname.sendKeys("Alwin Jeyaraj");
		//Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("treesaautomationtester@gmail.com");
		//Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.id("password"));
		//Thread.sleep(2000);
		pwd.sendKeys("treesa@123");
		//Thread.sleep(2000);
		WebElement gender=driver.findElement(By.id("Female"));
		gender.click();
		WebElement presentaddress=driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("2/345,test area, test streest, 7880");
		//Thread.sleep(2000);
		WebElement permanent_Adrs=driver.findElement(By.id("Permanent-Address"));
		permanent_Adrs.sendKeys("2/345,test area, test streest, 7880, tamil nadu");
		//Thread.sleep(2000);
		WebElement pincode=driver.findElement(By.id("Pincode"));
        pincode.sendKeys("685501");
        WebElement relocate=  driver.findElement(By.id("relocate"));
        relocate.click();
       // Thread.sleep(1000);
       WebElement submit= driver.findElement(By.name("Submit"));
       submit.click();

	}

}
