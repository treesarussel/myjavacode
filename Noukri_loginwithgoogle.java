//Login to Naukri site(https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds) and click
//on continue to google and move the control from parent to child  and move the control back to parent.
package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Noukri_loginwithgoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI_rfz_tmIiAMV46hmAh1dXDrTEAAYASAAEgKlj_D_BwE&gclsrc=aw.ds");
	    driver.manage().window().maximize();
	   WebElement login= driver.findElement(By.xpath("//span[.='Google'][1]"));
	   login.click();
	   Set<String> s1=  driver.getWindowHandles();
	    Iterator<String> i1=s1.iterator();
	    String parentid=i1.next();//parent winodw id
	    String childid=	i1.next();//any child id
	    System.out.println(parentid);
	    System.out.println(childid);
	    
	   driver.switchTo().window(childid);
	   //driver.manage().window().maximize();
	   Thread.sleep(2000);
WebElement email=driver.findElement(By.xpath("//input[@type=\"email\"][1]"));
email.sendKeys("treesarussel@gmail.com");
email.sendKeys(Keys.ENTER);
driver.switchTo().window(parentid);



	}

}
