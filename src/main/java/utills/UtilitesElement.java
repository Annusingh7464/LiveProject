package utills;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilitesElement 
{
  WebDriver driver ;
  public UtilitesElement(WebDriver driver)
  {
	  this.driver=driver;
  }
	
	
	public void clickOnElement(WebElement element, long durationInSeconds)
	{
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		  WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		  webElement.click();
	}
	
	public void typeTextintoElement(WebElement element, String TextToBeTyped, long durationofSeconds)
	{
		         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationofSeconds));
		         WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		         webElement.click();
		         webElement.clear();
		         webElement.sendKeys(TextToBeTyped);
		         
	}
	public void selectOptionDropdown(WebElement element, long durationOfSeconds)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationOfSeconds));
		WebElement webelement = wait.until(ExpectedConditions.elementToBeClickable(element));
		Select select = new Select(webelement);
		
		
	}
	public void acceptAlert(long durationOfSeconds)
	{
		Alert alert = waitForAlert(durationOfSeconds);
		alert.accept();
	}
	
	public void dissmissAlert(long durationOfSeconds)
	{
		Alert alert = waitForAlert(durationOfSeconds);
		alert.dismiss();
	}
	public Alert waitForAlert(long durationOfSeconds)
	{
		Alert alert = null;
		try {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationOfSeconds));
		 alert = wait.until(ExpectedConditions.alertIsPresent());
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		 
		 return alert ;
		 
	}
	
	public void mouseHoverAndClick(WebElement element , long durationInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		WebElement WebElement = wait.until(ExpectedConditions.visibilityOf(element));
		Actions action = new Actions(driver);
		action.moveToElement(WebElement).click().build().perform();
		 
	}
	
	public void javaScriptClick(WebElement element, long durationInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		WebElement WebElement = wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();",WebElement);
	}
}