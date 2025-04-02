package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
   WebDriver driver = null ;
	
  public loginPage(WebDriver driver)
  {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
  }

	
//========================================================================================================================
//methods	
	@FindBy(id="input-email")
	private WebElement clickOnEmailField ;
	
	@FindBy(id="input-password")
	private WebElement clickOnPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement clickLoginbutton;
	
	
	
//========================================================================================================================
// Actions
	public void enterTheEmail(String Emailid)
	{
		clickOnEmailField.sendKeys(Emailid);
	}
	
	public void enterThePassword(String Password)
	{
		clickOnPassword.sendKeys(Password);
	}
	
	public void clickontheLoginbutton()
	{
		clickLoginbutton.click();
	}
	
}
