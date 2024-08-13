package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
	
	public ExtentHtmlReporter htmlReport;
	public ExtentReports xReports;
	public ExtentTest xTest;
	
	  public void onStart(ITestContext testContext)
	  {
	    String dateStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	    String repName = "Test-Automation-ProjectReport"+dateStamp+".html";
	    
	    htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
	    
	    htmlReport.config().setDocumentTitle("The Execution Summary Report");
	     htmlReport.config().setReportName("Functional Testing");
	     htmlReport.config().setTheme(Theme.DARK);
	     
	     xReports = new ExtentReports();
	     xReports.attachReporter(htmlReport);
	     xReports.setSystemInfo("QA Name","Shubhangi");
	     xReports.setSystemInfo("QS","WIN10");
	     xReports.setSystemInfo("HostName","localhost");
	     
	  }

	  public void onFinish(ITestContext testContext)
	  {
		  xReports.flush();
	  }

	  public void onTestSuccess(ITestResult tr)
	  {
	   xTest = xReports.createTest(tr.getName());
	   xTest.log(Status.PASS,"Test is passed");
	   xTest.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
  
	  }

	 
	  public void onTestFailure(ITestResult tr)
	  {
		  xTest = xReports.createTest(tr.getName());
		   xTest.log(Status.FAIL,"Test is Failed");
		   xTest.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		   xTest.log(Status.FAIL,tr.getThrowable());  
		   
		   String sspath = System.getProperty("user.dir")+"/Screenshots/"+tr.getName()+ ".png";
		   File path = new File(sspath);
		   if(path.exists())
		   {
			   try
			   {
			   xTest.fail("Screenhot failed test is : "+ xTest.addScreenCaptureFromPath(sspath));
					   
		   }catch(IOException e)
			   {
			   e.printStackTrace();
			   }
		   
		   }
	  }

	  public void onTestSkipped(ITestResult tr) {
	   
		  xTest = xReports.createTest(tr.getName());
		   xTest.log(Status.SKIP,"Test is Skipped");
		   xTest.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.BLUE));
		   xTest.log(Status.SKIP,tr.getThrowable());
	  }

}
