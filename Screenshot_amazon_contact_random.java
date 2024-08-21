//Take the ScreenShot of Amazone home page , name concat with math.random() method
package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_amazon_contact_random {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();	
				driver.get("https://amazon.in");
				driver.manage().window().maximize();
				TakesScreenshot t1=driver;
				File f1=t1.getScreenshotAs(OutputType.FILE);
				File f2=new File("C:\\Users\\trees\\eclipse_workspaceselenium\\Selenium\\screenshot\\amazoncontact.png"+Math.random());
				FileHandler.copy(f1, f2);
	}

}
