package com.qa.testscripts;

import java.awt.AWTException;
import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_GT_HotelsFunctionality_Filters_002 extends TC_GT_HotelsFunctionality_Filters_001
{
	@Test(priority=5)
	public void RatingFilter() throws InterruptedException, AWTException
	{
		GTHOR.getHotelRating().click();
		Thread.sleep(2000);
		
		GTHOR.getHotelRating().click();
		Thread.sleep(2000);
		
		GTHOR.getAmenities().click();
		Thread.sleep(2000);
		
		GTHOR.getAmenities().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=6)
	public void Amenities() throws InterruptedException
	{
		GTHOR.getFreeBreakFast().click();
		Thread.sleep(2000);
		
//		GTHOR.getRestaurant().click();
//		Thread.sleep(2000);
		
		GTHOR.getPool().click();
		Thread.sleep(2000);
	}
	
	//@Test(priority=7)
	public void Price() throws InterruptedException
	{
		GTHOR.getPrice().click();
		Thread.sleep(2000);
		
		GTHOR.getPrice().click();
		Thread.sleep(2000);
		
		WebElement slider = GTHOR.getHotelPrice();
		
		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(90,0).build().perform();
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 8)
	public void HotelStar() throws InterruptedException, IOException
	{
		GTHOR.getHotelStars().click();
		Thread.sleep(2000);
		
//		GTHOR.getHotelStars().click();
//		Thread.sleep(2000);
//		
//		GTHOR.getStar3().click();
//		Thread.sleep(2000);
//		GTHOR.getStar4().click();
//		Thread.sleep(2000);
	}
	
	@Test(priority = 9)
	public void HotelResult() throws InterruptedException, IOException
	{
		GTHOR.getHotelResult().click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 10)
	public void HotelDirections() throws InterruptedException, IOException
	{
		GTHOR.getHotelDirections().click();
		Thread.sleep(2000);
	}
	

	

}
