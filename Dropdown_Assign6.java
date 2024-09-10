package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assign6 {

	public static void main(String[] args) {
//6. Write codes separately to select QTP 8 and Energy 13 using Select by Visible Text.
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("Choice8"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("QTP8");
		WebElement e2=driver.findElement(By.name("Choice4"));
		Select s2=new Select(e2);
		s2.selectByVisibleText("Energy13");

	}

}
