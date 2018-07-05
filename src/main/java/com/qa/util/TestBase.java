package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static File file;
	public static WebDriverWait wait;
	
	public TestBase(){
		
		try{
			prop = new  Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fs);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void initialization(){
		
		if (prop.getProperty("browser") != null) {
			if (prop.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\src\\main\\java\\com\\qa\\executable\\geckodriver.exe");
				driver = new FirefoxDriver();
			//	log.debug("Firefox Launched!!");
			// log.debug("Firefox Launched!!");
			} else if (prop.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\executable\\chromedriver.exe");
				System.out.println("sssssssss");
				driver = new ChromeDriver();
			//	log.debug("Chrome Launched!!");
			} else if (prop.getProperty("browser").equals("ie")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\executable\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			//	log.debug("Chrome Launched!!");
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		//	log.debug("Navigated to : " + prop.getProperty("testSiteURL"));
			System.out.println("im_wait - " + TestUtil.IMPLICIT_WAIT_TIMEOUT);
			System.out.println("pg_wait - " + TestUtil.PAGE_LOAD_TIMEOUT);
			
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		//wait = new WebDriverWait(driver, 5);
		}

		
	}

}
