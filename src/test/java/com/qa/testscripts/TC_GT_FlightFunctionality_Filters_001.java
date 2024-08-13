package com.qa.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_Filters_001 extends TestBase
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
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void Flights() throws InterruptedException
	{
	
		GTOR.getFlights().click();
		Thread.sleep(2000);
		
		GTOR.getFlightTrip().click();
		Thread.sleep(2000);
		
		GTOR.getRoundTripCity().click();
		Thread.sleep(3000);
		
		GTOR.getFlightAdults().click();
		Thread.sleep(3000);
		
		GTOR.getPerson2().click();
		Thread.sleep(3000);
		
		GTOR.getFlightEconomy().click();
		Thread.sleep(3000);
		
		GTOR.getFlightBusiness().click();
		Thread.sleep(2000);
		
	}

	
	
	
	

}
