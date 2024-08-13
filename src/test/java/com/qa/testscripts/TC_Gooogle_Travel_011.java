package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_Gooogle_Travel_011 extends TC_GT_FlightFunctionality_FlightFilters_001 
{
	
	@Test(priority = 1)
	public void Filters() throws InterruptedException
	{
		GTFOR.getFlightStop().click();
		Thread.sleep(3000);
		
		
		
	}

}
