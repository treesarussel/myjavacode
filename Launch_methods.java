//Utilize the methods GetTiltle(), quit(), close(), Getwindowhandles(), manage(), Getwindowhandle(),
//maximize(), minimize() on the launched browsers.
package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.google.com");
		
		//Thread.sleep(2000);
		System.out.println(c1.getWindowHandle());
		System.out.println(c1.getWindowHandles());
		System.out.println(c1.getTitle());
		c1.manage().window().maximize();
		Thread.sleep(2000);
		c1.manage().window().minimize();

		
		c1.close();

	}

}
