package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver initial() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		return ref;
	}
}
