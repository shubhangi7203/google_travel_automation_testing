package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightFilters_001 extends TC_GT_FlightSearchFunctionality_ValidData_001
{
	
	@Test(priority = 3)
	public void FlightFilters() throws InterruptedException, IOException
	{
		GTFOR.getStopFilter().click();
		Thread.sleep(4000);
		
		GTFOR.getOkButton().click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void Filters() throws InterruptedException
	{
		GTFOR.getFlightStop().click();
		Thread.sleep(3000);
		
		GTOR.getStop2().click();
		Thread.sleep(3000);	
	}
	
	
	

}
