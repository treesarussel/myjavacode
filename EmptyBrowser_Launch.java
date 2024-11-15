package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyBrowser_Launch {
	
	public static void main(String[] args) {
		//launch empty browser
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.com/");
		c1.close();
		EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.google.com/");
		e1.close();
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://www.google.com/");
		f1.close();
		
		
	}

}
