package stepDefinitions;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.loginPage;
import utills.CommonUtills;

public class Login 
{
	WebDriver driver  ;
	public loginPage lp = null ;
	
	@Given("User navigates the login page")
	public void user_navigates_the_login_page() 
	{
		     driver = DriverFactory.getDriver();
		     HomePage hp= new HomePage(driver);
		     hp.clickOnMyAccount();
		     hp.ClickOnLoginButton();
		     
		     
		       
	}

	@When("^User enters the valid email id (.+) in the mail id field$")
	public void user_enters_the_valid_email_id_in_the_mail_id_field(String Emailid) 
	{
	    lp = new loginPage(driver);
		lp.enterTheEmail(Emailid);
	     
	}
 
	@When("^User enters the valid password (.+) in the password field$")
	public void user_enters_the_valid_password_in_the_password_field(String Password) 
	{
		lp.enterThePassword(Password);
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() 
	{
	    lp.clickontheLoginbutton();
	}

	@Then("User should be login successfully")
	public void user_should_be_login_successfully() 
	{
	    Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	    System.out.println("Edit your account information is Displaying");
	}

	@When("User enters the invalid email id  in the mail id field")
	public void user_enters_the_invalid_email_id_in_the_mail_id_field() 
	{
		    lp = new loginPage(driver);
		    lp.enterTheEmail(CommonUtills.getEmailTimeStamp());
	}

	@Then("User should get proper warning message")
	public void user_should_get_proper_warning_message() 
	{
	    driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
	    System.out.print("Warning: No match for E-Mail Address and/or Password is Displaying");
		
	}

	@When("User enters the invalid password {string} in the password field")
	public void user_enters_the_invalid_password_in_the_password_field(String inPassword) 
	{
		lp.enterThePassword(inPassword);
	}

	@When("User enters the do not email id {string} in the mail id field")
	public void user_enters_the_do_not_email_id_in_the_mail_id_field(String BEmailid) 
	{
		lp = new loginPage(driver);
		lp.enterTheEmail(BEmailid);
	}

	@When("User enters the do not password {string} in the password field")
	public void user_enters_the_do_not_password_in_the_password_field(String BPassword) 
	{
		lp = new loginPage(driver);
		lp.enterTheEmail(BPassword);
	}
    

}
