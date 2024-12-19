package CustomType;

import java.util.Map;

import DomainObjects.BillingDetails;
import io.cucumber.java.DataTableType;

public class CustomDataType {
	
	@DataTableType
	
	public BillingDetails billingdetails(Map<String , String> entry)
	{
		return new BillingDetails(entry.get("firstname"), entry.get("lastname"), entry.get("country_region"),
				entry.get("street_address"), entry.get("town_city"), entry.get("state"), entry.get("zip"), 
				entry.get("emailaddress"));
	}
	
}
