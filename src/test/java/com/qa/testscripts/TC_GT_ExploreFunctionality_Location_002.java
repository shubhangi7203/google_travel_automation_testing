package com.qa.testscripts;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_GT_ExploreFunctionality_Location_002 extends TC_GT_ExploreFunctionality_ValidData_001
{
	
	@Test(priority = 2)
	public void Location() throws InterruptedException
	{
//		GTOR.getWhereFrom().click();
//		Thread.sleep(3000);
		GTOR.getPune().clear();
		GTOR.getPune().sendKeys("Pune");
		Thread.sleep(4000);
		
		GTOR.getPuneIA().click();
		Thread.sleep(4000);
		
//		GTOR.getSingapore().sendKeys("Singapore");
//		Thread.sleep(4000);
	}
	
	@Test(priority =3)
	public void Location1() throws InterruptedException
	{
		GTOR.getSingapore().sendKeys("Singapore");
		Thread.sleep(4000);
		
		GTOR.getSingaporeIA().click();
		Thread.sleep(5000);
	}
	
	@Test(priority =4)
	public void WhenToVist() throws InterruptedException
	{
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);	
	
		System.out.println("When To Visit.............");
		String WhenTOGo = GTOR.getWhenToVist().getText();
		System.out.println(WhenTOGo);
		Thread.sleep(3000);
	}
	

	

}
