package BrowserLunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AllTypesBrowserLunching {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.safaridriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.iedriver().setup();
		
		 driver = new ChromeDriver();
		 
		 driver = new FirefoxDriver();
		 
		 driver = new SafariDriver();
		 
		 driver = new InternetExplorerDriver();
		 
		 driver = new EdgeDriver();
		 
		 String path = "path/chromedriver.exe";
		 
		 System.setProperty("webDriver.chrome.driver", path);
		 
		 driver = new ChromeDriver();
		 
		 System.setProperty("webDriver.gecko.driver", path);
		 driver = new FirefoxDriver();
		 
		 System.setProperty("webDriver.Safari.driver", path);
		 driver = new SafariDriver();
		 
		 System.setProperty("webDriver.Edge.driver", path);
		 driver = new EdgeDriver();
		 
		 System.setProperty("webDriver.ie.driver", path);
		 driver = new InternetExplorerDriver();
		
		
		
		
		

	}

}
