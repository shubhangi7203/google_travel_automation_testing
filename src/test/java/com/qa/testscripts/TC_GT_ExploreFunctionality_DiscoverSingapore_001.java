package com.qa.testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_GT_ExploreFunctionality_DiscoverSingapore_001 extends TC_GT_ExploreFunctionality_Location_002
{
	@Test(priority = 5)
	public void DiscoverSingapore() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
//		GTEOR.getGardenByTheBay().click();
//		Thread.sleep(2000);
		
		GTEOR.getViewThingsToDo().click();
		Thread.sleep(2000);
		
		Set<String> Allwindows = driver.getWindowHandles();
		Iterator<String> Iter =Allwindows.iterator();
		while(Iter.hasNext()) 
		{
			String windID =Iter.next();
			System.out.println(windID);
		}
		
		GTEOR.getSingaporeWebsite().click();
		Thread.sleep(2000);
		System.out.println("Clicked on the Singapore");
		
//		String WebsiteInfo =GTEOR.getSingaporeWebsite().getText();
//		System.out.printf("Information Of Singapore are :", WebsiteInfo);
//		Thread.sleep(2000);
		
		driver.quit();
	}
	

	
	
	

}
