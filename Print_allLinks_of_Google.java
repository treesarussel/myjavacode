//"Launch the google page, 
//print all it's links and lintexts"
package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_allLinks_of_Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().minimize();
		List <WebElement>l1=driver.findElements(By.tagName("a"));
			int count=l1.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement e1=l1.get(i);
				String  url=e1.getAttribute("href");
				System.out.println("The url is " + url);
				String linktext=e1.getText();
				System.out.println("Link text is " +linktext);
			}

	}

}
