package MavenPkg.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class MavenDemo {
	
	public WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver.get("http://www.newtours.demoaut.com/");
  }

  @BeforeSuite
  public void Open_browser() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdata\\chromedriver_win32 (8)\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  
 @Test
 public void Loginwithvaliduser()
 {
	 
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 driver.findElement(By.linkText("SIGN-OFF")).click();
	 
	 
 }

}
