package CheckRadioBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		WebElement element = driver.findElement(By.id(null));
		
		if(element.isDisplayed())
		{
			element.click();
		}
		
		if(element.isSelected())
		{
			element.click();
		}
		
		if(element.isEnabled())
		{
			element.click();
			
			System.out.println(element.getText());
		}
}
}
