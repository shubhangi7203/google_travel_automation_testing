package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_GT_SearchFunctionality_InvalidData_002 extends TestBase
{
@Test
	
	public void main() throws InterruptedException, AWTException, IOException
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
		  
		  GTOR.getSearchTextField().sendKeys("q93487iedhfksdjnsxc");
		  Thread.sleep(2000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(5000);
	
		  if(contains) {
			  
			  CaptureScreenshot(driver, "SearchFunctionality");
	            System.out.println("Entered Item is InValid");
	            Assert.assertTrue(contains);
	        }else {
	            System.out.println("Entered Item is Valid");
	            Assert.assertTrue(contains);
	        }
		  
		 
		  
		  
	}

}
