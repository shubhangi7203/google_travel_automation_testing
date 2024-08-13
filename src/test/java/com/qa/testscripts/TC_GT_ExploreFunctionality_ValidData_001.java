package com.qa.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GT_ExploreFunctionality_ValidData_001 extends TestBase
{
	@Test
	public void main()throws InterruptedException, AWTException
	
	{
	
		boolean contains = driver.getCurrentUrl().contains("https://www.google.com/travel/");
		if(contains)
		{
			System.out.println("The user landed on Google Travel HomePage");
			Assert.assertTrue(contains);
		}
		else
		{
			System.out.println("The user Not landed on Google Travel HomePage");
			Assert.assertTrue(contains);
		}
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void Explore() throws InterruptedException
	{
	  GTOR.getExplore().click();
	  Thread.sleep(2000);
	  
	  GTOR.getRoundTrip().click();
	  Thread.sleep(4000);
	  
	  GTOR.getOneWayTrip().click();
	  Thread.sleep(4000);
	  
	  GTOR.getPersons().click();
	  Thread.sleep(3000);
	  
	  GTOR.getAdults().click();
	  Thread.sleep(3000);
	  
	  GTOR.getEconomy().click();
	  Thread.sleep(3000);
	  
	  GTOR.getFirstClass().click();
	  Thread.sleep(3000);
	  
	}
	
	

}
