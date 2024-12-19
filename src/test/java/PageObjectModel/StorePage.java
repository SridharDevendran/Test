package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage
{
	@FindBy	 (css = "a[title='View cart']") public WebElement viewcartlink;
	@FindBy (xpath = "(//a[@class='menu-link'][normalize-space()='Store'])[1]") public WebElement storeclick;
	@FindBy (xpath = "//a[@aria-label='Add “Blue Shoes” to your cart']") public WebElement addproduct;
	@FindBy (xpath = "(//a[text()='Contact Us'])[1]") public WebElement contactus;
	@FindBy (xpath = "//a[text()='Men’s Shoes']") public WebElement men_s_shoe;
	@FindBy (xpath = "//a[text()='Add to cart']") public WebElement addredshoetocart;
	
	
	public StorePage(WebDriver ref) 
	{
		super(ref);
	}
	
	public void addtocart(String productname)
	{
		wait.until(ExpectedConditions.elementToBeClickable(addproduct)).click();
	}
	public void viewcart()
	{
		wait.until(ExpectedConditions.visibilityOf(viewcartlink)).click();
	}
	public void storenavigation()
	{
		wait.until(ExpectedConditions.visibilityOf(storeclick)).click();
	}
	public void contactusnavigation()
	{
		wait.until(ExpectedConditions.elementToBeClickable(contactus)).click();
	}
	public void mensshoe()
	{
		wait.until(ExpectedConditions.elementToBeClickable(men_s_shoe)).click();
	}
	public void addredshoetocartfromstore()
	{
		wait.until(ExpectedConditions.elementToBeClickable(addredshoetocart)).click();
		wait.until(ExpectedConditions.visibilityOf(viewcartlink)).click();
	}
}
