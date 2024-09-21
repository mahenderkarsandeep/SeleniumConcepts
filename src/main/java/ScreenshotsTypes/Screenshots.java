package ScreenshotsTypes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		
		File Source = tss.getScreenshotAs(OutputType.FILE);
		
		String path = "D:\\Sandeep_WorkSpace\\HopeOfTheBestSeleniumConcepts\\Screenshots\\firstscreenshot.jpg";
		
		File destination = new File(path);
		
		FileUtils.copyFile(Source, destination);
		
		
			
			

	}

}
