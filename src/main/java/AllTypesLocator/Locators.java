package AllTypesLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.id("")).click();
		driver.findElement(By.name("")).click();
		driver.findElement(By.className("")).click();
		driver.findElement(By.partialLinkText("")).click();
		driver.findElement(By.linkText("")).click();
		driver.findElement(By.tagName("")).click();
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.xpath("")).click();
		
		driver.close();
		
		

	}

}
