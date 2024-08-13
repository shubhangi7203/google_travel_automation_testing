package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightFilters_004 extends TC_GT_FlightFunctionality_FlightFilters_001
{
	@Test(priority = 9)
	public void EmisionsFilter() throws InterruptedException, IOException
	{
		GTFOR.getFlightEmisions().click();
		Thread.sleep(3000);
		
		GTFOR.getLessEmisions().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 10)
	public void CoonectingAirportFilter() throws InterruptedException, IOException
	{
		GTFOR.getConnectingAirport().click();
		Thread.sleep(3000);

		WebElement slider = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[1]/div/div[3]/div/div/div[3]"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(-60,0).build().perform();
		Thread.sleep(5000);
	}
	
	@Test(priority = 11)
	public void DurationFilter() throws InterruptedException, IOException
	{
		GTFOR.getDurationFilter().click();
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[2]/div/div/div[2]"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(-50,0).build().perform();
		Thread.sleep(5000);
	}
	
	
	
	

}
