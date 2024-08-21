//In the Learning HTML page, select the gender and confirm that if it is selected
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlpage_Gender_gender_select_andconfirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/trees/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement gender=driver.findElement(By.xpath("(//input)[12]"));
		gender.click();
		boolean b1=gender.isSelected();
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("gender is selected");
		}
		else
		{
			System.out.println("gender is not selected");
		}

	}

}
