package Hooks;

import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import PicoContainer.DI_PICO;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	public DI_PICO driver;
	public WebDriver ref;
	
	public Hooks(DI_PICO driver) 
		{
		this.driver = driver;
		}

		@Before
		public void driverlaunch()
		{
		ref = DriverFactory.initial();
		driver.ref = ref;
		}
		
		@After
		public void driverquit()
		{
			ref.quit();
		}
}
