package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		WebElement element = driver.findElement(By.id(null));
		
		Select select = new Select(element);
		
		select.selectByIndex(10);
		select.selectByValue("1234");
		select.selectByVisibleText("sandeep");
		
		List<WebElement> list = select.getOptions();
		
		for(WebElement dropdown : list)
		{
			System.out.println(dropdown.getText());
		}
		
		List<WebElement> selectedoption = select.getAllSelectedOptions();
		
		for(WebElement selectdropdown : selectedoption)
		{
			System.out.println(selectdropdown.getText());
		}
		
		WebElement firstElement = select.getFirstSelectedOption();
		
		System.out.println(firstElement.getText());
		
		
		select.deselectAll();
		
		select.deselectByIndex(1);
		
		select.deselectByValue("1234");
		
		select.deselectByVisibleText("sandeep");
		
	

	}

}
