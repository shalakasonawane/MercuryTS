package mt.mercuryts.bookflights;

import java.io.File;
import java.io.IOException;

import mt.mercuryts.config.Config;
import mt.mercuryts.utility.Launch;
import mt.mercuryts_pages.LoginPage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
	
	//declaration of flightlink
	
	@FindBy(how=How.LINK_TEXT,using="Flights")
	WebElement objckickonflights;
	
	//declaration of type
	@FindBy(how=How.XPATH,using="//input[@value='roundtrip']")
	WebElement objtype;
	
	//declaration of passengers
	@FindBy(how=How.XPATH,using="//select[@name='passCount']")
	WebElement objpassengers;
	
	//delcration of departure
	@FindBy(how=How.XPATH,using="//select[@name='fromPort']")
	WebElement objdeparture;
	
	//declaration of month
	@FindBy(how=How.XPATH,using="//select[@name='fromMonth']")
	WebElement objmonth;
	
	//declaration of date
	@FindBy(how=How.XPATH,using="//select[@name='toDay']")
	WebElement objdate;
	
	//declaration of arriving
	@FindBy(how=How.XPATH,using="//select[@name='toPort']")
	WebElement objarriving;
	
	//declaration of returing month
	
	@FindBy(how=How.XPATH,using="//select[@name='toMonth']")
	WebElement objreturingmonth;
	
	//declaration of returing date
	
		@FindBy(how=How.XPATH,using="//select[@name='toDay']")
		WebElement objreturingdate;
		
	
	
	//declaration of class
	@FindBy(how=How.XPATH,using="//input[@value='First']")
	WebElement objclass;
	
	//declaration of Airline
		@FindBy(how=How.XPATH,using="//select[@name='airline']")
		WebElement objairline;
		
		//declaration of continue
		@FindBy(how=How.XPATH,using="//input[@name='findFlights']")
		WebElement objcontinue;
		
		public void clickonflights()
		{
			objckickonflights.click();
		}
		
		public void selecttype()
		{
			WebElement type=objtype;
			type.click();
		}
		
		public void selectPassengers()
		{
		
			Select passengers=new Select(objpassengers);
			passengers.selectByValue("2");
		}
		
		public void departurefrom()
		{
			Select depr=new Select(objdeparture);
			depr.selectByIndex(2);
		}
		
		public void selectMonth()
		{
			Select month=new Select(objmonth);
			month.selectByIndex(3);
		}
		
		public void selectdate()
		{
			Select month=new Select(objdate);
			month.selectByIndex(16);
		}
		
		public void arrivingin()
		{
			Select toport=new Select(objarriving);
			toport.selectByIndex(4);
		}
		
		public void returningmonth()
		{
			Select returnmonth=new Select(objreturingmonth);
			returnmonth.selectByIndex(5);
		}
		
		public void returningdate()
		{
			Select returndate=new Select(objreturingdate);
			returndate.selectByIndex(6);
		}
		
		public void selectclass()
		{
			objclass.click();
		}
		
		public void selectpreferences()
		{
			Select spref=new Select(objairline);
			spref.selectByIndex(2);
			
		}
		
		public void clickoncontinue()
		{
			objcontinue.click();
		}
		
		public void loadflightpage()
		{
			PageFactory.initElements(Config.driver, this);
		}
		
		//page2
		@FindBy(how=How.XPATH,using="//input[@name='outFlight']")
		WebElement objdepf;
		public void SelectDepartflight()
		{
			objdepf.click();
		}
		
		@FindBy(how=How.XPATH,using="//input[@name='inFlight']")
		WebElement objreturnf;
		public void selectreturnf()
		{
			objreturnf.click();
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@name='reserveFlights']")
		WebElement objcontinuef;
		public void clickonflightcontinue()
		{
			objcontinuef.click();
		}
		
		//Declaration of book a flight page
		
		//declaration of passenger 1 fname
		@FindBy(how=How.XPATH,using="//input[@name='passFirst0']")
		WebElement objfname1;
		
		public String enterfirstnamep1(String fname)
		{
			objfname1.sendKeys(fname);
			return fname;
			
		}
		
		
		//declaearion of passenger 1 lastname
		@FindBy(how=How.XPATH,using="//input[@name='passLast0']")
		WebElement objp1lastname;
		
		public String enterlastnamep1(String lastname)
		{
			objp1lastname.sendKeys(lastname);
			return lastname;
		}
		
		//declaration of passenger 1 meal preferences
		
		@FindBy(how=How.XPATH,using="//select[@name='pass.0.meal']")
		WebElement objp1meal;
		
		public void Selectmealp1()
		{
			Select meal=new Select(objp1meal);
			meal.selectByVisibleText("Hindu");
		}
		
		//declaration of passenger 2 fname
		@FindBy(how=How.XPATH,using="//input[@name='passFirst1']")
		WebElement objp2fname;
		
		public String enterp2fname(String fname)
		{
			objp2fname.sendKeys(fname);
			return fname;
		}
		
		//declaration of passenger 2 lastname
		@FindBy(how=How.XPATH,using="//input[@name='passLast1']")
		WebElement objp2lname;
		
		public String enterp2lname(String lname)
		{
			objp2lname.sendKeys(lname);
			return lname;
		}
		
		//delcration of meal for passenger2
		@FindBy(how=How.XPATH,using="//select[@name='pass.1.meal']")
		WebElement objmealp2;
		public void selectmealp2()
		{
			Select meal=new Select(objmealp2);
			meal.selectByVisibleText("Hindu");
		}
		
		//declaration of credit card
		
		//declaration of cardtype
		@FindBy(how=How.XPATH,using="//select[@name='creditCard']")
		WebElement objcardtype;
		
		public void selectcardtype()
		{
			Select card=new Select(objcardtype);
			card.selectByVisibleText("MasterCard");
		}
		
		//declaration of cardnumber
		@FindBy(how=How.XPATH,using="//input[@name='creditnumber']")
		WebElement objcardnumber;
		
		public String Entercardnumber(String cnumber)
		{
			objcardnumber.sendKeys(cnumber);
			return cnumber;
			
		}
		
		//delcration of card expirydate
		@FindBy(how=How.XPATH,using="//select[@name='cc_exp_dt_mn']")
		WebElement objcardexpdate;
		
		public void cardexpdate()
		{
			Select date=new Select(objcardexpdate);
			date.selectByVisibleText("03");
		}
		
		//declaration of card expiry year
		@FindBy(how=How.XPATH,using="//select[@name='cc_exp_dt_yr']")
		WebElement objcardeyear;
		public void selectcardyear()
		{
			Select year=new Select(objcardeyear);
			year.selectByVisibleText("2010");
		}
		
		//declaration of fname
		@FindBy(how=How.XPATH,using="//input[@name='cc_frst_name']")
		WebElement objcfname;
		
		public String entercardfname(String fname)
		{
			objcfname.sendKeys(fname);
			return fname;
		}
		
		//declaration of card middle name
		@FindBy(how=How.XPATH,using="//input[@name='cc_mid_name']")
		WebElement objcmname;
		public String entercmname(String middlen)
		{
			objcmname.sendKeys(middlen);
			return middlen;
		}
		
		//declaration of card lastname
		@FindBy(how=How.XPATH,using="//input[@name='cc_last_name']")
		WebElement objclname;
		public String entercardlname(String lname)
		{
			objclname.sendKeys(lname);
			return lname;
		}
		
		//declaration of Billing Address
		@FindBy(how=How.XPATH,using="//input[@name='billAddress1']")
		WebElement objbaddr;
		public String Enterbillingaddr(String addr)
		{
			objbaddr.sendKeys(addr);
			return addr;
		}
		
		//declaration of city
		@FindBy(how=How.XPATH,using="//input[@name='billCity']")
		WebElement objbcity;
		public String Enterbcity(String bcity)
		{
			objbcity.sendKeys(bcity);
			return bcity;
		}
		
		//declaration of bstate
		@FindBy(how=How.XPATH,using="//input[@name='billState']")
		WebElement objbstate;
		public String Enterbstate(String bstate)
		{
			objbstate.sendKeys(bstate);
			return bstate;
		}
		
		//declaration of baddrPostalcode
		@FindBy(how=How.XPATH,using="//input[@name='billZip']")
		WebElement objbaddrpostal;
		public String enterbaddrpostalcode(String postalcode)
		{
			objbaddrpostal.sendKeys(postalcode);
			return postalcode;
		}
		
		//declaration of bcountry
		@FindBy(how=How.XPATH,using="//select[@name='billCountry']")
		WebElement objbcountry;
		public void selectbcountry()
		{
			Select bcountry=new Select(objbcountry);
			bcountry.selectByVisibleText("UNITED STATES ");
		}
		
		//declaration of deliveryAddress
		@FindBy(how=How.XPATH,using="//input[@name='ticketLess']")
		WebElement objdaddr;
		public void Clickondeliveryaddr()
		{
			objdaddr.isSelected();
		}
		
		//declaration of click on Secure purchase
		@FindBy(how=How.XPATH,using="//input[@name='buyFlights']")
		WebElement objclickonsecurepurchase;
		public void clickonsecurepurchase()
		{
			objclickonsecurepurchase.click();
		}
		
