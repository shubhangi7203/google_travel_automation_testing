package com.qa.testscripts;

import org.apache.poi.ss.formula.atp.Switch;
import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightBook_003 extends TC_GT_FlightFunctionality_FlightCheck_002
{
	@Test(priority = 4)
	public void FlightsBooking() throws InterruptedException
	{
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);	
		
		GTOR.getBookingWithSpice().click();
		Thread.sleep(3000);
		
		System.out.println("Flights Guidlines............ ");
		String Guidlines = GTOR.getMyFlight().getText();
		System.out.println(Guidlines);
		Thread.sleep(4000);
	}
	

}
