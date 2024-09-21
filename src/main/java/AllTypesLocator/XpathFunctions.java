package AllTypesLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFunctions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement text = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		
		text.click();
		
		WebElement contains = driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		
		contains.click();
		

	}

}
