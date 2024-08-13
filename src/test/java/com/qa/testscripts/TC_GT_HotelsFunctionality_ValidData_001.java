package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_GT_HotelsFunctionality_ValidData_001 extends TestBase
{
	
@Test
	public void Browser() throws InterruptedException, AWTException
	{
		  //driver.get("https://www.google.com/travel/");
		
		  boolean contains = driver.getCurrentUrl().contains("https://www.google.com/travel/");
		  if(contains)
		    {
		        System.out.println("The user is landed on google Hotel page");
		    }
		    else
		    {
		        System.out.println("The user is not landed on google Hotel page");
		    }
		  Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void HotelsFunctionality() throws InterruptedException, AWTException
	{
		
		GTHOR.getHotelsFun().click();
		Thread.sleep(4000);
		
		GTHOR.getHotelsSearchFun().clear();
		Thread.sleep(3000);
		GTHOR.getHotelsSearchFun().sendKeys("pondicherry");
		Thread.sleep(5000);
		
		List<WebElement> allItems = GTHOR.getAllItems();
		int count = allItems.size();
		System.out.println("The total number of Items = "+count);
		for(WebElement item : allItems)
		{
			System.out.println(item.getText());
		}
		
		Thread.sleep(2000);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		

	}



}
