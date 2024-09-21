package WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		Thread.sleep(5000);
		driver.findElement(By.id("windowButton")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		Set<String> multiple = driver.getWindowHandles();
		
		List<String> windowHandleList = new ArrayList<String>(multiple);
		
		System.out.println("Total window number: " + windowHandleList.size());
		
		driver.switchTo().window(windowHandleList.get(1));
		
		for(String childwindowhandle : windowHandleList)
		{
			System.out.println(childwindowhandle.toString());
			
			if(!parentWindow.equals(childwindowhandle))
			{
			driver.switchTo().window(childwindowhandle);
			WebElement element = driver.findElement(By.id("sampleHeading"));
			
			System.out.println("this is child window text "+ element.getText());
			
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		// or
		driver.switchTo().defaultContent();
		
		System.out.println("this is parent window title "+ driver.switchTo().window(parentWindow).getTitle());
		System.out.println("this is parent window title "+ driver.switchTo().window(parentWindow).getCurrentUrl());;

	}

}
