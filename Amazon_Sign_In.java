//Launch the Amazon direct click on the Sign in button and using name Locator 
//add UserName, Continue and Password 
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Sign_In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ref=nav_logo");
WebElement w1=driver.findElement(By.linkText("Sign in"));
w1.click();
WebElement w2=driver.findElement(By.name("email"));
w2.sendKeys("8344829118");
WebElement w3=driver.findElement(By.xpath("//input[@class='a-button-input']"));
w3.click();
WebElement w4=driver.findElement(By.name("password"));
w4.sendKeys("Treesa@123");
WebElement w5=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
w5.click();

	}

}
