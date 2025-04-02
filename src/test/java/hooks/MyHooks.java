package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ConfigReader.ConfigClass;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyHooks 
{
	 WebDriver driver = null;

    @Before
	public void setUp()
	{
    	Properties prop = ConfigClass.getURLData();
    	
    	DriverFactory.initiliazeBrowser(prop.getProperty("browserName"));
    	driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get(prop.getProperty("url"));
		 
    	
    	
	}
	
    @After
	public void teardown(Scenario scenario)
	{
    	 String ScenarioName = scenario.getName().replaceAll(" ","_");
    	 
    	 if(scenario.isFailed())
    	 {
    		     byte[] screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		     scenario.attach(screenshots,"image/png", ScenarioName);
    	 }
		
    	driver.quit();
	}
	
	
	
	
}
