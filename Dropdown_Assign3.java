package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assign3 {

	public static void main(String[] args) {
		//3. Explain the procedure of Selecting Night 10 dropdown?
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement night10=driver.findElement(By.id("Choice7"));
		Select s3=new Select(night10);
		s3.selectByVisibleText("Night3");

	}

}
