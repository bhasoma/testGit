package com.qa.util;


public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT =30;
	public static long IMPLICIT_WAIT_TIMEOUT =20;
	
	public static void switchToFrame(String frm){
		driver.switchTo().frame(frm);
	}

}
