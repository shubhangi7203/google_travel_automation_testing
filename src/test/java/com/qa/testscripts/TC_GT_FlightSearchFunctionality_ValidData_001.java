package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_GT_FlightSearchFunctionality_ValidData_001 extends TC_GT_FlightFunctionality_Filters_001
{
	
	@Test(priority = 1)
	public void FlightsFromTo() throws InterruptedException
	{
		
		GTOR.getFlightFrom().sendKeys("Pune");
		Thread.sleep(3000);
		
		GTOR.getFlightPune().click();
		Thread.sleep(3000);
		
		GTOR.getFlightTo().sendKeys("Dubai");
		Thread.sleep(3000);
		
		
		GTOR.getFlightToDubai().click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void FlightDates() throws InterruptedException
	{
	
		GTOR.getDeparture().click();
		Thread.sleep(3000);
		
		GTOR.getDepartureDate27().click();
		Thread.sleep(3000);
		
		GTOR.getReturn5().click();
		Thread.sleep(3000);
		
		GTOR.getDone().click();
		Thread.sleep(3000);
		
		GTOR.getSearch().click();
		Thread.sleep(3000);
		
		System.out.println("Best Flights List.............");
		String BestFlights = GTOR.getBestFlight().getText();
		System.out.println(BestFlights);
		Thread.sleep(3000);
		
	}
	

}
