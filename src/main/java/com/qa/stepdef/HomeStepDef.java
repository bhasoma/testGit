package com.qa.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomeStepDef {

	WebDriver driver;
	 String Title ;
	
	/*
	 @Given("^User is Already on Home page$")
	 public void user_is_Already_on_Home_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:/sel-software/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	    driver.findElement(By.name("username")).sendKeys("sbhadra");
	    driver.findElement(By.name("password")).sendKeys("Test@123");
	    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		String Title = driver.getTitle();
		System.out.println("Home Page Title ------->" + Title);
		Assert.assertEquals("CRMPRO", Title);
		Thread.sleep(4000);
	}
	
	@When("^Contact Link is avialable$")
	public void contact_Link_is_avialable() throws InterruptedException {
		System.out.println("fffff -0");
		driver.wait(5000);
	    WebElement contactsLink = driver.findElement(By.xpath("//*[@id='navmenu']//a[text()='Contacts']"));
	    System.out.println("fffff");
	    Assert.assertEquals(true, contactsLink.isDisplayed());
	    System.out.println("fffff-9");
	    
	}

	@Then("^Click on New Contact Under Contact Link$")
	public void click_on_New_Contact_Under_Contact_Link() throws InterruptedException  {
		System.out.println("fffff -0");
		driver.switchTo().frame("mainpanel");
	    // Write code here that turns the phrase above into concrete actions
		WebElement menu = driver.findElement(By.xpath("//a[text()='Contacts']"));
	//	WebElement submenu = driver.findElement(By.xpath("//*[@id='navmenu']//li[contains(.,'Contacts')]//a[text(),'New Contact']"));
		WebElement submenu = driver.findElement(By.xpath("//a[text()='New Contact']"));
		
		Actions action= new  	Actions(driver);
	    action.moveToElement(menu).build().perform();
	    Thread.sleep(2000);
	    action.click(submenu).perform();
	}
	
	@Then("^Enter Firstname and Lastname$")
	public void enter_Firstname_and_Lastname() {
	    driver.findElement(By.xpath("//*[@id='first_name'])")).sendKeys("Test1");
	    driver.findElement(By.xpath("//*[@id='surname'])")).sendKeys("nna");
	   
	}

	@Then("^Click on Save button$")
	public void click_on_Save_button() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id='contactForm']//input[@value='Save']")).click();
		Thread.sleep(4000);
	    
	}

	@Then("^Verify New Contact created$")
	public void verify_New_Contact_created(){
	   System.out.println("// //*[@id='vSummary']/table/tbody/tr[1]/td/table/tbody//td[@class='datacardtitle']	");
	}
*/
}
