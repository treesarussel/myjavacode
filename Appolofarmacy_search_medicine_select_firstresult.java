//Launch the apollopharmacy page, search for a medicine "PMC" 
//and select the first result
package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appolofarmacy_search_medicine_select_firstresult{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
driver.get("https://www.apollopharmacy.in/?srsltid=AfmBOorfkUvbtVq9saX5AnXy_TmRpZPx6h_fewtK7TjKvoQT2sh85tV2");
driver.manage().window().maximize();
WebElement search=driver.findElement(By.xpath("//div[@data-placeholder='Search Medicines']"));
search.click();
WebElement search2=driver.findElement(By.id("searchProduct"));
search2.sendKeys("pmc");
Thread.sleep(2000);
WebElement fresult=driver.findElement(By.xpath("//li[@class='ProductSuggestion_suggestionList__mijPN'][1]"));
fresult.click();
	}

}
