package com.qa.testscripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_GT_HotelsFunctionality_Filters_001 extends TC_GT_HotelsFunctionality_ValidData_001
{
	@Test(priority=3)
	public void HotelsFunFilter() throws InterruptedException, AWTException
	{

		GTHOR.getCheckIn().click();
		Thread.sleep(3000);

		GTHOR.getCheckIn5().click();
		Thread.sleep(3000);
		System.out.println("13 December departure date has been selected");
		
		GTHOR.getCheckOut().click();
		Thread.sleep(3000);
		
		GTHOR.getDone().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	public void HotelsFunAdults() throws InterruptedException, AWTException
	{
		GTHOR.getAdults().click();
		Thread.sleep(2000);
		
		GTHOR.getAdult5().click();
		GTHOR.getAdult5().click();
		GTHOR.getAdult5().click();
		Thread.sleep(2000);
		
		GTHOR.getAdultDone().click();
		Thread.sleep(2000);
		
	}
	

}
