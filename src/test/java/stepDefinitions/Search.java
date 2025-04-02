package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.loginPage;

public class Search 
{   public HomePage hp ;
	WebDriver driver = null ;
	
	@Given("User opens the  web application")
	public void user_opens_the_web_application() 
	{
	    driver = DriverFactory.getDriver();
	    
	}

	@When("User enter  valid product {string} in the search fields")
	public void user_enter_valid_product_in_the_search_fields(String product) 
	{
	    hp = new HomePage(driver);
		hp.ClickOnEnterProductInSearchBar(product);
	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() 
	{
	   hp.clickOnSearchButton();
	}

	@Then("User should get displayed valid product")
	public void user_should_get_displayed_valid_product() 
	{
	    Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}

	@When("User enter invalid product {string} in the search fields")
	public void user_enter_invalid_product_in_the_search_fields(String product) 
	{   
		hp = new HomePage(driver);
		hp.ClickOnEnterProductInSearchBar(product);
		
	}

	@Then("User should get proper message about product")
	public void user_should_get_proper_message_about_product() 
	{
	    Assert.assertTrue(driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > p:nth-child(7)")).isDisplayed());
	    
	}

	@When("User enter {string} in the search fields")
	public void user_enter_in_the_search_fields(String product) 
	{
		hp = new HomePage(driver);
		hp.ClickOnEnterProductInSearchBar(product);
		
		
	}


}
