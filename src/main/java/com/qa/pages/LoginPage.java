package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

//import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase{
	
	//Page factory -OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement signupBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement freecrmLogo;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);	

	}
	
	public  String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateLoginPageLogo(){
		return freecrmLogo.isDisplayed();
	}


	public void enterLoginCredential(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
	}

	public HomePage ClickLoginButton(){

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
		return new HomePage();
		
	}

}
