package DomainObjects;

public class BillingDetails {
	
	public String billingfirstname;
	public String billinglasttname;
	public String billingcountry;
	public String billingaddress;
	public String billingcity;
	public String billingstate;
	public String billingzipcode;
	public String billingemailaddress;
	
	public BillingDetails(String billingfirstname, String billinglasttname, String billingcountry,
						String billingaddress, String billingcity, String billingstate, 
						String billingzipcode, String billingemailaddress) 
	{
		this.billingfirstname = billingfirstname;
		this.billinglasttname = billinglasttname;
		this.billingcountry = billingcountry;
		this.billingaddress = billingaddress;
		this.billingcity = billingcity;
		this.billingstate = billingstate;
		this.billingzipcode = billingzipcode;
		this.billingemailaddress = billingemailaddress;
	}
	
	public String getBillingfirstname() {
		return billingfirstname;
	}
	public void setBillingfirstname(String billingfirstname) {
		this.billingfirstname = billingfirstname;
	}
	public String getBillinglasttname() {
		return billinglasttname;
	}
	public void setBillinglasttname(String billinglasttname) {
		this.billinglasttname = billinglasttname;
	}
	public String getBillingcountry() {
		return billingcountry;
	}
	public void setBillingcountry(String billingcountry) {
		this.billingcountry = billingcountry;
	}
	public String getBillingaddress() {
		return billingaddress;
	}
	public void setBillingaddress(String billingaddress) {
		this.billingaddress = billingaddress;
	}
	public String getBillingcity() {
		return billingcity;
	}
	public void setBillingcity(String billingcity) {
		this.billingcity = billingcity;
	}
	public String getBillingstate() {
		return billingstate;
	}
	public void setBillingstate(String billingstate) {
		this.billingstate = billingstate;
	}
	public String getBillingzipcode() {
		return billingzipcode;
	}
	public void setBillingzipcode(String billingzipcode) {
		this.billingzipcode = billingzipcode;
	}
	
	public String getBillingemailaddress() {
		return billingemailaddress;
	}

	public void setBillingemailaddress(String billingemailaddress) {
		this.billingemailaddress = billingemailaddress;
	}

}
