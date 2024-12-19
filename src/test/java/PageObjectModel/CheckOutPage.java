package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import DomainObjects.BillingDetails;

public class CheckOutPage extends BasePage
{	
	@FindBy (id = "billing_first_name") public WebElement billingfirstname;
	@FindBy (xpath = "//input[@name='billing_last_name']") public WebElement billinglasttname;
	@FindBy (id = "billing_country") public WebElement billingcountry;
	@FindBy (id = "billing_address_1") public WebElement billingaddress;
	@FindBy (id = "billing_city") public WebElement billingcity;
	@FindBy (id = "billing_state") public WebElement billingstate;
	@FindBy (xpath = "(//input[@id='billing_postcode'])[1]") public WebElement billingzipcode;
	@FindBy (id = "billing_email") public WebElement billingemailaddress;
	@FindBy(xpath = "//button[@id='place_order']") public WebElement placeorder;
	
	public CheckOutPage(WebDriver ref) 
	{
		super(ref);
	}

	public CheckOutPage enterbillingfirstname(String billfirstname )
	{
		wait.until(ExpectedConditions.elementToBeClickable(billingfirstname)).sendKeys(billfirstname);
		return this;
	}
	public CheckOutPage enterbillinglastname (String billlastname)
	{
		wait.until(ExpectedConditions.elementToBeClickable(billinglasttname)).sendKeys(billlastname);
		return this;
	}
	public CheckOutPage enterbillingcountry (String billcountry)
	{
		Select refe = new Select(wait.until(ExpectedConditions.elementToBeClickable(billingcountry)));
		refe.selectByVisibleText(billcountry);
		return this;
	}
	public CheckOutPage enterbillingaddress (String billaddress)
	{
		wait.until(ExpectedConditions.elementToBeClickable(billingaddress)).sendKeys(billaddress);
		return this;
	}
	public CheckOutPage enterbillingcity (String billcity)
	{
		wait.until(ExpectedConditions.elementToBeClickable(billingcity)).sendKeys(billcity);
		return this;
	}
	public CheckOutPage enterbillingstate (String billstate)
	{
		Select refe = new Select(wait.until(ExpectedConditions.elementToBeClickable(billingstate)));
		refe.selectByVisibleText(billstate);
		return this;
	}
	public CheckOutPage enterbillingzipcode (String billzipcode)
	{
	WebElement e =	wait.until(ExpectedConditions.elementToBeClickable(billingzipcode));
	e.sendKeys(billzipcode);
		return this;
	}
	
	public CheckOutPage enterbillingemailaddress (String billemailaddress)
	{
		wait.until(ExpectedConditions.elementToBeClickable(billingemailaddress)).sendKeys(billemailaddress);
		return this;
	}
	
	public CheckOutPage setbillingdetails( BillingDetails billingdetails)
	{
	return	enterbillingfirstname(billingdetails.getBillingfirstname()).
			enterbillinglastname(billingdetails.getBillinglasttname()).
			enterbillingcountry(billingdetails.getBillingcountry()).
			enterbillingaddress(billingdetails.getBillingaddress()).
			enterbillingcity(billingdetails.getBillingcity()).
			enterbillingstate(billingdetails.getBillingstate()).
			enterbillingzipcode(billingdetails.getBillingzipcode()).
			enterbillingemailaddress(billingdetails.getBillingemailaddress());
	}
	
	public void placingorder()
	{
		wait.until(ExpectedConditions.elementToBeClickable(placeorder)).click();		
	}
}
