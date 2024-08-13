package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_Google_Travel_014 extends TC_Google_Travel_013
{
	@Test(priority = 4)
	public void SelectLang() throws InterruptedException
	{
		Js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		GTOR.getSelectLang().click();
		Thread.sleep(4000);
		
		GTOR.getHindi().click();
		Thread.sleep(3000);
		
	}

}
