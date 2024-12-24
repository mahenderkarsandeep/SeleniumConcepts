package HeadLessbrowser;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		// option.addArguments("--Headless");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		System.out.println("Title is: " +driver.getTitle());
		
		// option.setAcceptInsecureCerts(false);
		
		Platform result = option.getPlatformName();
		System.out.println(result);
		
		String version = option.getBrowserVersion();
		System.out.println(version);
		
		String browsername = option.getBrowserName();
		
		
		System.out.println(browsername);
		
		
		driver.quit();

	}

}
