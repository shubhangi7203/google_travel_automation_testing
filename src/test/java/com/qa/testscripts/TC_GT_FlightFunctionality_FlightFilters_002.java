package com.qa.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightFilters_002 extends TC_GT_FlightFunctionality_FlightFilters_001
{

	@Test(priority = 5)
	public void AirlineFilter() throws InterruptedException, IOException
	{
		GTFOR.getFlightAirlines().click();
		Thread.sleep(5000);
		
		GTFOR.getStarAirlines().click();
		Thread.sleep(3000);
		
//		GTFOR.getOnWorldAirlines().click();
//		Thread.sleep(3000);
		
	}
	
	@Test(priority = 6)
	public void BagFilter() throws InterruptedException, IOException
	{
		GTFOR.getFlightBag().click();
		Thread.sleep(3000);
		
		GTFOR.getFlightBag2().click();
		Thread.sleep(2000);
		
		GTFOR.getFlightBag2().click();
		Thread.sleep(2000);
		
	}
	
	

}
