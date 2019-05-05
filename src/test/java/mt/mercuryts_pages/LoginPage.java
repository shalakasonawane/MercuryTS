package mt.mercuryts_pages;

import java.io.IOException;

import mt.mercuryts.config.Config;
import mt.mercuryts.utility.Launch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration of username
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	//declaration of password
	
	@FindBy(how=How.XPATH ,using="//input[@name='password']")
	WebElement objPassword;
	
	//declaration of loginButton
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement objlogin;
	
	public void loadLoginPage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public String Enter_Username(String username)
	{
		objUsername.sendKeys(username);
		
		return username;
	}
	
	public String Enter_Password(String password)
	{
		objPassword.sendKeys(password);
		
		return password;
	}
	
	public void clickonlogin()
	{
		objlogin.click();
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
		
	}

}
