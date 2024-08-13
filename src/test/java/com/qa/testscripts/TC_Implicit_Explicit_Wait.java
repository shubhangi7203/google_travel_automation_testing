package com.qa.testscripts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TC_Implicit_Explicit_Wait
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\SHUBHANGIPATIL\\OneDrive - Virtusa\\Desktop\\Driver Executable\\edgedriver_win64 (3)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//WebDriverWait w = new WebDriverWait(driver, 10);
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));


	        
	        int j=0;
	        
	        String[] IteamNeeded = {"cucumber","Brocoli","Beetroot"};
	        
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	        
	        Thread.sleep(2000);
	        addItems(driver,IteamNeeded);

	        driver.findElement(By.cssSelector("img[alt='Cart']")).click();

	        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



	        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

	        driver.findElement(By.cssSelector("button.promoBtn")).click();

	        //explicit wait



	        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

	        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


	        
	}

	private static void addItems(WebDriver driver, String[] IteamNeeded) 
		{

			int j=0;

			List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

			for(int i=0;i<products.size();i++)

			{

			//Brocolli - 1 Kg

			//Brocolli,    1 kg

			String[] name=products.get(i).getText().split("-");

			String formattedName=name[0].trim();

			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(IteamNeeded);

			if(itemsNeededList.contains(formattedName))

			{

			j++;

			//click on Add to cart

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if(j==IteamNeeded.length)

			{

			break;

			}

			}

			}
			}
	
	
		

	}
	
	
	
	
