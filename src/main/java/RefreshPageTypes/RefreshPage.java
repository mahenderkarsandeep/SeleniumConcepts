package RefreshPageTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPage {
	public static void main(String[] args)
	{

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.youtube.com/@sdetpavan"); 
	
	driver.navigate().refresh(); //1
	
	driver.navigate().to(driver.getCurrentUrl()); //2
	
	driver.get(driver.getCurrentUrl()); //3
	
	driver.findElement(By.id("")).sendKeys(Keys.F5); //4
	
	driver.findElement(By.id("")).sendKeys("\uE035"); //5
}
}
