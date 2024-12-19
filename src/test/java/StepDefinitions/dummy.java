package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DomainObjects.BillingDetails;
import PageObjectModel.CartPage;
import PageObjectModel.CheckOutPage;
import PageObjectModel.StorePage;
import PicoContainer.DI_PICO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dummy 
{
	public WebDriver ref;
	public BillingDetails billingdetails;
	
	public dummy(DI_PICO driver)
	{
		ref = driver.ref;
	}
	
	@Given("User in store page")
	public void user_in_store_page()
	{
	
	new StorePage(ref).url("https://askomdch.com/");
	ref.findElement(By.xpath("(//a[@class='menu-link'][normalize-space()='Store'])[1]")).click();
	}
	
	@When("user tries to add a {string} to cart")
	public void user_tries_to_add_a_to_cart(String productname)  
	{
	new StorePage(ref).addtocart(productname);
	new StorePage(ref).viewcart();
	}

	@Then("user should see a {int} {string} in the cart")
	public void user_should_see_a_in_the_cart(int quantity, String productname)
	{
	 CartPage cart = new CartPage(ref);
	 Assert.assertEquals(productname, cart.productname());
	 Assert.assertEquals(quantity, cart.productquantity());
	}
	
	@Given("User is in cart page")
	public void user_is_in_cart_page()  {
		
		new StorePage(ref).url("https://askomdch.com/");
		new StorePage(ref).storenavigation();
		new StorePage(ref).addtocart("Blue Shoes");
		new StorePage(ref).viewcart();
		new CartPage(ref).checkout();	
	}

	@When("user places a order with billing details") 
	public void user_places_a_order_with_billing_details(BillingDetails billingdetails){
		this.billingdetails = billingdetails;
		CheckOutPage checke = new CheckOutPage(ref);
		checke.setbillingdetails(billingdetails);
	}

	@Then("order is placed")
	public void order_is_placed() {
		new CheckOutPage(ref).placingorder();
	}
	
	@Given("User is in landing page and clicks Contact Us option")
	public void user_is_in_landing_page_and_clicks_contact_us_option() {
		
		new StorePage(ref).url("https://askomdch.com/");
		new StorePage(ref).contactusnavigation();
	}

	@When("User clicks Mens shoe")
	public void user_clicks_men_s_shoe() {
		new StorePage(ref).mensshoe();
	}

	@Then("Mens shoe page displays to add product in cart")
	public void men_s_shoe_page_displays_to_add_product_in_cart() {
		new StorePage(ref).addredshoetocartfromstore();
	}

	@And("product added in cart")
	public void product_added_in_cart()  {
		CartPage carte = new CartPage(ref);
		Assert.assertEquals("Red Shoes", carte.redshoeproductcheck());
	}
}
