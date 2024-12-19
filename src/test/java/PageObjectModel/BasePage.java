package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public WebDriver ref;
	public WebDriverWait wait;
	
	public BasePage(WebDriver ref) 
	{
		this.ref = ref;
		wait = new WebDriverWait(ref, Duration.ofSeconds(15));
		PageFactory.initElements(ref, this);
	}
	
	public void url(String URL)
	{
		ref.get(URL);
	}

}
