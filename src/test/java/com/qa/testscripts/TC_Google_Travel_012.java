package com.qa.testscripts;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Google_Travel_012 extends TestBase
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
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		GTOR.getMenu().click();
		Thread.sleep(5000);
		
		GTOR.getFeedBack().click();
		String Feedback = GTOR.getFeedBack().getText();
		System.out.println(Feedback);
		//Assert.assertEquals("back", Feedback);
		Thread.sleep(2000);
		
	//	int size = driver.findElements(By.tagName("iframe")).size();
	//	System.out.println(size);
//		for (int i=0;i<=size;i++)
//		{
//			driver.switchTo().frame(i);
//			int total = driver.findElements(By.xpath("/html/body/div[1]/div/sc-shared-material-popup/div/div/div/uv-feedback-feedback-manager/div/div/div[2]/uv-feedback-form/div/div[3]/div[2]/div/div[2]/sc-shared-material-button/div/button")).size();
//			System.out.println(total);
//			driver.switchTo().defaultContent();
//		
//		}
////	
//		driver.switchTo().frame("1");
//		Thread.sleep(2000);
//		GTOR.getCaptureScreenshot().click();
//		Thread.sleep(2000);
	
	}

	

}
