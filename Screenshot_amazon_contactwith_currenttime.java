//Take the ScreenShot of Amazone home page , name concat with current Time
package seleniumpackage;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_amazon_contactwith_currenttime {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
				Date d2=new Date();
		
		System.out.println("Current Time->"+d2);
		String time=d2.toString().replace(":", "").replace(" ", "")+".png";
		System.out.println(time);
		
		TakesScreenshot t1=driver;
		File f1=t1.getScreenshotAs(OutputType.FILE);
	File f2=new File("C:\\Users\\trees\\eclipse_workspaceselenium\\Selenium\\screenshot\\amazonwithcurr"+time);
		FileHandler.copy(f1,f2);
	
		
	}

}
