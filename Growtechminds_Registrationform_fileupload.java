package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Growtechminds_Registrationform_fileupload{

	public static void main(String[] args) throws InterruptedException {
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
		//Thread.sleep(2000);
		WebElement skills=driver.findElement(By.name("Skills"));
		Select s=new Select(skills);
		s.selectByValue("select1");
		//Thread.sleep(2000);
		WebElement techskills=driver.findElement(By.name("technicalskills c-s"));
		Select s1=new Select(techskills);
		s1.selectByValue("Core Java");
		//Thread.sleep(2000);
		WebElement country=driver.findElement(By.name("Country"));
		Thread.sleep(2000);
		Select s2=new Select(country);
		s2.selectByValue("India");
		//Thread.sleep(2000);
		WebElement presentaddress=driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("2/345,test area, test streest, 7880");
		//Thread.sleep(2000);
		WebElement permanent_Adrs=driver.findElement(By.id("Permanent-Address"));
		permanent_Adrs.sendKeys("2/345,test area, test streest, 7880, tamil nadu");
		//Thread.sleep(2000);
		WebElement pincode=driver.findElement(By.id("Pincode"));
        pincode.sendKeys("685501");
       // Thread.sleep(2000);
       WebElement Religion= driver.findElement(By.name("Relegion"));
       Select s3=new Select(Religion);
       s3.selectByValue("Hindu");
       //Thread.sleep(2000); 
   WebElement choosefile=    driver.findElement(By.id("file"));
   choosefile.sendKeys("C:\\Users\\trees\\Downloads\\Get_Started_With_Smallpdf-output.pdf");
     WebElement relocate=  driver.findElement(By.id("relocate"));
     relocate.click();
    // Thread.sleep(1000);
    WebElement submit= driver.findElement(By.name("Submit"));
    submit.click();
    driver.switchTo().alert().accept();//handled the popup
    Thread.sleep(2000);
    driver.quit();
    
    
	}

}
