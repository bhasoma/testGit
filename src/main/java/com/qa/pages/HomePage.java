package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;


public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User: som B')]")
	WebElement userLabel;

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;

	public String validateHomePageTitle(){
	//	Thread.sleep(3000);
		return driver.getTitle();
		
	}
	
	public boolean validateHomePageUser() throws InterruptedException{
		/*Thread.sleep(3000);
		if (userLabel.isDisplayed() )
			System.out.println("True");*/
		TestUtil.switchToFrame("mainpanel");
		return userLabel.isDisplayed();
		
	}
	
	public boolean validateCorrectUserName() throws InterruptedException{
		Thread.sleep(3000);
		TestUtil.switchToFrame("mainpanel");
		return userLabel.isDisplayed();
	}

}
