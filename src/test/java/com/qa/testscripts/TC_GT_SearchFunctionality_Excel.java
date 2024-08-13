package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_GT_SearchFunctionality_Excel extends TestBase
{
	@Test
	(dataProvider = "getData")
	  public void SearchItem (String SearchDestinations) throws InterruptedException, AWTException
		
		{
		GTOR.getSearchTextField().sendKeys(SearchDestinations);
		Thread.sleep(2000);
		  
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		// Call the JavascriptExecutor methods
			Js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			
			System.out.println("Description of Sight.............");
			String Description= GTOR.getAbout()
					.getText();
			System.out.println(Description);
			Thread.sleep(4000);
		  
		  driver.navigate().back();
		  Thread.sleep(3000);
		  
		}
	
	@DataProvider
	public String[][] getData() throws IOException
	{
	  String xFile = "C:\\Users\\SHUBHANGIPATIL\\eclipse-workspace\\SDET_Assignment_ProblemStatement_2\\src\\test\\java\\com\\qa\\testdata\\TravelTestData.xlsx";
	  String xSheetName = "Sheet1";
	  
	  int rowCount = ExcelUtility.getRowCount(xFile, xSheetName);
	  int cellCount = ExcelUtility.getCellCount(xFile, xSheetName, rowCount);
	  
		  String[][] data = new String[rowCount][cellCount];
	  
	  for(int i=1;i<=rowCount;i++)
	  {
		  for(int j=0;j<cellCount;j++)
		  {
			  data[i-1][j] = ExcelUtility.getData(xFile, xSheetName, i, j);
		  }
	  }

				return data;
				
	}
	

}
