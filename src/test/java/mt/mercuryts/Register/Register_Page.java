package mt.mercuryts.Register;

import java.io.IOException;

import mt.mercuryts.config.Config;
import mt.mercuryts.utility.Launch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	
	//declaration of Register
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement objclickRegister;
	
	//declaration of firstname
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement objfirstname;
	
	//declaration of lastName
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement objlastname;
	
	//declaration of phoneno
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	WebElement objphone;
	
	//declaration of email
	
	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	WebElement objemail;
	
	//declaration of Address1
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	WebElement objaddress1;
	
	//declaration of address2
	
	@FindBy(how=How.XPATH,using="//input[@name='address2']")
	WebElement objaddress2;
	
	//declaration of city
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	WebElement objcity;
	
	//declaration of state
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	WebElement objstate;
	
	//declaration of postalcode
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	WebElement objpostalcode;
	
	
	//declaration of country
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	WebElement objcountry;
	
	//declaration of username
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	WebElement objusername;
	
	//declaration of password
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	//declaration of confirm password
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	WebElement objconfirmpassword;
	
	//declaration of submit
	@FindBy(how=How.XPATH,using="//input[@name='register']")
	WebElement objclickonsubmit;
	
	
	
	
	
	
	public void clickonRegister()
	{
		objclickRegister.click();
		
	}
	
	public String EnterFirstName(String fname)
	{
		objfirstname.sendKeys(fname);
		return fname;
		
	}
	
	public String EnterLastName(String lname)
	{
		
		objlastname.sendKeys(lname);
		return lname;
	}
	
	public String EnterPhoneno(String phone)
	{
		objphone.sendKeys(phone);
		return phone;
	}
	
	public String Enteremail(String email)
	{
		objemail.sendKeys(email);
		return email;
	}
	
	public String EnterAddress1(String address1)
	{
		
		objaddress1.sendKeys(address1);
		return address1;
	}
	
	public String EnterAddress2(String address2)
	{
		
		objaddress2.sendKeys(address2);
		return address2;
	}
	
	
	
	public String EnterCity(String city)

	{
		objcity.sendKeys(city);
		return city;
	}
	
	public String EnterState(String state)
	{
		objstate.sendKeys(state);
		return state;
	}
	
	public String EnterPostalcode(String postalcode)
	{
		objpostalcode.sendKeys(postalcode);
		return postalcode;
	}
	
	public String SelectCountry(String country)
	{
		
		Select cl=new Select(objcountry);
		cl.selectByVisibleText(country);;
		return country;
	}
	
	public String EnterUsername(String username)
	{
		objusername.sendKeys(username);
		return username;
	}
	
	public String EnterPassword(String password)
	{
		objpassword.sendKeys(password);
		return password;
	}
	
	public String EnterConfirmpassword(String confirmpassword)
	{
		objconfirmpassword.sendKeys(confirmpassword);
		return confirmpassword;
	}
	
	public void ClickonSubmit()
	{
		objclickonsubmit.click();
	}
	
	public void loadRegister()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	

	public static void main(String[] args) throws IOException {
		
		Launch l=new Launch();
		l.open_browser("chrome");
		l.Enter_ApplicationURL("http://newtours.demoaut.com/");
		l.Maximize_browser();
		
		Register_Page rp=new Register_Page();
		rp.loadRegister();
		rp.clickonRegister();
		
		rp.EnterFirstName("shalaka");
		rp.EnterLastName("Sonawane");
		rp.EnterPhoneno("7517639309");
		rp.Enteremail("shalakass.121@gmail.com");
		rp.EnterAddress1("Shivnagari Society");
		rp.EnterAddress2("Kotharud");
		rp.EnterCity("Pune");
		rp.EnterState("Maharashtra");
		rp.EnterPostalcode("401138");
		rp.SelectCountry("INDIA");
		rp.EnterUsername("shalakass");
		rp.EnterPassword("shalaka1990");
		rp.EnterConfirmpassword("shalaka1990");
		rp.ClickonSubmit();
		
		
		

	}

}
