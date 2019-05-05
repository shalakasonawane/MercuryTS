package mt.mercuryts.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import mt.mercuryts.config.Config;

public class Launch {
	
	Properties prop=new Properties();
	
	public String open_browser(String browser) throws IOException
	{
		
		FileInputStream fis=new FileInputStream("E:\\selenium\\MavenProject\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		if(browser.equalsIgnoreCase("chrome"));
		{
				System.setProperty("webdriver.chrome.driver", prop.getProperty("chrome_exe_path"));
				Config.driver=new ChromeDriver();
				System.out.println("chrome open successfully");
		}
		
		
		return browser;
	}
	
	public String Enter_ApplicationURL(String url)
	{
		
		Config.driver.get(url);
		
		return url;
	}
	
	public void Maximize_browser()
	{
		Config.driver.manage().window().maximize();
	}

	
	public void pageloadwait()
	{
		Config.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	public static void main(String[] args) throws IOException {
	
		Launch l=new Launch();
		l.open_browser("chrome");
		l.Enter_ApplicationURL("http://newtours.demoaut.com/");
		l.Maximize_browser();
		l.pageloadwait();

	}
	
	

}
