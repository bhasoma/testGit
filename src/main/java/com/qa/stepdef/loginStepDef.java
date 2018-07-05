package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginStepDef extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	@Before
	public void user_open_browser()  {
	    TestBase.initialization();
	    loginPage = new LoginPage();    
	}
	
	@After
	public void close_browser()  {
	    driver.quit();  
	}
	
	@Given("^user is in login page$")
	public void user_is_in_login_page() {
	    String title = loginPage.validateLoginPageTitle();
	    Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}

	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String username, String password){
		loginPage.enterLoginCredential(username, password);
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
	   homePage = loginPage.ClickLoginButton();
	}

	@Then("^validate home page title$")
	public void validate_home_page_title()  {
	    String title = homePage.validateHomePageTitle();
	    
	    Assert.assertEquals("CRMPRO", title);
	}

	@Then("^validate logged in user$")
	public void validate_logged_in_user() throws InterruptedException {
	//    boolean flag = homePage.validateHomePageUser();
		boolean flag = homePage.validateCorrectUserName();
	    Assert.assertTrue(flag);
	}

	
}
