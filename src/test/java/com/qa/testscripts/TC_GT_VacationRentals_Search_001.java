package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GT_VacationRentals_Search_001 extends TestBase
{
	@Test
	public void main()throws InterruptedException, AWTException
	
	{
	
	//User is landed on Google travel page.
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

//In first method(User landed on vacation rentals page).

	@Test(priority = 1)
	public void VactionRentals() throws InterruptedException
	{
		GTOR.getVacationRentals().click();
		Thread.sleep(6000);
	}
	
//In second method (user search destination)
	
	@Test(priority = 2)
	public void SearchTextField1() throws InterruptedException, AWTException
	{
			GTOR.getSearchHotelTextField().clear();
			GTOR.getSearchHotelTextField().sendKeys("hyderabad");
			Thread.sleep(5000);
			
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
	}
//		
////In Third method(The user should be able to search respective Vacation Rentals in the given fillers)
////first filter is Date
//	
//	@Test(priority = 3)
//	public void Date() throws InterruptedException
//	{
//		GoogleOR.getDate().click();
//		Thread.sleep(6000);
//		GoogleOR.getSelectDate().click();
//		Thread.sleep(5000);
//		GoogleOR.getCheckOut().click();
//		Thread.sleep(5000);
//		GoogleOR.getDone().click();
//		Thread.sleep(5000);
//		
//	}

}
