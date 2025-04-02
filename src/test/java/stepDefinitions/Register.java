package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.RegisterPage;


public class Register 
{
	WebDriver driver= null ;
	public RegisterPage rp ;
	
	@Given("User navigates the register page")
	public void User_navigates_the_register_page()
	{
		driver = DriverFactory.getDriver();
		HomePage hp= new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnRegisterButton();
		
	}
	@When("User enters the details below fields")
	public void user_enters_the_details_below_fields(DataTable dataTable) 
	{
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    rp= new RegisterPage(driver);
	    rp.enterTheFirstName(dataMap.get("firstName"));
	    
		rp.enterTheLastName(dataMap.get("lastName"));
		rp.enterTheEmial(dataMap.get("emailId"));
		rp.enterThePhoneNumber(dataMap.get("telephone"));
		rp.enterthePassword(dataMap.get("password"));
		
	}

	@When("User click on the privacy policy")
	public void user_click_on_the_privacy_policy() 
	{
	    rp.clickOnprivacyPolicy();
	}

	@When("User click on the continue button")
	public void user_click_on_the_continue_button() 
	{
	    rp.clickOnContinuebutton();
	}

	@Then("User should get validation message accounts has created successfully")
	public void user_should_get_validation_message_accounts_has_created_successfully() 
	{
	   Assert.assertTrue(driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2)")).isDisplayed());
	   System.out.println("Congratulations! Your new account has been success");
	}

	@When("User selects the yes button of the newsletters")
	public void user_selects_the_yes_button_of_the_newsletters() 
	{
	    rp.clickOnnewsLetter();
	}

}
