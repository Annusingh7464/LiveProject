package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utills.CommonUtills;
import utills.UtilitesElement;

public class HomePage 
{
	WebDriver driver ;
	private UtilitesElement utilitesElement ;
	

	public HomePage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver,this);
		utilitesElement = new UtilitesElement(driver);
		
	}
//===========================================================================================================
// methods
	@FindBy(xpath="//span[normalize-space()='My Account']")
	private WebElement MyAccountMenu;
	
	@FindBy(linkText="Login")
	private WebElement LoginButton;
	
	@FindBy(linkText="Register")
	private WebElement RegisterButton ;
	
	@FindBy(name="search")
	private WebElement EnterProductInSearchBar;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement serchButton;
	
	
	



//===========================================================================================================
// Actions
 public void clickOnMyAccount()
 {
	 utilitesElement.clickOnElement(MyAccountMenu,15);
 }
 
 public void ClickOnLoginButton()
 {
	 utilitesElement.clickOnElement(LoginButton,15);
 }
 public void clickOnRegisterButton()
 {
	 RegisterButton.click();
 }
 public void ClickOnEnterProductInSearchBar(String Product)
 {
	 EnterProductInSearchBar.sendKeys(Product);
 }
 public void clickOnSearchButton()
 {
	 serchButton.click();
 }
}