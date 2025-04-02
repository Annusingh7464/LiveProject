package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import hooks.MyHooks;import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{
	public static WebDriver driver = null ;
	
	public static void initiliazeBrowser(String browserName)
	{
	  if(browserName.equals("chrome"))
	  {
		   driver = new ChromeDriver();
	  }
	  else if(browserName.equals("fireFox"))
	  {
		  driver = new FirefoxDriver();
		  
	  }
	  else if(browserName.equals("safari"))
	  {
		   driver = new SafariDriver();
	  }
	  else
	  {
		  System.out.println("Browser has not founded");
	  }
	   
	
	}
	public static WebDriver getDriver()
	{
		return driver ;
	}
	
	
	
}
