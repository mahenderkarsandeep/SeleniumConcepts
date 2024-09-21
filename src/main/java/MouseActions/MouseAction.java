package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		Actions action = new Actions(driver);
		
		WebElement element =driver.findElement(By.id(""));
		
		action.moveToElement(element).perform();
		
		action.doubleClick(element).perform();
		
		action.click(element).perform();
		
		action.contextClick(element).perform();
		
		action.pause(Duration.ofSeconds(10));
		
		action.moveToLocation(100,100).build().perform();
		
		action.scrollByAmount(100, 100).perform();
		
	//	action.scrollFromOrigin(Origin, 100, 100).perform();
		
		action.scrollToElement(element).perform();
		
		
		
		
	}

}
