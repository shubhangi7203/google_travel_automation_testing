package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_GT_SearchFunctionality_ValidData_001 extends TestBase
{
	@Test
	
	public void main() throws InterruptedException, AWTException
	{
		driver.get("https://www.google.com/travel/");
	    boolean contains = driver.getCurrentUrl().contains("https://www.google.com/travel/");
	    
	    if(contains)
	    {
	        System.out.println("The user is landed on google page");
	    }
	    else
	    {
	        System.out.println("The user is not landed on google page");
	    }
			
			//Search Functionality
		  
		  GTOR.getSearchTextField().sendKeys("Singapore");
		  Thread.sleep(5000);
		  
		  List<WebElement> allItems = GTOR.getAllItems();
			int count = allItems.size();
			System.out.println("The total number of Items ="+count);
			for(WebElement item : allItems)
			{
				System.out.println(item.getText());
			}
			
			Thread.sleep(2000);
			
			Robot robot = new Robot();
			  robot.keyPress(KeyEvent.VK_ENTER);
			  robot.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(5000);
			  
			  
		  
	}
	
	
	

}
