package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class TC_GT_SearchFunctionality_003 extends TestBase
{
	@Test
	
	public void main() throws InterruptedException, AWTException
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
	
	@Test(priority= 1)
	public void SearchFunctionality() throws InterruptedException, AWTException
	{
		 GTOR.getSearchTextField().sendKeys("Singapore");
		  Thread.sleep(2000);
		  
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(5000);
	}
	
	@Test(priority=2)
	
	public void city() throws InterruptedException
	{
		// Call the JavascriptExecutor methods
		Js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		GTOR.getSentosaCity().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void CityLink() throws InterruptedException
	{
		// Call the JavascriptExecutor methods
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);	
		
		GTOR.getSentosaLink().click();
		Thread.sleep(4000);
		
		GTOR.getAcceptAll().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=4)
	
	public void cityDetails() throws InterruptedException
	{
		System.out.println("Description of Sight.............");
		String Description= GTOR.getCityDetails().getText();
		System.out.println(Description);
		Thread.sleep(4000);
		
	}

}
