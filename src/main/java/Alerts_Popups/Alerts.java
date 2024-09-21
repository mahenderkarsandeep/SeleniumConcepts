package Alerts_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		WebElement element = driver.findElement(By.id(null));
		
		element.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		alert.dismiss();
		
		alert.sendKeys("1234");
		
		System.out.println(alert.getText());
		
		
		

	}

}
