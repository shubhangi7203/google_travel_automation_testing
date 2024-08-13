package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_GT_FlightFunctionality_FlightFilters_003 extends TC_GT_FlightFunctionality_FlightFilters_002
{
	@Test(priority = 7)
	public void PriceFilter() throws InterruptedException, IOException
	{
		GTFOR.getFlightPrice().click();
		Thread.sleep(3000);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[2]"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(-60,0).perform();
		Thread.sleep(5000);
		
//		WebElement Slider = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[2]/div/div/div/div[2]"));
//		Thread.sleep(5000);
//		
//		Actions ac = new Actions(driver);
//		//ac.dragAndDropBy(Slider, 0, 150).perform();
//		ac.dragAndDropBy(Slider, 50, 150).perform();
//		Thread.sleep(5000);
	}
	
	@Test(priority = 8)
	public void TimeFilter() throws InterruptedException, IOException
	{
		GTFOR.getTimeButton().click();
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("/html/body/c-wiz[3]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[4]/div/div[2]/div[3]/div/div[1]/section/div[2]/div[1]/div/div/div/div[2]/span/div/div[2]/div/div[2]/div/div/div[3]"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(slider);
		action.moveByOffset(-60,0).perform();
		Thread.sleep(5000);
	
	}
	

}
