package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Assign5 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
//5. Write codes separately to select QTP 9 and Energy 14 using Select by Visible Text.
		WebElement e1=driver.findElement(By.name("Choice8"));
		Select s1=new Select (e1);
		s1.selectByVisibleText("QTP9");
		WebElement e2=driver.findElement(By.id("Choice4"));
		Select s2=new Select(e2);
		s2.selectByVisibleText("Energy14");
		

	}

}
