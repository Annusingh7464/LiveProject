package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
  
	WebDriver driver ;
	public RegisterPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
//===============================================================================================================
//Methods
	@FindBy(name="firstname")   
	private WebElement clickOnfirstName;
	
	@FindBy(name="lastname")
	private WebElement clickonlastName;
	
	@FindBy(name="email")
	private WebElement clickonemail;
	
	@FindBy(name="telephone")
	private WebElement clickontelephone;
	
	@FindBy(id="input-password")
	private WebElement clickOnPassword;
	
	@FindBy(name="agree")
	private WebElement PrivacyPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(name="newsletter")
	private WebElement newsletterbutton ;
	
	
//=================================================================================================
//Actions
	
	public void enterTheFirstName(String firstName)
	{
		clickOnfirstName.sendKeys(firstName);
	}
	public void enterTheLastName(String lastName)
	{
		clickonlastName.sendKeys(lastName);
	}
	public void enterTheEmial(String Email)
	{
		clickonemail.sendKeys(Email);
	}
	
	public void enterThePhoneNumber(String number)
	{
		clickontelephone.sendKeys(number);
	}
	
	public void enterthePassword(String password)
	{
		clickOnPassword.sendKeys(password);
	}
	
	public void clickOnprivacyPolicy()
	{
		PrivacyPolicy.click();
	}
	
	public void clickOnContinuebutton()
	{
		continueButton.click();
	}
	public void clickOnnewsLetter()
	{
		newsletterbutton.click();
	}
}
