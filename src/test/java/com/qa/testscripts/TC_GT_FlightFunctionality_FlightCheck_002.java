package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightCheck_002 extends TC_GT_FlightSearchFunctionality_ValidData_001
{
	
	@Test(priority = 3)
	public void FlightsCheck() throws InterruptedException
	{
		GTOR.getFlightCheck().click();
		Thread.sleep(6000);
		
		GTOR.getFlightBooking().click();
		Thread.sleep(5000);
		
	}

	
	

	
	
	
	
}
