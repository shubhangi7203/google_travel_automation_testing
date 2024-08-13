package com.qa.testscripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class TC_Google_Travel_013 extends TestBase
{
	@Test
	
	public void Search() throws InterruptedException, AWTException
	{
		  //driver.get("https://www.google.com/travel/");
		
		  boolean contains = driver.getCurrentUrl().contains("https://www.google.com/travel/");
		  if(contains)
		    {
		        System.out.println("The user is landed on google page");
		    }
		    else
		    {
		        System.out.println("The user is not landed on google page");
		    }
		  Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void Menu() throws InterruptedException
	{
		GTOR.getMenu().click();
		Thread.sleep(4000);
		
		GTOR.getHelpButton().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void HelpTopic() throws InterruptedException
	{
		Js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		
		GTOR.getHelpTopic().click();
		Thread.sleep(4000);
		
		GTOR.getHelpQuestion().click();
		Thread.sleep(4000);
		
		System.out.println("Booking Hotels In Google.............");
		String BookingHotels = GTOR.getHelpAns().getText();
		System.out.println(BookingHotels);
		Thread.sleep(3000);
	}
	

}
