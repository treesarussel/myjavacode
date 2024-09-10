package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Test {

	public static void main(String[] args) {
//1. Write a code to select demo2 using select by Visible Text.
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/dropdown/");
driver.manage().window().maximize();
WebElement selectchoice=driver.findElement(By.name("Choice1"));
Select s1=new Select(selectchoice);
s1.selectByVisibleText("Demo2");
// Write a code to select SQL 15 using select By Value.
WebElement sql=driver.findElement(By.name("Choice9"));
Select s2=new Select(sql);
s2.selectByValue("SQL15");
//3. Explain the procedure of Selecting Night 10 dropdown?
WebElement night10=driver.findElement(By.id("Choice7"));
Select s3=new Select(night10);
s3.selectByVisibleText("Night3");
//
//driver.quit();
}

}