//declaration of louout
		@FindBy(how=How.XPATH,using="//img[@src='/images/forms/Logout.gif']")
		WebElement objlouout;
		public void logout()
		{
			objlouout.click();
		}
		
		public static void main(String[] args) throws IOException {
		Launch l=new Launch();
		l.open_browser("chrome");
		l.Enter_ApplicationURL("http://newtours.demoaut.com/");
		l.Maximize_browser();
		
		LoginPage lg=new LoginPage();
		lg.loadLoginPage();
		lg.Enter_Username("suvidyap1");
		lg.Enter_Password("P@ssword1");
		lg.clickonlogin();
		
		BookFlight bf=new BookFlight();
		bf.loadflightpage();
		bf.clickonflights();
		bf.selecttype();
		bf.selectPassengers();
		bf.departurefrom();
		bf.selectMonth();
		bf.selectdate();
		bf.arrivingin();
		bf.returningmonth();
		bf.returningdate();
		bf.selectpreferences();
		bf.clickoncontinue();
		bf.SelectDepartflight();
		bf.selectreturnf();
		bf.clickonflightcontinue();
		bf.enterfirstnamep1("Shalaka");
		bf.enterlastnamep1("Sonawane");
		bf.Selectmealp1();
		bf.enterp2fname("Sagar");
		bf.enterp2lname("Sonawane");
		bf.selectmealp2();
		bf.selectcardtype();
		bf.Entercardnumber("74586954875");
		bf.cardexpdate();
		bf.selectcardyear();
		bf.entercardfname("shalaka");
		bf.entercmname("Sagar");
		bf.entercardlname("sonawane");
		bf.Enterbillingaddr("1325 Borregas Ave.");
		bf.Enterbcity("Sunnyvale");
		bf.Enterbstate("CA");
		bf.enterbaddrpostalcode("94089");
		bf.selectbcountry();
		bf.Clickondeliveryaddr();
		bf.clickonsecurepurchase();
		File src=((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Bookticketscreenshot\\booktk.png"));
		bf.logout();
				
		
		
		
		
	

	}

}
