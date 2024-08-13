package com.qa.testscripts;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.GoogleExplorePage;
import com.qa.pages.GoogleHotelPage;
import com.qa.pages.GoogleTravelFlightPage;
import com.qa.pages.GoogleTravelPage;
import com.qa.pages.MMTPage;

//import io.github.bonigarcia.wdm.WebDriverManager;

        public class TestBase
        {
        	
        WebDriver driver;
        MMTPage MMTOR;
        GoogleTravelPage GTOR;
        GoogleExplorePage GTEOR;
        GoogleTravelFlightPage GTFOR;
        GoogleHotelPage GTHOR;
        JavascriptExecutor Js;
        TakesScreenshot TS;
       
        FileInputStream fileLoc;
        Properties prop;
        
        
        @BeforeClass
        @Parameters({"Url"})
        public void setUp(String url) throws IOException
        {
        fileLoc=new FileInputStream("C:\\Users\\SHUBHANGIPATIL\\eclipse-workspace\\SDET_Assignment_ProblemStatement_3\\src\\test\\java\\com\\qa\\testdata\\Credentials.property");
        prop=new Properties();
        prop.load(fileLoc);
        
        System.setProperty("webdriver.edge.driver","C:\\Users\\SHUBHANGIPATIL\\OneDrive - Virtusa\\Desktop\\Driver Executable\\edgedriver_win64 (5)\\msedgedriver.exe");
        //WebDriverManager.chromedriver().setup(); 
        driver =new EdgeDriver();
        
		//EdgeOptions opt = new EdgeOptions();
		//opt.addArguments("--disable.popup-blocking");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(EdgeOptions.CAPABILITY, opt);
        
		//WebDriver driver= new ChromeDriver();
        Js = (JavascriptExecutor)driver;
        
        MMTOR=new MMTPage(driver);
        //driver.get(url);
        GTOR= new GoogleTravelPage(driver);
        GTFOR=new GoogleTravelFlightPage(driver);
        GTHOR= new GoogleHotelPage(driver);
        GTEOR =new GoogleExplorePage(driver);
        
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
        //String s= cdriver.getTitle();
        }
        @AfterClass
        public void terminate()
        {
        driver.close();
        driver.quit();
        }
        
        public void CaptureScreenshot(WebDriver driver, String tName) throws IOException {
          TakesScreenshot ts = (TakesScreenshot)driver; 
          File Src = ts.getScreenshotAs(OutputType.FILE);
          File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
		  FileUtils.copyFile(Src, target); 
		  }
        }