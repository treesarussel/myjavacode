package selenium.packkage.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_parameter_ {
	ChromeDriver driver=new ChromeDriver();
	@Test(timeOut=8000)
	public void login()
	{
	
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement w1=driver.findElement(By.name("email"));
		w1.sendKeys("8344829118");
		WebElement w2=driver.findElement(By.xpath("//input[@id='continue']"));
		w2.click();
		WebElement w3=driver.findElement(By.id("ap_password"));
		w3.sendKeys("Treesa@123");
		WebElement w4=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		w4.click();
		
		
		
	}
	

}
