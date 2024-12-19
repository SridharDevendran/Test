package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage
{	
	@FindBy(xpath = "(//a[normalize-space()='Blue Shoes'])[1]") public WebElement actualproductname;
	@FindBy(css ="input[type='number']") public WebElement quantity;
	@FindBy(xpath ="//a[contains(@class,'checkout-button button alt wc-forward')]") public WebElement proceedtocheckout;
	@FindBy(xpath = "(//a[normalize-space()='Red Shoes'])[1]") public WebElement redshoeproduct;
	
	public CartPage(WebDriver ref) 
	{
		super(ref);
	}
	public String productname()
	{
		return wait.until(ExpectedConditions.visibilityOf(actualproductname)).getText();
	}
	public int productquantity() 
	{
		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(quantity)).getAttribute("value"));
	}
	public void checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(proceedtocheckout)).click();
	}
	public String redshoeproductcheck() {
		return wait.until(ExpectedConditions.visibilityOf(redshoeproduct)).getText();
	}
}
