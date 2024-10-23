package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Annotation {
	@DataProvider(name="set1")
	public Object[][] method1()
	{
		return new Object[] []{{"india"},{"Srilanka"},{"Pakistan"}};
	}
	@DataProvider(name="set2")
	public Object[][] method2()
	{
		return new Object[][] {{"modi"},{"rahul gandhi"},{"yuvan shankar"}};
	}
	@Test(dataProvider="set2")
	public void search(String input)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(input +Keys.ENTER);
		
		
	}

}
